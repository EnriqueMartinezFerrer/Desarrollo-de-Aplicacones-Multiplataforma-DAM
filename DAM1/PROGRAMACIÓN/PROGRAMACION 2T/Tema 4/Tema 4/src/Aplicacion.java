import clases.figuras.Circunferencia;
import clases.Persona;
import fsg.in;
public class Aplicacion
{
   public static void main(String[] args)
   {
      Persona p = null;
      while (true) try
      {
            p = new Persona(in.leerString("NOMBRE: "),
            in.leerInt("Edad: ",v->v>=0 && v<=120),
            in.leerDouble("Altura: "),
            in.leerDouble("Peso: ")
         );
         break;
      }
      catch(IllegalArgumentException e)
      {
         System.out.println(e.getMessage());
      } 
      
      System.out.println("IMC : "+p.imc());  
      /*
      //Crear una circunferencia de radio entre 2 y 5
      //Mostrar area y longitud con 3 decimales
      //double radio = Math.random()*3+2;
      Circunferencia c = new Circunferencia(Math.random()*3+2);
      double longitud = c.longitud();
      double area = c.area();
      longitud = (int)(longitud*1000+0.5)/1000.0;
      area = (int)(area*1000+0.5)/1000.0;
      System.out.println("LONGITUD: " +longitud);
      System.out.println("AREA: " +area);
      */
   }
 }