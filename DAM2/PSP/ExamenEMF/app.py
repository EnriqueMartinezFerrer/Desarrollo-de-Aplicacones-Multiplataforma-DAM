from flask import Flask, jsonify, request # Librerías necesarias
from flask_cors import CORS, cross_origin # Para permitir peticiones cross-domain
from JGVutils import MySQLConnection # Para conectarse a una base de datos MySQL
import re

# Creación de la API, las políticas CORS
app = Flask(__name__)
cors = CORS(app)
# Escapa carácteres especiales y los imprime
app.config["JSON_AS_ASCII"] = False

regex_mail = re.compile('^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$')
def isValid(email):
    if re.fullmatch(regex_mail,email):
        return True
    else:
        return False

class Validaciones:
    REGEXP = "[0-9]{8}[A-Z]"
    DIGITO_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE"
    INVALIDOS = {"00000000T", "00000001R", "99999999R"}

    def __init__(self):
        pass

    def validar_dni(self, dni: str) -> bool:
        return dni not in self.INVALIDOS and re.match(self.REGEXP, dni) is not None  and dni[8] == self.DIGITO_CONTROL[int(dni[0:8]) % 23] 

# Escapa carácteres especiales y los imprime
app.config["JSON_AS_ASCII"] = False
# Conexión con la base de datos utilizando XAMPP
base = MySQLConnection("localhost", 3306, "CEO", "root", "")
 
# Obtener todos los empleados
@app.route("/get-users/", methods=["GET"])
def getUsers():
    # Si se puede realizar ejecuciones con la base de datos
    if base.is_database_connection():
        # Devuelve todas las filas formateadas en JSON
        return jsonify(base.execute_query("SELECT * FROM empleados"))
    else:
        # Imprime un mensaje de error
        return jsonify([{"mensaje":"error"}])
    

@app.route("/add-users/", methods=['POST'])
def registro():
     # Obtener los datos JSON
    datos = request.get_json()
    # Verificar que existe conexión y los valores de las claves en los datos
    if base.is_database_connection() and ("dni" in datos) and ("nombre" in datos) and ("email" in datos) and ("numero" in datos) and ("experiencia" in datos) :
        try:
            # Ejecutar una query para insertar datos
            base.execute_query("INSERT INTO empleado VALUES (%s, %s, %s, %s, %s)", [datos["dni"], datos["nombre"], datos["email"], datos["numero"], datos["experiencia"]])
            return jsonify([{"mensaje":"Empleado insertardo"}])
        except Exception:
            for dni in datos:
                if datos["dni"]==dni:
                    return "error ya existe"
                if not Validaciones().validar_dni(dni):
                    return "Formato dni incorrecto"
            # Mensaje de error
            return jsonify([{"mensaje":"error"}])
    else:
        # Mensaje de error
        return jsonify([{"mensaje":"error"}])
@app.route("/delete-user/", methods=["DELETE"])
def eliminarEmpleado():
    datos = request.get_json()
    try:
        # Verifica si se puede establecer la conexión con la base de datos
        if base.is_database_connection():
            # Se elimina el empleado con el DNI especificado de la base de datos
            base.execute_query("DELETE FROM empleados WHERE DNI = %s", [datos["DNI"]])
            # Se retorna una respuesta con un mensaje de éxito
            return jsonify([{"mensaje":"Empleado eliminado"}])
        
        # Si no se puede establecer la conexión con la base de datos, se retorna un mensaje de error
        else:
            return jsonify([{"mensaje":"error"}])

    # Si ocurre alguna excepción, se retorna un mensaje de error
    except Exception:
        return jsonify([{"mensaje":"error"}])
    
@app.route("/get-users7/<experiencia>", methods=["GET"])
def getEmpleado(experiencia):
    # Si se puede realizar conexiones con la base de datos
    if base.is_database_connection():
        # Devuelve la consulta con filtro
        return jsonify(base.execute_query("SELECT * FROM mapas WHERE id = %s", [experiencia]))
    else:
        # Mensaje de error
        return jsonify([{"mensaje":"error"}])

@app.route("/update-user/", methods=["PUT"])
def modificarEmpleado():
    # Obtiene los datos JSON
    datos = request.get_json()
    try:
        # Si existe el dni, el nombre nuevo, y conexión con la base de datos
        if "dni" in datos and "nombre" in datos and "email" in datos and "numero" in datos and base.is_database_connection():
            # Ejecuta una query de modificación y envía un mensaje
            base.execute_query("UPDATE empleados SET nombre = %s WHERE dni = %s", [datos["nombre"], datos["dni"]])
            return jsonify([{"mensaje":"Empleado modificado"}])
        else:
            # Devolver un mensaje de error
            return jsonify([{"mensaje":"No existe DNI"}])
    except:
        # Devolver un mensaje de error
        return jsonify([{"mensaje":"error"}])
