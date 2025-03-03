//Enrique Martínez Ferrer
package EMF;
public class Vivienda implements Cloneable,Comparable<Vivienda>
{
//Atributos
   private int habitaciones=1;
   private double extension=40.65;
   private long precio=50000;
   private String tipo="piso";
//Metodos get
   public int getHabitaciones()
   {
      return habitaciones;
   }
   public double getExtension()
   {
      return extension;
   }
   public long getPrecio()
   {
      return precio;
   }
   public String getTipo()
   {
      return tipo;
   }
//Métodos set
   public Vivienda setHabitaciones(int habitaciones)
   {
      if(habitaciones<1||habitaciones>5) throw new IllegalArgumentException("El valor debe estar entre 1 y 5, ambos inclusive");
      this.habitaciones=habitaciones;
      return this;
   }
   public Vivienda setExtension(double extension)
   {
      if(extension<40||extension>250) throw new IllegalArgumentException("El valor debe estar entre 40.00 y 250.00");
      if(extension*100!=(int)(extension*100)) throw new IllegalArgumentException("La extension puede tener como máximo dos decimales");
      this.extension=extension;
      return this;
   }
   public Vivienda setPrecio(long precio)
   {
      this.precio=precio;
      return this;
   }
   public String setTipo(String tipo)
   {
      if(!tipo.equals("piso")&&!tipo.equals("adosado")&&!tipo.equals("chalet")) throw new IllegalArgumentException("El tipo de vivienda solo puede ser piso, adosado o chalet");
      return tipo;
   }
  //Metodos constructores
   public Vivienda(int habitaciones,double extension,long precio,String tipo)
   {
      setHabitaciones(habitaciones);
      setExtension(extension);
      setPrecio(precio);
      this.tipo=setTipo(tipo);
   }
   public Vivienda(int habitaciones,long precio,double extension,String tipo)
   {
      this(habitaciones,extension,precio,tipo);
   }
   public Vivienda(int habitaciones,long precio,String tipo,double extension)
   {
      this(habitaciones,extension,precio,tipo);
   }
//Override
   @Override
   public String toString()
   {
      return String.format("HABITACIONES: %5d /nEXTENSION: %4f /nPRECIO: %5d /nTIPO: %5s",habitaciones,extension,precio,tipo);
   }
   @Override
   public Vivienda clone()
   {
      try
      {
         return (Vivienda) super.clone();
      }
      catch (CloneNotSupportedException e)
      {
         e.printStackTrace();
      }
      return null;
   }
   @Override
   public boolean equals(Object o)
   {
      if (!(o instanceof Vivienda)) return false;
      if (habitaciones==((Vivienda)o).getHabitaciones()&&extension==((Vivienda)o).getExtension()&&precio==((Vivienda)o).getPrecio()&&tipo==((Vivienda)o).getTipo()) return true;
      return false;
   }
   @Override
   public int compareTo(Vivienda a)
   {
      if (precio>a.getPrecio()) return 1;
      if (precio<a.getPrecio()) return -1;
      return 0;
   }
   
   public Vivienda incrementar(long precio)
   {
      if (precio<=0) throw new IllegalArgumentException("La cantidad a incrementar tiene que ser positiva");
      setPrecio(this.precio+precio);
      return this;
   }
}