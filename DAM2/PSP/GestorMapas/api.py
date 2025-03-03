from flask import Flask, jsonify, request # Librerías necesarias
from flask_cors import CORS, cross_origin # Para permitir peticiones cross-domain
from JGVutils import MySQLConnection # Para conectarse a una base de datos MySQL

# Creación de la API, las políticas CORS
api = Flask(__name__)
cors = CORS(api)
# Escapa carácteres especiales y los imprime
api.config["JSON_AS_ASCII"] = False
# Conexión con la base de datos utilizando XAMPP
base = MySQLConnection("localhost", 3306, "cod", "root", "")

# Obtener todos los mapas
@api.route("/mapas/", methods=["GET"])
def getMapas():
    # Si se puede realizar ejecuciones con la base de datos
    if base.is_database_connection():
        # Devuelve todas las filas formateadas en JSON
        return jsonify(base.execute_query("SELECT * FROM mapas"))
    else:
        # Imprime un mensaje de error
        return jsonify([{"mensaje":"error"}])

@api.route("/mapas/<id>", methods=["GET"])
def getMapa(id):
    # Si se puede realizar conexiones con la base de datos
    if base.is_database_connection():
        # Devuelve la consulta con filtro
        return jsonify(base.execute_query("SELECT * FROM mapas WHERE id = %s", [id]))
    else:
        # Mensaje de error
        return jsonify([{"mensaje":"error"}])

@api.route("/insertarMapa/", methods=["POST"])
def insertarMapa():
    # Obtener los datos JSON
    datos = request.get_json()
    # Verificar que existe conexión y los valores de las claves en los datos
    if base.is_database_connection() and ("id" in datos) and ("nombre" in datos) and ("descripcion" in datos) and ("imagen" in datos):
        try:
            # Ejecutar una query para insertar datos
            base.execute_query("INSERT INTO mapas VALUES (%s, %s, %s, %s)", [datos["id"], datos["nombre"], datos["descripcion"], datos["imagen"]])
            return jsonify([{"mensaje":"Mapa insertardo"}])
        except Exception:
            # Mensaje de error
            return jsonify([{"mensaje":"error"}])
    else:
        # Mensaje de error
        return jsonify([{"mensaje":"error"}])

@api.route("/modificarMapa/", methods=["PUT"])
def modificarMapa():
    # Obtiene los datos JSON
    datos = request.get_json()
    try:
        # Si existe el id, el nombre nuevo, y conexión con la base de datos
        if "id" in datos and "nombre" in datos and base.is_database_connection():
            # Ejecuta una query de modificación y envía un mensaje
            base.execute_query("UPDATE mapas SET nombre = %s WHERE id = %s", [datos["nombre"], datos["id"]])
            return jsonify([{"mensaje":"Mapa modificado"}])
        else:
            # Devolver un mensaje de error
            return jsonify([{"mensaje":"No existe ID"}])
    except:
        # Devolver un mensaje de error
        return jsonify([{"mensaje":"error"}])

# Eliminar un mapa de la base de datos
@api.route("/eliminarMapa/", methods=["DELETE"])
def eliminarMapa():
    datos = request.get_json()
    try:
        # Verifica si se puede establecer la conexión con la base de datos
        if base.is_database_connection():
            # Se elimina el mapa con el ID especificado de la base de datos
            base.execute_query("DELETE FROM mapas WHERE ID = %s", [datos["id"]])
            # Se retorna una respuesta con un mensaje de éxito
            return jsonify([{"mensaje":"Mapa eliminado"}])
        
        # Si no se puede establecer la conexión con la base de datos, se retorna un mensaje de error
        else:
            return jsonify([{"mensaje":"error"}])

    # Si ocurre alguna excepción, se retorna un mensaje de error
    except Exception:
        return jsonify([{"mensaje":"error"}])
