d1 = float(input("Introduce un número: ") )
d2 = float(input("Introduce un segundo número: ") )

opcion = 0
while True:
    print("""
    ¿Elige operación?
    
    1) Sumar.
    2) Restar.
    3) Multiplicar.
    4) Cambiar los números.
    5) Apagar calculadora.
    """)
    opcion = int(input("Elige opción: ") )     

    if opcion == 1:
        print(" ")
        print("RESULTADO: ",d1,"+",d2,"=",d1+d2)
   
    elif opcion == 2:
        print(" ")
        print("RESULTADO: ",d1,"-",d2,"=",d1-d2)
    
    elif opcion == 3:
        print(" ")
        print("RESULTADO: ",d1,"*",d2,"=",d1*d2)
    
    elif opcion == 4:
        d1 = float(input("Introduce un número: ") )
        d2 = float(input("Introduce un segundo número: ") )
    elif opcion == 5:
        break
    else:
        print("ERROR")