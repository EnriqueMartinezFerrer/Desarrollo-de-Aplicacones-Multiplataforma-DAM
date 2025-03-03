package clases;
public class ClienteBar implements Cloneable, Comparable<ClienteBar>
{
   @Override
   public int compareTo(ClienteBar cb)
   {
      return nombre.compareTo(cb.nombre);
   }
   
   private String nombre = "";
   private Consumicion consumicion;
   
   public String getNombre()
   {
      return nombre;
   }
   
   public Consumicion getConsumicion()
   {
      return consumicion;
   }
   
   public ClienteBar setNombre(String nombre)
   {
      if(!nombre.matches("([A-ZÑ][a-zñ]*)?"))
         throw new IllegalArgumentException("Nombre incorrecto");
      this.nombre = nombre;
      return this;
   }
   
   public ClienteBar setConsumicion(Consumicion consumicion)
   {
      this.consumicion = consumicion;
      
      return this;
   }
   
   public ClienteBar(String nombre,Consumicion consumicion)
   {
      this.consumicion = consumicion;
      setNombre(nombre);
   }
   
   public ClienteBar(String nombre)
   {
      this(nombre,null);
   }
   
   public ClienteBar(Consumicion consumicion)
   {
      this("",consumicion);
   }
   
   public ClienteBar()
   {
   }
   
   public String linea()
   {
      return String.format("%-20s %-10s %8d %6.2f %8.2f\n",
         nombre,consumicion.getArticulo(),
         consumicion.getNumeroDeUnidades(),
         consumicion.getPrecio(),
         consumicion.coste());
         
   }
   
   @Override
   public ClienteBar clone() 
   {
      ClienteBar p = null;
      try
      {
          p = (ClienteBar) super.clone();
      }
      catch(CloneNotSupportedException ex)
      {
         ex.printStackTrace();
      }
      return p;
   }



   
}