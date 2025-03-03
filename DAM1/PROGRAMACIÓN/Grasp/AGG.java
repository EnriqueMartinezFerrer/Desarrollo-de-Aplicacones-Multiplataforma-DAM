//ENRIQUE MARTÍNEZ FERRER
import fsg.in;

class EMF-EV {
   public static void main(String[] args){
      int op = 0; 
      
      do {
         in.cls();                           
         dibujarMenu();                      
         opcion = leerInt(" OPCION: ");   
         
         
         switch(opcion){
            case 1: realizarOperacion("Suma");           break;
            case 2: realizarOperacion("Resta");          break;
            case 3: realizarOperacion("Multiplicación"); break;
            case 4: realizarOperacion("División");       break;
            case 5: op = 0;
         }
      } while(1 <= opcion && opcion <= 5); 
   }
   
  
   public static void dibujarMenu(){
      System.out.println("\n OPCION ACCION");
      System.out.println(" ====== ======================");
      System.out.println("     1   Sumar dos enteros");
      System.out.println("     2   Restar dos enteros");
      System.out.println("     3   Multiplicar dos enteros");
      System.out.println("     4   Dividir dos enteros");
      System.out.println("     5   Terminar\n");
   }
   
   
   public static void realizarOperacion(String tipo){
      in.cls();
      System.out.println("==========================");
      System.out.println(" "+ tipo +" de dos enteros");
      System.out.println("==========================");
      
      
      int num1 = in.leerInt(" Número 1: ");
      int num2 = in.leerInt(" Número 2: ");
      int resultado = 0;
      
      
      if(tipo == "Suma"){
           fin = num1 + numero2;
      } else if(tipo == "Resta"){
         resultado = num1 - num2;
      } else if(tipo == "Multiplicación"){
         resultado = num1 * num2;
      } else if(tipo == "División"){
         resultado = num1 / num2;
      }
      System.out.println(" Resultado: "+ fin +"\n");
      in.detener();
   }
}