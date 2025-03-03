import fsg.in;

class Ejercicio28
{
   public static void main(String[] args)
   {
      //Variables
      
      int edad = 0, nivel = 0, ingresos = 0;
      boolean res = false;
      //Programa
            
     edad = in.leerInt("Introduce edad(0 y 100): ");
     nivel= in.leerInt("Introduce nivel(0 y 10): ");
     ingresos= in.leerInt("Introduce ingresos(0 y 25000): ");
     //Mas de 40 años y nivel entre 5 y 8
     //e ingresos menores que 15000
     res = edad>40 && 5<=nivel && nivel<=8 && ingresos<15000;
     System.out.println("Mas de 40 años y nivel entre 5 y 8 e ingresos menores que 15000: ");


     
     
                 }
 }