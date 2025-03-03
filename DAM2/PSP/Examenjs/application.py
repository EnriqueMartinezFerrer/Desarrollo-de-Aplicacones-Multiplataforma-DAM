from flask import Flask
from flask import request
from flask import Response
import json
application = Flask(__name__)
mock_data = [
    {
    "id":1,
    "username":"1",
    "email":"",
    "date_birth":"",
    "password":""
    },
    {
    "id":2,
    "username":"1",
    "email":"",
    "date_birth":"",
    "password":""
    },
    {
    "id":3,
    "username":"1",
    "email":"",
    "date_birth":"",
    "password":""
    }
]

credentials = {
    "username":"admin",
    "password":"",
    "dbname":"database-1",
    "host": "database.com"
}

@application.route('/login',methods=['GET','POST'])
def login():
    #Recogemos la data
    data = request.get_json()
    #Comprobar usuarios en el login
    for user in mock_data:
        if user['username'] == data['username'] and user['password'] == data['password']:
            print("Aut")
            return 'ok'

    print("No aut")
    return Response('Unauthorized', status=401)
#Hacemos ruta
@application.route('/get-user')
def get_user():
    #query para la ruta 
    id = request.args.get('id')
    id = int(id)
    # Recorremos mock data
    for user in mock_data:
        if user['id'] == id:
            return user
    #Returneamos el error con su status
    print("No encontr")
    return Response('Not found', status=404)
"""application.route('/new-user')
def new_user():
    for user in mock_data:
        if user['username'] == username:
            return Response('Alredy exist', status=405)
        if user['password'] == password
        def validoDNI(dni):
    tabla = "TRWAGMYFPDXBNJZSQVHLCKE"
    dig_ext = "XYZ"
    reemp_dig_ext = {'X':'0', 'Y':'1', 'Z':'2'}
    numeros = "1234567890"
    dni = dni.upper()
    if len(dni) == 9:
        dig_control = dni[8]
        dni = dni[:8]
        if dni[0] in dig_ext:
            dni = dni.replace(dni[0], reemp_dig_ext[dni[0]])
        return len(dni) == len([n for n in dni if n in numeros]) \
            and tabla[int(dni)%23] == dig_control
    return False
    return"""

    
@application.route('/get-all-users')
def get_all_users():
    mock_data(
        user = credentials["username"],
        password = credentials["password"],
        host = credentials["host"],
        database = credentials["dbname"]
    )
    return mock_data