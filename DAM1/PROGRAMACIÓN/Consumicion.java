package clases;
public class Consumicion {
    public enum Articulos {
        caña,
        refresco,
        pincho,
        tapa,
        bocadillo,
        vino
    }
    
    private Articulos articulo = Articulos.caña;
    private double precio = 1;
    private int numeroDeUnidades = 1;

    public int getNumeroDeUnidades() {
        return numeroDeUnidades;
    }

    public Consumicion setNumeroDeUnidades(int numeroDeUnidades) {
        if(numeroDeUnidades<0)
            throw new IllegalArgumentException("El número de unidades tiene que ser positivo");
        
        this.numeroDeUnidades = numeroDeUnidades;
        return this;
    }


    public double getPrecio() {
        return precio;
    }
    

    public Consumicion setPrecio(double precio) {
        if(precio<0 || (int)(precio*100+0.5)/100.0 != precio)
            throw new IllegalArgumentException("El precio tiene que ser positivo con un máximo de dos decimales");
        
        this.precio = precio;
        return this;
    }


    public Articulos getArticulo() {
        return articulo;
    }

    public Consumicion setArticulo(Articulos articulo) {
        this.articulo = articulo;
        return this;
    }

    public Consumicion(Articulos articulo, double precio, int numeroDeUnidades) {
        setArticulo(articulo);
        setPrecio(precio);
        setNumeroDeUnidades(numeroDeUnidades);
    }
    
    public Consumicion(Articulos articulo, int numeroDeUnidades, double precio) {
        this(articulo,precio,numeroDeUnidades);
    }
    
    public Consumicion(int numeroDeUnidades, Articulos articulo, double precio) {
        this(articulo,precio,numeroDeUnidades);
    }
    
    public Consumicion(int numeroDeUnidades, double precio, Articulos articulo) {
        this(articulo,precio,numeroDeUnidades);
    }
    
    public Consumicion(double precio, int numeroDeUnidades, Articulos articulo) {
        this(articulo,precio,numeroDeUnidades);
    }
    
    public Consumicion(double precio, Articulos articulo, int numeroDeUnidades) {
        this(articulo,precio,numeroDeUnidades);
    }
    
    public Consumicion(double precio, Articulos articulo) {
        this(articulo,precio,1);
    }
    
    public Consumicion(Articulos articulo, double precio) {
        this(articulo,precio,1);
    }
    
    public Consumicion(double precio, int numeroDeUnidades) {
        this(Articulos.caña,precio,numeroDeUnidades);
    }
    
    public Consumicion(int numeroDeUnidades, double precio) {
        this(Articulos.caña,precio,numeroDeUnidades);
    }
    
    public Consumicion(int numeroDeUnidades, Articulos articulo) {
        this(articulo,1.0,numeroDeUnidades);
    }
    
    public Consumicion(Articulos articulo, int numeroDeUnidades) {
        this(articulo,1.0,numeroDeUnidades);
    }

    public double coste()
    {
        return precio*numeroDeUnidades;
    }
}
