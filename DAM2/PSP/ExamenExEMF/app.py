from flask import Flask, request, jsonify
import re

app = Flask(__name__)
 # Lista para almacenar los empleados
employees = [
    {
        'dni': '01234567L',
        'name': 'Luis Gonzalez',
        'email': 'luisgonzalez@mail.com',
        'phone': '655343576'
    },
    {
        'dni': '74476342J',
        'name': 'Macarena Ramirez',
        'email': 'macarena@mail.com',
        'phone': '692839321'
    },
    {
        'dni': '63823376M',
        'name': 'Juan José Martinez',
        'email': 'Luanio@mail.com',
        'phone': '664888233'
    }
]
 

@app.route('/add-users', methods=['POST'])
def add_users():
    data = request.get_json()  # Obtener el JSON enviado desde el front-end
    new_employees = []  # Lista para almacenar los nuevos empleados válidos
    errors = []  # Lista para almacenar los DNIs de los empleados con errores
    for employee_data in data.split(':'):  # Iterar por cada empleado
        employee = {}
        try:
            # Separar los datos del empleado
            dni, name, email, phone = employee_data.split('.')
            employee['dni'] = dni
            employee['name'] = name.replace(' ', '')  # Eliminar espacios en el nombre
            employee['email'] = email
            employee['phone'] = phone
            # Validar el email y el teléfono del empleado
            if not re.match(r"[^@]+@[^@]+\.[^@]+", employee['email']) or not re.match(r'^\d{9}$', employee['phone']):
                raise ValueError()  # Si no se cumplen las condiciones, lanzar una excepción
            new_employees.append(employee)  # Si todo está correcto, agregar el empleado a la lista de nuevos empleados
        except ValueError:
            errors.append(dni)  # Si hay errores, agregar el DNI del empleado a la lista de errores
    if len(errors) > 0:
        response = {
            'n_errors': len(errors),  # Número total de errores
            'errors': errors  # Lista de DNIs de los empleados con errores
        }
    else:
        employees.extend(new_employees)  # Agregar los nuevos empleados a la lista existente
        response = {
            'n_errors': 0,  # No hay errores
            'errors': None  # La lista de errores está vacía
        }
    return jsonify(response)  # Devolver la respuesta en formato JSON

@app.route('/get-users', methods=['GET'])
def get_users():
    experience = request.args.get('experience')
    if experience:
        experienced_employees = []
        for employee in employees:
            if employee.get('experience', 0) >= int(experience):
                experienced_employees.append(employee)
        response = experienced_employees
    else:
        response = employees
    return jsonify(response)

if __name__ == '__main__':
    app.run()
