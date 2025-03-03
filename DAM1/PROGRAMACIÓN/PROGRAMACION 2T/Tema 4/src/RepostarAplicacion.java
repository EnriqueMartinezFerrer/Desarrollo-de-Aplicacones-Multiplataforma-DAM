import clases.Repostar;
import clases.enumerados.Semana;
import fsg.in;

public class RepostarAplicacion {
    public static void main(String[] args)
    {
        Semana dia = Semana.values()[in.leerInt("Dia de la semana (1-7): ",v->v>=1 && v<=7)-1];
        double cantidad = in.leerDouble("Litros: ",v->v>=1);
        double precio = in.leerDouble("Precio: ",v->v>=0.5);
        Repostar r = new Repostar(dia,cantidad,precio);
        System.out.println("DIA DE LA SEMANA: "+r.getDia().name());
        System.out.println("COSTE DEL REPOSTAJE: "+r.coste(2));
    }
}
