package clases.figuras;
public class Circunferencia
{
   /* ATRIBUTOS CONSTANTES */
   public final double RADIO_INICIAL; 
    
   /* ATRIBUTOS */
   private double radio = 1;
   
   /* METODOS GET */
   public double getRadio()
   {
       return radio;
   }
   
   /* METODOS SET */
   public Circunferencia setRadio(double radio)
   {
      if(radio<=0)
         throw new IllegalArgumentException("El radio debe ser positivo");


      this.radio = radio;
      return this;
   }
   
   /* CONSTRUCTORES */
   public Circunferencia()
   {
      RADIO_INICIAL = 1;
   }
   
   
   public Circunferencia(double radio)
   {
      setRadio(radio);
      RADIO_INICIAL = radio;
   }
   
   /* METODOS DE CALCULO */
   public double area()
   {
      return Math.PI*radio*radio;
   }
   
   public double longitud()
   {
      return Math.PI*radio*2;
   }
   
   /* METODOS DE CONSULTA */
   public boolean esUnitaria()
   {
      return radio==1;
   }
   
   /* METODOS DE CAMBIO DE ESTADO */
   public Circunferencia duplicar()
   {
      /* 
      double radio = this.radio;
      radio*=2;
      setRadio(radio);
      */
      /*
      radio*=2;
      */
      
      setRadio(radio*2);
      return this;
      
   }
}