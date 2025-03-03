package clases;

import clases.enumerados.Semana;

public class Repostar {
    
    private Semana dia = Semana.lunes;
    private double cantidad = 1;
    private double precio = 0.5;

    public Repostar(Semana dia, double cantidad, double precio) {
        setDia(dia);
        setCantidad(cantidad);
        setPrecio(precio);
    }
    
    public Repostar(double cantidad, Semana dia, double precio) {
        this(dia,cantidad,precio);
    }
    
    public Repostar(double cantidad, double precio, Semana dia) {
        this(dia,cantidad,precio);
    }
    
    
    public double getPrecio() {
        return precio;
    }

    public Repostar setPrecio(double precio) {
        if(precio<0.5)
            throw new IllegalArgumentException("El precio tiene que ser mayor o igual que 0.5");
        
        this.precio = precio;
        
        return this;
    }


    public double getCantidad() {
        return cantidad;
    }

    public Repostar setCantidad(double cantidad) {
        if(cantidad<1)
            throw new IllegalArgumentException("La cantidad tiene que ser mayor o igual que 1");
        
        this.cantidad = cantidad;
        
        return this;
    }


    public Semana getDia() {
        return dia;
    }

    public Repostar setDia(Semana dia) {
        this.dia = dia;
        
        return this;
    }

    public double coste()
    {
        return precio*cantidad;
    }
    
    public double coste(int n)
    {
        return (int)(Math.pow(10,n)*coste()+0.5)/Math.pow(10,n);
    }
}
