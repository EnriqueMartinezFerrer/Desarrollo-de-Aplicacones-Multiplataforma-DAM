import fsg.in;
import EMF.mar;

class Ejercicio29
{
   public static void main(String[] args)
   {
      //Variables
      
      int A = 0;
      char B = ' ';
      boolean res = true;
      boolean voc = true;
      //Programa
            
     A = mar.leoInt("Introduce un d�gito(0 al 9): ");
     B= mar.leoChar("Introduce vocal: ");
         //Entre el 0 y el 9
          res = A<=9 && A>=0;
          voc = B=='a' || B=='e' || B=='i' || B=='o' || B=='u' || B=='A'|| B=='E' || B=='I' || B=='O' || B=='U' || B=='�' || B=='�' || B=='�' || B=='�' || B=='�' || B=='�'|| B=='�' || B=='�' || B=='�' || B=='�' || B=='�' || B=='�' || B=='�'|| B=='�' || B=='�' || B=='�' || B=='�' || B=='�'|| B=='�' || B=='�' ;
          
     System.out.println(res);
     System.out.println(voc);


     
     
                 }
 }
 