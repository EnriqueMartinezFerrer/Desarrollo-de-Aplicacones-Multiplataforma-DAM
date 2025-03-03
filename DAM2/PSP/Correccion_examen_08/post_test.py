import requests
import json

my_data = {
    "username":"Enrique",
    "password":"contraseña123"
}

req = requests.post("http://127.0.0.1:5000/registror", data=json.dumps(my_data))
print(req)