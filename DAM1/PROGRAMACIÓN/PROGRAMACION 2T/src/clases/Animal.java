package clases;
abstract public class Animal {
    
    public final int NUMERO_DE_PATAS;
    private String nombre = "DESCONOCIDO";
    private float peso = 0.3F;

    public float getPeso() {
        return peso;
    }

    public Animal setPeso(float peso) {
        if(peso<=0)
            throw new IllegalArgumentException("El peso no es positivo");
        this.peso = peso;
        return this;
    }


    public String getNombre() {
        return nombre;
    }

    public Animal setNombre(String nombre) {
        if(nombre.matches("[A-ZÑÁÉÍÓÚÜ]+"))
            throw new IllegalArgumentException("El nombre no es una palabra en mayúsculas");
        this.nombre = nombre;
        return this;
    }

    public Animal(String nombre, float peso) {
        NUMERO_DE_PATAS = setNumeroDePatas();
        setNombre(nombre);
        setPeso(peso);
    }

    public Animal(float peso, String nombre) {
       this(nombre,peso); 
    }
    
    public Animal(String nombre){
        NUMERO_DE_PATAS = setNumeroDePatas();
        setNombre(nombre);
    }
    
    public Animal(float peso){
        NUMERO_DE_PATAS = setNumeroDePatas();
        setPeso(peso);
    }
    
    public Animal()
    {
        NUMERO_DE_PATAS = setNumeroDePatas();
    }
    
    @Override
    public String toString()
    {
        return "NUMERO DE PATAS: "+NUMERO_DE_PATAS+
                "\nNOMBRE: "+nombre+
                "\nPESO: "+peso;
    }
    
    abstract public int setNumeroDePatas();
    abstract public Animal comer();
    abstract public Animal comer(int gramos);
}
