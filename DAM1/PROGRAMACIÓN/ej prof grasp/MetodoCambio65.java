/*AUTOR: Carlos Francés Sánchez
FECHA: 11/11/2021*/

import fsg.in;

class MetodoCambio65
{
   public static void main(String[] args)
   {
      //Variables
      double euros=in.leerDouble("Cantidad de euros: ");
      double cambio=0;
      double devolver=0;
      do
      {
         cambio=in.leerDouble("valor de cambio: ");
      }
      while(cam(cambio)<=0);
      canteuros(euros);
      cam(cambio); 
      devolver(euros,cambio);  
      devolver=devolver(euros, cambio);
      System.out.println(resultado(euros,cambio,devolver));   
   }
   static double canteuros(double n)
   {
      if(n>0) n=(int)(n*100)/100.0;
      return n;
   }
   static double cam(double n)
   {
      if(n>0)
      {
         return n;   
      }
      else 
      {
         System.out.println("Incorrecto");
         return n;
      }
   }
   static double devolver(double n,double i)
   {
      double c=(int)(n*i*100)/100.0;
      return c;
   }
   static String resultado(double n, double i, double x)
   {
      String f="EUROS:  "+n+"EUROS/DÓLAR:  "+i+"CAMBIO:  "+x;
      return f;
   }
   
}