package clases.figuras;

import clases.interfaces.Acumulable;

public abstract class Figura implements Acumulable, Comparable<Figura>{
    public final int VERTICES;
    
    protected int setVERTICES(int n){
       if(n<3)
           throw new VerticesInvalidosException("El numero de vértices tiene que ser mayor que dos");
       return n;
    }
    
    protected Figura(int vertices){
        VERTICES = setVERTICES(vertices);
    }
    
    abstract public int perimetro();
    abstract public int area();
    
    @Override
    abstract public Figura acumular();
    
    @Override
    abstract public Figura acumular(Object valor);
    
    @Override
    abstract public boolean esNulo();
    
    @Override
    abstract public int compareTo(Figura a);

    private static class VerticesInvalidosException extends RuntimeException {

        public VerticesInvalidosException(String mensaje) {
            super(mensaje);
        }
    }
}
