from flask import Flask, jsonify

app = Flask(__name__)

@app.route("/<username>")
def getUsername(username):
    return username

@app.post("/newuser")
def getnewuser():
    diccionario = {
        "nombre": "kike,"
        "apellido:" "perez"
    }
    return "ok"





