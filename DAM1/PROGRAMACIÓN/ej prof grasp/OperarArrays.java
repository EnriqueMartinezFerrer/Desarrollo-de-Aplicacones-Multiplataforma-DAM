import fsg.in;
import java.util.Arrays;
class PLANTILLA
{  
   static public void main(String[] args)
   {
      //Constantes
      
      //Variables
      final int[] a = new int[10];
      final int[] b = new int[10];
      
      //Programa
      rellenar(a);
      rellenar(b);
      System.out.println(Arrays.toString(a));
      System.out.println(Arrays.toString(b));
      System.out.println("Producto escalar: "+productoEscalar(a,b));
      
    } 
    
    static int productoEscalar(int[] a, int[] b)
    {
      int total = 0;
      for(int i=0;i<a.length;i++)
         total += a[i]*b[i];
      return total;
    }
    
    static void rellenar(final int[] n)
    {
      for(int i=0;i<n.length;i++)
         n[i]=(int)(Math.random()*100);
    }
}