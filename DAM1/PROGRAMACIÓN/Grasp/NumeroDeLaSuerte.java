import fsg.in;
class NumeroDeLaSuerte 
{
   public static void main (String args[]) 
   {
      //Variables
      long numero = 0; //Numero /fecha de nacimiento) cuyo numero de la suerte se quiere obtener
      int numeroDeLaSuerte = 0; //Numero aleatorio entre 9 y 100
      
      //Programa
      in.cls();
      System.out.println("******************************************************************");
      System.out.println("* NUMERO DE LA SUERTE                                            *");
      System.out.println("******************************************************************");
         
      //Leer fecha de nacimiento en formato ddmmaaaa (podría ser cualquier valor de tipo long)
      numero = in.leerLong("Fecha de nacimiento o numero entero: ",v->v>0);
      
      while(true)
      {        
         while(true)
         {
            //BUCLE INTERNO: Sumar todos los digitos de "numero"
            
            //Acumular las unidades del numero cuyo numero de la suerte se quiere obtener
            numeroDeLaSuerte+=numero%10;
            
            //Quitar las unidades de numero cuyo numero de la suerte se quiere obtener
            numero/=10;
            
            //Comprobar si ya se han sumado todos los dígitos del numero cuyo numero de la suerte se quiere obtener
            if(numero==0) break;
          }
          
          //Comprobar si se ha obtenido el numero de la suerte
          if(numeroDeLaSuerte<10) break;
          
          //BUCLE EXTERNO: Obtener el número de la suerte de "numeroDeLaSuerte"
          //Asignar como nuevo "numero" cuyo numero de la suerte se quiere obtener el de "numeroDeLaSuerte"
          numero = numeroDeLaSuerte;
          
          //Inicializar el totalizador de "numeroDeLaSuerte" a 0
          numeroDeLaSuerte = 0;
      }
            
      //Mostrar el numero de la suerte
      System.out.println("Tu numero de la suerte es el "+numeroDeLaSuerte);

      //Detener el control
      in.detener();
 
   }	
}