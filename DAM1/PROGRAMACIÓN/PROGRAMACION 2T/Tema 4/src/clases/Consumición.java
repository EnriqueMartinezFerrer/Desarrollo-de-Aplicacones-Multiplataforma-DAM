package clases;
public class Consumici�n
public enum Articulos
{
   ca�a,
   refresco,
   pincho,
   tapa,
   bocadillo,
   vino,
}
   private Articulos articulos = Articulos.ca�a;
   private double precio = 1;
   private int numeroDeUnidades = 1;
   
   public int getNumeroDeUnidades() {
         return numeroDeUnidades;
   }
   
   public Consumici�n setNumeroDeUnidades(int numeroDeUnidades)
         if(numeroDeUnidades<1)
            throw new IllegalArgumentException("El numero de unidades tiene que ser mayor de 0");