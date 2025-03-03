import csv, smtplib, ssl
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText

#Importar las librerías

fila=[]

#Procedimiento para ver las filas que nos interesan del csv
with open('Ejercicio_Gmail_EMF.csv') as csv_file:
    csv_reader = csv.reader(csv_file, delimiter=';')
    line_count = 0
    for row in csv_reader:
        if line_count == 3:
            fila=(str(row))
        else:
            line_count += 1
 
#Se crea un array de cadenas y eliminamos los caracteres sobrantes
fila=fila.replace("'","")
fila=fila.split(",")

#Asignamos una variable a cada campo necesario. en este caso queremos conocer el DESTINATARIO, DESCRIPCION DEL CORREO, Y CUERPO DEL CORREO
Para=fila[1]
Asunto=fila[2]
cuerpo=fila[3]

#Hacemos el setup del correo y su protocolo de envio
port = 465 
smtp_server = "smtp.gmail.com"
sender_email = "kikemf2003@gmail.com"
receiver_email = Para

#Contraseña para poder enviar correos desde python
password = "ICARISSS"
msg=MIMEMultipart()
message = cuerpo
msg['Subject']=descripcion
msg.attach(MIMEText(message+"\nBuenos dias, me falta solo el busca minas", 'plain'))
context = ssl.create_default_context()

#Metodo para enviar el correo.
with smtplib.SMTP_SSL(smtp_server, port, context=context) as server:
    #Logear en tu correo
    server.login(sender_email, password)
    #Enviar email
    server.sendmail(sender_email, receiver_email, msg.as_string())
