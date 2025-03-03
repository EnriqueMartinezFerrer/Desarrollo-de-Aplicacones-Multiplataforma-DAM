import fsg.in;
class EMF1
//Enrique Martínez Ferrer
{
   public static void main(String[] args)
   {
            //Variables
      int NUM = in.leerInt("Numero entre 1 y 999: ", v->v>=1 && v<=999);
      int c,d,u;
      String numero = " ";
            //Programa
            //Descomponer
      u = NUM % 10;
      d = NUM / 10 % 10;
      c = NUM /100;
      
      switch(u)
      {
         case 1: numero="una unidad "; break;
         case 2: numero="dos unidades "; break;
         case 3: numero="tres unidades "; break;
         case 4: numero="cuatro unidades "; break;
         case 5: numero="cinco unidades "; break;
         case 6: numero="seis unidades "; break;
         case 7: numero="siete unidades "; break;
         case 8: numero="ocho unidades "; break;
         case 9: numero="nueve unidades "; break;
         default:;
       }
       switch(d)
      {
         case 1: numero="una decena " + numero; break;
         case 2: numero="dos decenas " + numero; break;
         case 3: numero="tres decenas " + numero; break;
         case 4: numero="cuatro decenas " + numero; break;
         case 5: numero="cinco decenas " + numero; break;
         case 6: numero="seis decenas " + numero; break;
         case 7: numero="siete decenas " + numero; break;
         case 8: numero="ocho decenas " + numero; break;
         case 9: numero="nueve decenas " + numero; break;
         default:;
       }
        switch(c)
      {
       case 1: numero="una centena " + numero; break;
         case 2: numero="dos centenas " + numero; break;
         case 3: numero="tres centenas " + numero; break;
         case 4: numero="cuatro centenas " + numero; break;
         case 5: numero="cinco centenas " + numero; break;
         case 6: numero="seis centenas " + numero; break;
         case 7: numero="siete centenas " + numero; break;
         case 8: numero="ocho centenas " + numero; break;
         case 9: numero="nueve centenas " + numero; break;
         default:;

        }
        
        System.out.println(numero);


       
         
            }
}
 