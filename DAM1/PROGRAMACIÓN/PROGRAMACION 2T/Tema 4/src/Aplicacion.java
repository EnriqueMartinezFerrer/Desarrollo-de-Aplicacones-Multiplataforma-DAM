import clases.figuras.Circunferencia;
import clases.Persona;
import clases.figuras.Rectangulo;
import java.util.Arrays;
import fsg.in;
public class Aplicacion
{
   public static void main(String[] args)
   {
      Persona p = new Persona("PEDRO");
      p.addNotas(7).addNotas(10);
      p.addNotas(4);
      System.out.println(Arrays.toString(p.getNotas()));
      int[] n = p.getNotas();
      n[0]++;
      System.out.println(Arrays.toString(n));
      p.setNotas(n);
      p.setNotas(2,8);
      System.out.println(Arrays.toString(p.getNotas()));
      int nota =p.getNotas(0);
      int total = 0;
      for(int i=0;i<p.lengthNotas();i++)
      {
         total+=p.getNotas(i);
      }
      
      for(int no:p.getNotas())
         total+=no;
      
      nota++;
      p.setNotas(0,nota);
      p.setNotas(0,p.getNotas(0)+1);    
   }
 }