from flask import Flask, jsonify
from flask import request

app = Flask(__name__)
diccionario_db = {
    'nombre': '',
    'fechaDeNacimiento': '',
    'gmail': '',
    'id': ''
  
}
from flask import Flask
application = Flask(__name__)
#Ruta para mostrar usuarios
@app.route('/<username>')
def getusername(username):
    return username
@app.post('/registro')
def getnewuser():
    diccionario = {
        'nombre': request.form('nombre'),
        'fechaDeNacimiento': request.form('fechaNacimiento'),
        'gmail': request.form('gmail')
    }
    return 'getnewuser'
    #muestra los detalles
@app.route('/detalles')
def detalles():
    
    nombre = diccionario_db.get('nombre')
    fechaDeNacimiento = diccionario_db.get('fechaDeNacimiento')
    gmail = diccionario_db.get('gmail')
@app.route('/autenticación')
def autenticación():
    return autenticación
@app.route('/', methods=['GET'])
def search():
    args = request.args
    nombre = args.get('nombre')
    fecha = args.get('fecha')
    gmail = args.get('gmail')
app.route('/user/<id>')
def get_user(id):
    #Recorremos mock data
    for nombre in diccionario_db:
        if nombre[id] == id:
            return nombre

@app.route('/', methods=['GET'])
def search():
    args = request.args
    nombre = args.get('nombre')
    fecha = args.get('fecha')
    gmail = args.get('gmail')  
    for nombre,fechaDeNacimiento,gmail in diccionario_db:
    # filtra los usuarios por los que cumplen las condiciones
        if None not in (nombre, fechaDeNacimiento, gmail):
            result = {key: value for key, value in db_users.items() if key == nombre and value == fecha and value == gmail}
        elif nombre is not None:
            result = {key: value for key, value in db_users.items() if key == nombre}
        elif fecha is not None:
            result = {key: value for key, value in db_users.items() if value == fecha}
        elif gmail is not None:
            result = {key: value for key, value in db_users.items() if value == gmail}

    return result