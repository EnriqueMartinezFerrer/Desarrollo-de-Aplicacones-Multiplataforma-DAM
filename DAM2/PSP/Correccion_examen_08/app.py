from flask import Flask
from flask import request
from flask import Response
import json
import mysql.connector

app = Flask(__name__)

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

@app.route('/registro', methods=['POST'])
def register_users():
    data = json.loads(request.data.decode('0utf-8'))
    # URL: ?nombre=algo&fecha=tanto&correo=@
    print(data)
    return ""
    pass

@app.route('/getUsers')
def get_all_users():
    # TODO: Llamada a base de datos
    cnx = mysql.connector.connect(
        user = credentials["username"],
        password = credentials["password"],
        host = credentials["host"],
        database = credentials["dbname"]
    )

    # Create a cursor
    cursor = cnx.cursor()
    query = "SELECT * FROM new_table"
    # Execute the SELECT query
    cursor.execute(query)

    rows = cursor.fectchall()
    for row in rows:
        print(row)

    cursor.close()
    cnx.close()

    return mock_data

@app.route('/user/<id>')
def get_user(id):
    id = int(id)
    # Recorremos mock data
    for user in mock_data:
        if user['id'] == id:
            return user
    return "Not found" # TODO: Error 404

    # TODO: query a base de datos con el id

@app.route('/login',methods=['POST'])
def login():
    data = json.loads(request.data.decode('utf-8'))
    # TODO: query a base de datos
    for user in mock_data:
        if user['username'] == data['username'] and user['password'] == data['password']:
            print("Aut")
            return 'ok'

    print("No aut")
    return Response('Unauthorized', status=401)