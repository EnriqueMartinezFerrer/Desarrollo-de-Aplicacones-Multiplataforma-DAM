//Tema 2. Ejercicio 70

import fsg.in;

class Ejercicio70 {
   public static void main(String[] args){
      int opcion = 0; //Se fija una opción
      
      do {
         in.cls();                           //Se limpia la pantalla
         dibujarMenu();                      //Se dibuja el menu
         opcion = in.leerInt(" OPCION: ");   //El usuario escribe una opción
         
         //Dependiendo del número, se realizará una operación determinada
         switch(opcion){
            case 1: realizarOperacion("Suma");           break;
            case 2: realizarOperacion("Resta");          break;
            case 3: realizarOperacion("Multiplicación"); break;
            case 4: realizarOperacion("División");       break;
            case 5: opcion = 0;
         }
      } while(1 <= opcion && opcion <= 5); //Se repite siempre que el usuario escribe una opción correcta
   }
   
   //Función para dibujar el menu
   public static void dibujarMenu(){
      System.out.println("\n OPCION ACCION");
      System.out.println(" ====== ======================");
      System.out.println("     1   Sumar dos enteros");
      System.out.println("     2   Restar dos enteros");
      System.out.println("     3   Multiplicar dos enteros");
      System.out.println("     4   Dividir dos enteros");
      System.out.println("     5   Terminar\n");
   }
   
   //Función para realizar operaciones
   public static void realizarOperacion(String tipo){
      in.cls();
      System.out.println("===============================");
      System.out.println(" "+ tipo +" de dos enteros");
      System.out.println("===============================");
      
      //El usuario escribe dos números
      int numero1 = in.leerInt(" Número 1: ");
      int numero2 = in.leerInt(" Número 2: ");
      int resultado = 0;
      
      //Se realiza la operación determinada
      if(tipo == "Suma"){
           resultado = numero1 + numero2;
      } else if(tipo == "Resta"){
         resultado = numero1 - numero2;
      } else if(tipo == "Multiplicación"){
         resultado = numero1 * numero2;
      } else if(tipo == "División"){
         resultado = numero1 / numero2;
      }
      
      //El programa imprime el resultado final
      System.out.println(" Resultado: "+ resultado +"\n");
      in.detener();
   }
}