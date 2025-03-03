import time;
from datetime import datetime;
from random import choice;



premios = ["Dinero",
           "Un día en el gym",
           "Un perro",
           "Un gato",
           "No se me ocurre nada más",
        ];


def seconds2strtime(seconds):
    #usado para mostrar el tiempo corrido de fechas, no diario

    days, seconds = seconds//(60*60*24), seconds%(60*60*24);
    hours, seconds = seconds//(60*60), seconds%(60*60);
    mins, seconds = seconds//60, seconds%60;

    return "%d dias, %d horas %02d segundos" % (days, hours, mins);


def pedirRegaloDeMoure(dtNowUTC):

    """
    Gestiona regalos del calendario aDEViento
    
    dtNowUTC: es una clase "datetime" en UTC (GMT+0)
    devuelve tupla de dos valores:
    Debemos comprobar si la funcion devuelve regalo para gestionar a que se debe el tiempo devuelto             
    """

    #la corregimos al horario de españa GMT+1, agregando 1hs:
    #dtime.hour += 1; #<- no se puede, es readonly
    dtNowUTC = datetime.fromtimestamp(dtNowUTC.timestamp()+(60*60));

    #definimos la fecha del evento aDEViento:
    startEventDatetime = datetime(2022, 12, 1, 0, 0, 0);  #1 de diciembre
    endEventDatetime = datetime(2022, 12, 24, 0, 0, 0);   #24 de diciembre

    #convertimos toda dos fechas a formato segundos:
    nowSecs = dtNowUTC.timestamp();
    startSecs = startEventDatetime.timestamp();
    endSecs = endEventDatetime.timestamp();


    #comprobamos si no hemos llegado a la fecha del evento:
    if nowSecs < startSecs:
        diffStart = startSecs-nowSecs;
        return (None, "evento no ha empezado, falta %s." % seconds2strtime(diffStart));

    #comprobamos si el evento ha terminado de fecha:
    elif nowSecs > endSecs:
        diffEnd = nowSecs-endSecs;
        return (None, "evento terminado, ha pasado %s." % seconds2strtime(diffEnd));

    #el evento esta on aun, obtenemos los segundos que faltan para que termine:
    eventEndSecs = datetime(dtNowUTC.year, dtNowUTC.month, dtNowUTC.day+1).timestamp()  -  nowSecs;

    return (choice(premios), "evento terminara en %s" % time.strftime("%H:%M:%S", time.gmtime(eventEndSecs)));



print("El programa imprime el premio por el dia de aDEViento:")


#obtenemos hora GMT+0 (utc):    
currentDatetime = datetime.utcnow();
premio, msgtiempo = pedirRegaloDeMoure(currentDatetime);


if premio:
    print("Felicidades! el premio es", premio);
    print(msgtiempo);
else:
    print("No hay premio.");
    print(msgtiempo);


print("Fin del programa, saludos a MoureDev");

#RearlanFDX