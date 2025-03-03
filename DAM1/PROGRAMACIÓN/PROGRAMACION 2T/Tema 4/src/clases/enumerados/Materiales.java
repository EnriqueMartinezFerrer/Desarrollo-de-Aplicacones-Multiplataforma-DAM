package clases.enumerados;
public enum Materiales {
    MADERA(0.5,1),
    LATON(1.2,5),
    HIERRO(1.8,7),
    ACERO(2.25,9);
    
    private double precio;
    private int calidad;
    
    public double getPrecio()
    {
        return precio;
    }
    
    public int getCalidad()
    {
        return calidad;
    }
    
    private Materiales(double precio,int calidad)
    {
        this.precio = precio;
        this.calidad = calidad;
    }
}
