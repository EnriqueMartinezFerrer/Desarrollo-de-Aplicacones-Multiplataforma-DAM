from flask import Flask
application = Flask(__name__)

@application.route('/')
def hellow_world():
    return "<h1>Hellow worllld</h1>"