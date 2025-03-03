import fsg.in;
class SalidaPorConsola
{
   public static void main(String[] args)
   {
            //Variables
      double a = 0;
      float b = 0;
      long c = 0;
      int d = 0;
      short e = 0;
      byte f = 0;
      char g= '\0';
      //Programa
      a = in.leerDouble("escribe un real: ");
      b= (float) a;
      c= (long) a;
      d= (int) a;
      e= (short) a;
      f= (byte) a;
      g= (char) a;
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
      System.out.println(f);
      System.out.println(g);

   }
}
 