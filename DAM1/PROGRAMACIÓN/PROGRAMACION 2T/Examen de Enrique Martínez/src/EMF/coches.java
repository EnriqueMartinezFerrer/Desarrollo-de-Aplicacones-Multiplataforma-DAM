//Enrique Martínez Ferrer
package EMF;
public class coches implements Cloneable,Comparable<coches>
{
   //Override
   @Override
   public String toString()
   {
      return "MATRICULA: "+MATRICULA+"\nCOMBUSTIBLE: "+getCombustible()+"\nLITROS: "+getLitros();
   }
   @Override
   public coches clone()
   {
      try
      {
         return (coches) super.clone();
      }
      catch (CloneNotSupportedException e)
      {
         e.printStackTrace();
      }
      return null;
   }
   @Override
   public int compareTo(coches c)
   {
      return MATRICULA.compareTo(c.MATRICULA);
   }
   @Override
   public boolean equals(Object o)
   {
      if (!(o instanceof coches)) return false;
      if (litros==((coches)o).getLitros()&combustible==((coches)o).getCombustible()) return true;
      return false;
   }
   //Enumerado
   public enum Combustible
   {
      gasoil,
      gasolina95,
      gasolina98
   }
   //Atributos
   public final String MATRICULA;
   private Combustible combustible=Combustible.valueOf("gasoil");
   private int litros=0;
   //
   public Combustible getCombustible()
   {
      return combustible;
   }
   public int getLitros()
   {
      return litros;
   }
   private String setMATRICULA(String matricula)
   {
      if(!matricula.matches("[0-9]{4}[A-Z]+")) throw new IllegalArgumentException("Matrícula Incorrecta");
      return matricula;
   }
   public coches setCombustible(Combustible combustible)
   {
      this.combustible=combustible;
      return this;
   }
   //Metodos Constructores
   public coches setLitros(int litros)
   {
      if(litros<0) throw new IllegalArgumentException("Litros incorrectos");
      this.litros=litros;
      return this;
   }
      public coches(Combustible combustible,String matricula)
   {
      this(matricula,combustible);
   }
   public coches(String matricula,Combustible combustible,int litros)
   {
      MATRICULA=setMATRICULA(matricula);
      setCombustible(combustible);
      setLitros(litros);
   }
   public coches repostar()
   {
      this.repostar(1);
      return this;
   }
   public boolean sinCombustible()
   {
      if (litros==0) return true;
      return false;
   }
   public double consumo()
   {
      if (combustible==Combustible.valueOf("gasoil")) return 3;
      if (combustible==Combustible.valueOf("gasolina95")) return 3.5;
      return 3.8;
   }
   public double distancia()
   {
      return litros*100/this.consumo();   }
   public coches(String matricula,Combustible combustible)
   {
      MATRICULA=setMATRICULA(matricula);
      setCombustible(combustible);  
   } 
   public coches repostar(int litros)
   {
      if (litros<0) throw new IllegalArgumentException("Litros incorrectos");
      this.litros+=litros;
      return this;
   }
}

