package modelo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int edad = 0;
        String nombre = "Kike";


            // Coche(marca="M" ,modelo="C220", cv=0,cc=0.0, bastidor=null,vel =0,km=0]
        Coche coche1 = new Coche("Mercedes", "C220");
            // Coche(marca="M" ,modelo="C300", cv=300,cc=3.0, bastidor=null,vel =0,km=0]
        Coche coche2 = new Coche( "C300", "Mercedes", 300,3.0);
        Coche coche3 = new Coche( "A5", "Audi", 200,2.5);
        Coche coche4 = new Coche( "A3", "Audi", 150,2.0);

        ArrayList<Coche> listaCoches = new ArrayList();

        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);
        System.out.println(coche4);


        double media;
        for (Coche coche : listaCoches){
            media += coche.getCv();
        }
        System.out.println("La media de CV es: " + media);

    }
}
