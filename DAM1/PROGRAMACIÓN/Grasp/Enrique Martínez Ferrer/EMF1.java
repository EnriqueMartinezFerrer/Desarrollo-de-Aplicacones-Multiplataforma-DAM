import fsg.in;
class EMF1
{
   public static void main(String[] args)
   {
   //Nombre: Enrique Mart�nez Ferrer
            //Variables
       double Vi = 12.6;
       double a = 2.5;
       double Xi =2.56;
       double Ti = 0;
       double T = 1.25;
       double Vf = 0;
       double Xf = 0;
            
        //C�lculo
     Vf = Vi + a*(T-Ti);    
     Xf = Xi + Vi*(T-Ti)+ 0.5*a*((T-Ti)*(T-Ti));  
      //Redondear
     Vf = (int)(Vf*100+0.5)/100.0;
     Xf = (int)(Xf*100+0.5)/100.0;

      
      
      //Salida
      System.out.println("La velocidad final es: " + Vf + "m/s");
      System.out.println("La posici�n final es: " + Xf + "m");
            
        }
}
 