/*AUTOR: Carlos Francés Sánchez
FECHA: 5/11/2021*/

import fsg.in;

class p59et2
{
   public static void main(String[] args)
   {
      //Variables
      
      String s="";
      
      int lado=in.leerInt("Lado del cuadrado: ",v->v%2==1);
      
      for(int i=0;i<lado;i++)
      {
         for(int x=0;x<lado;x++)
         {
            if(i==x||x+i==lado-1) s+=" * ";
            else s+="   ";
         }
         s+="\n";
      }
      System.out.println(s);
   }
}