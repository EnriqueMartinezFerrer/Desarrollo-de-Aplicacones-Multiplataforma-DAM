from flask import Flask
application = Flask(__name__)
@application.route('/<username>')
def getusername(username):
    return username
@application.post('/newuser')
def getnewuser():
    diccionario = {
        'nombre': 'Guille',
        'apellidos': 'Huevon'
    }