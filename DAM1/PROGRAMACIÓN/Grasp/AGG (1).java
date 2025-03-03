//Alonso González Gómez 
import fsg.in;

class AGG {
   public static void main(String[] args){
      int opcion = 0; 
      
      do {
         in.cls();                           
         dibujarMenu();                      
         opcion = leerInt(" OPCION: ");   
         
         
         switch(opcion){
            case 1: realizarOperacion("Suma");           break;
            case 2: realizarOperacion("Resta");          break;
            case 3: realizarOperacion("Multiplicación"); break;
            case 4: realizarOperacion("División");       break;
            case 5: opcion = 0;
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
      
      
      int numero1 = in.leerInt(" Número 1: ");
      int numero2 = in.leerInt(" Número 2: ");
      int resultado = 0;
      
      
      if(tipo == "Suma"){
           resultado = numero1 + numero2;
      } else if(tipo == "Resta"){
         resultado = numero1 - numero2;
      } else if(tipo == "Multiplicación"){
         resultado = numero1 * numero2;
      } else if(tipo == "División"){
         resultado = numero1 / numero2;
      }
      System.out.println(" Resultado: "+ resultado +"\n");
      in.detener();
   }
}