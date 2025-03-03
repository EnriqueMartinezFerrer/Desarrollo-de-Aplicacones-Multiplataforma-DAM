/*AUTOR: Carlos Francés Sánchez
FECHA: 5/11/2021*/

import fsg.in;

class p59dt2
{
   public static void main(String[] args)
   {
      //Variables
      
      String s="";
      
      int lado=in.leerInt("Lado del cuadrado: ");
      
      for(int i=0;i<lado;i++)
      {
         for(int x=0;x<lado;x++)
         {
            if(x<=i)
            {
               if(i==0||i==lado-1&&x==0||x==lado-1) s+=" * ";
               else if(x==0||i==lado-1||x==i) s+=" + ";
               else if(i!=0&&x!=0) s+=" a ";
               else s+="   ";
            }
         }
         s+="\n";
      }
      System.out.println(s);
    }
}