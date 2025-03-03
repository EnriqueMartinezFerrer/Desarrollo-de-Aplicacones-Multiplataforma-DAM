package clases.figuras;
public class Rectangulo implements Cloneable
{
   /* CONSTANTES */
   public final int ANCHO_INICIAL;
   public final int ALTO_INICIAL;
   
   /* ATRIBUTOS */
   private int ancho = 2;
   private int alto = 2;
   private char borde = '*';
   private char relleno = '+';
   
   /* METODOS GET */
   public int getAncho()
   {
      return ancho;
   }
   
   public int getAlto()
   {
      return alto;
   }
   
   public char getBorde()
   {
      return borde;
   }
   
   public char getRelleno()
   {
      return relleno;
   }
   
   /* METODOS SET */
   public Rectangulo setAncho(int ancho)
   {
      if(ancho<=1) 
         throw new IllegalArgumentException("El ancho debe ser mayor que 1");
         
      this.ancho = ancho;
       
      return this;
   }
   
   public Rectangulo setAlto(int alto)
   {
      if(alto<=1) 
         throw new IllegalArgumentException("El alto debe ser mayor que 1");
         
      this.alto = alto;
       
      return this;
   }
   
   public void setBorde(char borde)
   {
      if(borde!='*' && borde!='+' && borde!='-')
         throw new IllegalArgumentException("El borde debe ser *, + o -");
         
      this.borde = borde;
   }
   
   public void setRelleno(char relleno)
   {
      if(relleno!='*' && relleno!='+' && relleno!=' ')
         throw new IllegalArgumentException("El relleno debe ser *, + o espacio");
         
      this.borde = borde;
   }

   /* CONSTRUCTORES */
   public Rectangulo(int ancho, int alto, char borde, char relleno)
   {
   	setAncho(ancho);
   	setAlto(alto);
   	setBorde(borde);
   	setRelleno(relleno);
   	
   	ANCHO_INICIAL = ancho;
   	ALTO_INICIAL = alto;
   }
   
   public Rectangulo()
   {
      ANCHO_INICIAL = 2;
      ALTO_INICIAL = 2;
   }

   public Rectangulo(int ancho, int alto)
   {
      this(ancho,alto,'*','+');
   }
   
   public Rectangulo(char borde,char relleno)
   {
      this(2,2,borde,relleno);
   }
   
   public Rectangulo(int ancho, char borde, char relleno)
   {
      this(ancho,2,borde,relleno);
   }
   
   public Rectangulo(char borde,int ancho, char relleno)
   {
      this(ancho,borde,relleno);
   }
   
   public Rectangulo(char borde, char relleno,int ancho)
   {
      this(ancho,borde,relleno);
   }

   
   public Rectangulo(int ancho, int alto, char borde)
   {
      setAncho(ancho);
      setAlto(alto);
      setBorde(borde);
      
      ANCHO_INICIAL = ancho;
      ALTO_INICIAL = alto;
   }
   
   public Rectangulo(int ancho, char borde, int alto)
   {
      this(ancho,alto,borde);
   }
   
    public Rectangulo(char borde, int ancho, int alto)
   {
      this(ancho,alto,borde);
   }

   /* METODOS DE CALCULO */
   public int perimetro()
   {
      return 2*ancho + 2*alto;
   }
   
   public int area()
   {
      return ancho*alto;
   }
   
   public double diagonal()
   {
      return Math.pow(ancho*ancho+alto*alto,0.5);
   }
   
   public double diagonal(int n)
   {
      double d = diagonal();
      
      int pot =(int)  Math.pow(10,n);
      
      return (int) (d*pot)/(double)pot;
   }
   
   /* METODOS DE CONSULTA */
   public boolean esCuadrado()
   {
      return ancho==alto;
   }
   
   /* METODOS DE CAMBIO DE ESTADO */
   public Rectangulo plus()
   {
      return setAncho(ancho+1).setAlto(alto+1);
   }
   
   public Rectangulo invertir()
   { 
      int an = ancho;
      setAncho(alto); 
      setAlto(an);
      return this;
   }
   
   public Rectangulo restaurar()
   {
      return setAncho(ANCHO_INICIAL).setAlto(ALTO_INICIAL);
   }
   
   /* METODOS DE CONVERSION A CADENA */
   @Override
   public String toString()
   {
      return "ANCHO_INICIAL: "+ANCHO_INICIAL+
             "\nALTO_INICIAL: "+ALTO_INICIAL+
             "\nANCHO: "+ancho+
             "\nALTO: "+alto+
             "\nBORDE: "+borde+
             "\nRELLENO: "+relleno;
             
   }
   
   public String dimension()
   {
      // 3 x 4
      return ancho + " x " + alto;
   }
   
   public String dibujar(String mensaje)
   {
      return mensaje + dibujar();
   }
   
   public String dibujar()
   {
      //3 x 4
      // * * *
      // * + *
      // * + *
      // * * *
      String s = "";
      for(int i=0;i<alto;i++)
      {
         for(int j=0;j<ancho;j++)
         {
            if(i==0 || i==alto-1 || j==0 || j==ancho-1) s+=borde+" ";
            else s+=relleno+" ";
         }
         s+="\n";
      }
      
      return s;
   }
   
   @Override
   public Rectangulo clone() 
   {
      Rectangulo p = null;
      try
      {
          p = (Rectangulo) super.clone();
      }
      catch(CloneNotSupportedException ex)
      {
         ex.printStackTrace();
      }
      return p;
   }


}