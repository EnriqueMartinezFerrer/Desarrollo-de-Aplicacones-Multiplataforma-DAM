package Clases.src.main.kotlin.model;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Trabajador> listaTrabajadores;
    private String CIF;
    private String nombre;

    public Empresa() {

    }

    public Empresa(String nombre, String CIF){
        this.CIF = CIF;
        this.nombre = nombre;
        this.listaTrabajadores = new ArrayList<>();
    }

    public void contratarTrabajador(Trabajador trabajador){
        // una empresa solo puede contratar trabajadores que no tenga ya contratados
        // solo pueden existir trabajadores con diferentes nss
        listaTrabajadores.add(trabajador);
    }

    public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
