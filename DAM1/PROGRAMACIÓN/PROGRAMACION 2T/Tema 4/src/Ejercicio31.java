import fsg.in;
import clases.enumerados.DiaDeLaSemana;
import clases.Persona;
public class Ejercicio31
{
   public static void main(String[] args)
   {
      Persona.EstadoCivil e = Persona.EstadoCivil.casado;
      DiaDeLaSemana d = DiaDeLaSemana.lunes;
      int dia = in.leerInt("Dia de la semana (1-7): ",
         v->v>0 && v<8);
       DiaDeLaSemana[] dias = DiaDeLaSemana.values();
       
       d = dias[dia-1];
       
       System.out.println(d.name());
   }
}