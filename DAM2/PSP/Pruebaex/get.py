from flask import Flask, jsonify

app = Flask(__name__)

@app.route('/', methods=['GET'])
def home():
    return jsonify({'message': 'Hello, World!'})

if __name__ == '__main__':
    app.run(debug=True)
#Devolver una lista de elementos:
@app.route('/items', methods=['GET'])
def get_items():
    items = [{'id': 1, 'name': 'Item 1'},
             {'id': 2, 'name': 'Item 2'},
             {'id': 3, 'name': 'Item 3'}]
    return jsonify({'items': items})
#Aceptar parámetros en la solicitud GET:

@app.route('/items/<int:item_id>', methods=['GET'])
def get_item(item_id):
    item = {'id': item_id, 'name': 'Item ' + str(item_id)}
    return jsonify({'item': item})
#Devolver una respuesta basada en el contenido del encabezado de la solicitud:

@app.route('/items', methods=['GET'])
def get_items_based_on_header():
    user_agent = request.headers.get('User-Agent')
    if user_agent.startswith('Mozilla'):
        items = [{'id': 1, 'name': 'Item 1'},
                 {'id': 2, 'name': 'Item 2'},
                 {'id': 3, 'name': 'Item 3'}]
        return jsonify({'items': items})
    else:
        return jsonify({'message': 'Bad Request'}), 400
#Con split
@app.route('/items/<string:ids>', methods=['GET'])
def get_items(ids):
    item_ids = ids.split(',')
    items = []
    for item_id in item_ids:
        item = {'id': int(item_id), 'name': 'Item ' + item_id}
        items.append(item)
    return jsonify({'items': items})



#diccionarios index
from flask import Flask, jsonify

app = Flask(__name__)

def function(string:str):
    texto=string.split("\n") #Dividir el texto en personas (siempre separadas con un \n)
    dict_nif={}
    for persona in texto:       
        dict_persona={}
        datos=persona.split(";") #Dividir cada persona en sus diferentes datos(siempre separados con un ;)
        #Declaracion de variables para guardar los datos de la persona (salvo el nif que estará un nivel por encima)
        nif=None
        nombre=None
        email=None
        telefono=None
        descuento=None
        for idx,dato in enumerate(datos): 
            #Iteramos sobre cada uno de los datos y los guardamos en sus respectivas variables
            #Diferenciamos el dato a guardar en funcion del indice
            if idx == 0:
                nif=dato
            if idx == 1:
                nombre=dato
            if idx == 2:
                email=dato
            if idx == 3:
                telefono=dato
            if idx == 4:
                descuento=dato
        #Añadimos los datos al diccionario correspondiente a la persona con nif X
        dict_persona["nombre"] = nombre
        dict_persona["email"] = email
        dict_persona["telefono"] = telefono
        dict_persona["descuento"] = descuento
        #Añadimos el diccionario con los datos de la persona al diccionario de nifs
        dict_nif[nif] = dict_persona
    return dict_nif

@app.route('/personas', methods=['GET'])
def get_personas():
    string = "01234567L;LuisGonzalez;luisgonzalez@mail.com;656343576;12.5\n71476342J;MacarenaRamirez;macarena@a.com;6943321;8"
    personas = function(string)
    return jsonify(personas)

if __name__ == '__main__':
    app.run(debug=True)