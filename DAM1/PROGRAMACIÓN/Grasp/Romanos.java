import fsg.in;
class Romanos 
{
   public static void main(String[] args)
   {
            //Variables
      int numero = in.leerInt("Numero ", v->v>=1 && v<=999);
      int c,d,u;
      String romano = " ";
            //Programa
            //Traducir a número romano
      u = numero % 10;
      d = numero / 10 % 10;
      c = numero /100;
      
      switch(u)
      {
         case 1: romano="I"; break;
         case 2: romano="II"; break;
         case 3: romano="III"; break;
         case 4: romano="IV"; break;
         case 5: romano="V"; break;
         case 6: romano="VI"; break;
         case 7: romano="VII"; break;
         case 8: romano="VIII"; break;
         case 9: romano="IX"; break;
         default:;
       }
       switch(d)
      {
         case 1: romano="X" + romano; break;
         case 2: romano="XX" + romano; break;
         case 3: romano="XXX" + romano; break;
         case 4: romano="XL" + romano; break;
         case 5: romano="L" + romano; break;
         case 6: romano="LX" + romano; break;
         case 7: romano="LXX" + romano; break;
         case 8: romano="LXXX" + romano; break;
         case 9: romano="XC" + romano; break;
         default:;
       }
        switch(c)
      {
         case 1: romano="C" + romano; break;
         case 2: romano="CC" + romano; break;
         case 3: romano="CCC" + romano; break;
         case 4: romano="CD" + romano; break;
         case 5: romano="D" + romano; break;
         case 6: romano="DC" + romano; break;
         case 7: romano="DCC" + romano; break;
         case 8: romano="DCCC" + romano; break;
         case 9: romano="CM" + romano; break;
         default:;
       }
        
        System.out.println(romano);


       
         
            }
}
 