import fsg.in;
class TemperaturasIntroducidas 
{
   public static void main (String args[]) 
   {
      //Variables
      int tope = 0; //Numero máximo de temperaturas
      int temperatura = 0; //Temperatura introducida
      int total = 0; //Total de las temperaturas introducidas
      double media = 0; //Media de las temperaturas
      
      //Programa
      in.cls();
      
      //Cabecera
      System.out.println("******************************************************************");
      System.out.println("* TEMPERATURAS                                                   *");
      System.out.println("******************************************************************");
         
      //Leer el número de temperaturas a introducir
      tope = in.leerInt("Numero de temperaturas: ");
      
      //Establecer valor por defecto del número de temperaturas si procede
      if(tope<=0)
      {
         tope = 5;
         System.out.println("Se introducirán 5 temperaturas");
      }
      
      //Leer y acumular 5 temperaturas
      for(int i=0;i<tope;i++)
      {
         //Leer temperatura
         temperatura = in.leerInt("Temperatura "+(i+1)+": ");
         total+=temperatura;
      }
      
      //Calcular la media
      media = (double) total/tope;
      
      //Redondear a dos decimales
      media = (int)(media*100)/100.0;
      
      //Mostrar la media de las temeperaturas
      System.out.println("La media de las temperaturas es "+media);
      
      //Detener el control
      in.detener();
 
   }	
}