from collections import defaultdict
#Importo unidecode así elimina caracteres especiales en las vocales
from unidecode import unidecode
def vocales(texto):
    #hacemos el texto minúsculas para no rellenar el array
    texto = texto.lower()
    #Creamos dos arrays uno con las vocales y otro para el espacio en el que se encuentra
    vocales = ["a","e","i","o","u"]
    #Array para contar las veces que sale cada letra
    rep = [0,0,0,0,0]
    #Leer el texto
    for x in texto:
        if x in vocales:
            #Sumar 1 en el espacion de la vocal leida
            rep[vocales.index(x)]+=1   
    #Sacar la vocal más repetida
    VocalRep = rep.index(max(rep))
    #Si no hay vocales no returnea nada
    if  VocalRep==0:
        return("")
    return vocales[VocalRep]
    
   
print(vocales("rtt"))