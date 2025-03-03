import fsg.in;
import clases.figuras.Rectangulo;
public class Ejercicio28
{
   public static void main(String[] args)
   {
      Rectangulo r = new Rectangulo(4,7);
      
      r.setAncho(in.leerInt("Nuevo ancho: ",v->v>=2));
      r.setAlto(in.leerInt("Nuevo alto: ",v->v>=2));
      System.out.println(r.dibujar("RECTANGULO\n"));
      r.restaurar();
      System.out.println(r.dibujar("RECTANGULO\n"));
   }
 }