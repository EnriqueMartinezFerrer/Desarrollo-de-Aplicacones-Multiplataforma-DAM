from flask import Flask
application = Flask(_name_)

@application.route('/')
def hellow_world():
    return "<h1>Hellow worllld</h1>"

@application.route('/Usuarios/<username>')
def return_username(username):
    return username
python3 -m venv env
call env/Scripts/activate
pip install -r requirements.txt
flask --app application.py --debug run