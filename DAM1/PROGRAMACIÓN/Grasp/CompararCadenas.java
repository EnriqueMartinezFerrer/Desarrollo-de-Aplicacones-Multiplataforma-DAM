import fsg.in;

class Ejercicio23
{
   public static void main(String[] args)
   {
      //Variables
      
      String A=in.leerString("Escriba una palabra: ");
      String B=in.leerString("Escriba otra palabra: ");
      
      System.out.println("Son iguales: "+A.equals(B));
      System.out.println("La primera es menor que la segunda: "+(A.compareTo(B)<0));
      System.out.println("Son distintas: "+!A.equals(B));
      }
 }