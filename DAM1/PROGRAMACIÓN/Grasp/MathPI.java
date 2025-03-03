import fsg.in;
class MathPI
{
   public static void main(String[] args)
   {
            //Variables
      double radio = 0;
      double Longitud= 0;
      double Area= 0;  
      
      
      //Programa
       radio = in.leerDouble("Radio de circinferencia(Entre 0 y 100): ");
      
       
       //Calculo
       Longitud = (Math.PI*radio*2);
       Area = (Math.PI*radio*radio);
       
       
       //Salida
       System.out.println("Longitud:" +Longitud);
       System.out.println("Area:" + Area);
       
       
   }
}
