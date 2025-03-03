import clases.Coche;
import clases.Gasolinera;
import clases.Surtidor;

public class Entrada {
    public static void main(String[] args){
        Surtidor surtidor1 = new Surtidor(100, "E5");
        Surtidor surtidor2 = new Surtidor(100, "A1");
        Surtidor surtidor3 = new Surtidor("E5");

        Gasolinera gasolinera = new Gasolinera("Repsol");
        gasolinera.agregarSurtidor(surtidor1);
        gasolinera.agregarSurtidor(surtidor2);
        gasolinera.agregarSurtidor(surtidor3);

        Coche coche = new Coche("E5");
        coche.ponerGasolina(gasolinera.getSurtidores().get(0), 100);
    }
}