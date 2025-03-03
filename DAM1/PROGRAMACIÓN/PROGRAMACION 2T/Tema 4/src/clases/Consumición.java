package clases;
public class Consumición
public enum Articulos
{
   caña,
   refresco,
   pincho,
   tapa,
   bocadillo,
   vino,
}
   private Articulos articulos = Articulos.caña;
   private double precio = 1;
   private int numeroDeUnidades = 1;
   
   public int getNumeroDeUnidades() {
         return numeroDeUnidades;
   }
   
   public Consumición setNumeroDeUnidades(int numeroDeUnidades)
         if(numeroDeUnidades<1)
            throw new IllegalArgumentException("El numero de unidades tiene que ser mayor de 0");