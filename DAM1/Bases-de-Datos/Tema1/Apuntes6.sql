CONCAT
(str1,str2) devuelve la cadena, si uno de los argumentos es null devuelve null


CONCAT_WS
(separador, str1, srt2) El primer argumento se mete entre todas las str.

ELT
(N, str1, str2, str3) Switch siendo N el case, si N = 1 devuelve str1

UCASE/UPPER
(str) devuelve str con todos los caracteres en mayusculas

SUBSTRING
(str, pos) devuelve la cadena cortada desde la pos.

LTRIM
(str) devuelve srt pegado a la izquierda

RTRIM
(str) devuelve srt pegado a la derecha

TRIM
([{BOTH | LEADING | TRAILING} [remstr] FROM] str) devuelve srt con el sufijo/LEADING o prefijo/TRAILING quitado especificado con remstr

TRIM
(remstr FROM] str) version simple, quita de str lo especificado en remsrt

LOCATE
(substring, str) devuelve la posicion de la substring en str

POSITION
(substring IN str) devuelve la posicion de la substring en str

LENGTH
(str) devuelve la longitud de la cadena

REPLACE
(str,from_str,to_str) devuelve str reemplazando los from_str con to_str

REVERSE
(str) invierte los caracteres y los devuelve

POW
(X,Y) devuelve el valor de x a la potencia de Y

ROUND
(X,D) devuelve X redondeando al entero, D son decimales.

TRUNCATE
(X,D) devuelve X truncado a D decimales

FLOOR
(X) devuelve el valor entero más grande no mayor a X

CEILLING:
devuelve el entero más pequeño no menor a x

NOW
() devuelve laa fecha y hora actual, YYYY-MM-DD
HH:
MM:
SS

DATE
(expr) Extrae la parte de fecha de expr

CURDATE
() devuelve la fecha actual

CURTIME
() devuelve la hora actual

LPAD
(str,len,padstr) devuelve srt alineado a la izquierda con padstr a una longitud de len

RPAD
(srt,len,padstr) devuelve str alineade a la derecha con padstr a una longitud de len

DATEDIFF
(expr,expr2) devuelve el número de dias entre las dos expresiones, positivo o negativo

FORMAT
(X,D) devuelve el nº X con formato redondeado a D

DAYOFWEEK
(date) devuelve el nombre del día de la semana en date empieza en domingo

WEEKDAY igual pero empieza en lunes, siendo este 0 como array

DAYOFMONTH o DAY
(date) Devuelve el día del mes para date

DAYNAME(date)
Devuelve el día de la semana en ingles

MONTHNAME(date)
Devuelve el nombre del mes en ingles

QUARTER
(date) devuelve el trimestre de date

ADDDATE
(expr,days) añade la expresion de fecha y hora expr el nº de dias en days

TIME_TO_SEC
(time) devuelve time en segundos

ABS
(X) devuelve el valor absoluto de X

FIELD
(str,str1,str2...) devuelve el indice de srt en la lista str1 etc... si no encuentra devuelve 0