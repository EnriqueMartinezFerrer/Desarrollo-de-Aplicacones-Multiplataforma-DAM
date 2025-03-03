import fsg.in;
class Concatenar
{
   public static void main(String[] args)
   {
            //Variables
      int totalsegundos = in.leerInt("segundos: ");
      double horas = 0;
      double minutos = 0;
      double segundos = 0;
      
      
      
      //Programa
      //Calculo de las horas
      horas = totalsegundos/3600;
      minutos= totalsegundos/60;

      System.out.println("Son: " + horas + "horas");
      System.out.println("Son: " + minutos + "minutos");

   }
}
 