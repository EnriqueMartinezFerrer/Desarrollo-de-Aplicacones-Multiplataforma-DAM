import clases.Persona;
import clases.figuras.Circunferencia;

public class AplicacionClone {
    public static void main(String[] args)
    {
       Persona p = new Persona("PEDRO",23,82.5);
       Circunferencia c = new Circunferencia(2);
       Object o = null;
       o = p;
       o = c;
       ((Persona)o).setEdad(12);
    }
}
