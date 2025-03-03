package clases;
public class Rebajas
{
   public Rebajas(double precio,int porcentaje)
   {
      setPrecio(precio);
      setPorcentaje(porcentaje);
   }
   
   public Rebajas(int porcentaje, double precio)
   {
      this(precio,porcentaje);
   }

   
   public Rebajas(double precio)
   {
       setPrecio(precio);
   }
   
   public Rebajas(int porcentaje)
   {
      setPorcentaje(porcentaje);
   }
   
   private double precio = 1;
   private int porcentaje = 10;
   
   public double getPrecio()
   {
      return precio;
   }
   
   public int getPorcentaje()
   {
      return porcentaje;
   }
   
   public void setPorcentaje(int porcentaje)
   {
      if(porcentaje<10 || porcentaje>80)
         throw new IllegalArgumentException("Porcentaje incorrecto");
         
      this.porcentaje = porcentaje;
   }
   
   public Rebajas setPrecio(double nuevo)
   {
      if(nuevo<=0)
         throw new IllegalArgumentException("El precio tiene que ser positivo");
      if(nuevo!=(int)(nuevo*100+0.5)/100.0)
         throw new IllegalArgumentException("El precio tiene que tener como maximo dos decimales");
         
      precio = nuevo;
      return this;
   }
   
   /* METODOS DE CALCULO */
   public double precioAnterior()
   {
       double valor = 1-porcentaje/100.0;
       double precioAnterior = precio/valor;
       precioAnterior = (int)(precioAnterior*100)/100.0;
       return precioAnterior;
   }
}