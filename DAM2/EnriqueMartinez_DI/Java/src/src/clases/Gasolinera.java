package clases;

import java.util.ArrayList;

public class Gasolinera {
    //ATRIBUTOS
    private String nombre;
    private ArrayList<Surtidor> surtidores;
    private int ganancias;

    //MÉTODOS GET
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Surtidor> getSurtidores() {
        return surtidores;
    }

    public int getGanancias() {
        return ganancias;
    }

    //MÉTODOS SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSurtidores(ArrayList<Surtidor> surtidores) {
        this.surtidores = surtidores;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    //CONSTRUCTOR
    public Gasolinera(String nombre){
        this.nombre = nombre;
        this.surtidores = new ArrayList<>();
        this.ganancias = 0;
    }

    //MÉTODOS
    public void agregarSurtidor(Surtidor surtidor){
        this.surtidores.add(surtidor);
    }

    public int obtenerGanancias(){
        return ganancias;
    }
}