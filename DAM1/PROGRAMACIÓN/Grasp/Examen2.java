import fsg.in;
class EMF2
{
   public static void main(String[] args)
   {
   //Nombre: Enrique Martínez Ferrer
            //Variables
       int A = in.leerInt("Dime un numero entre 1000 y 9999: ");
       
       int B =A/1000) * 1000;      
       int C =(A/100) * 100-B;
       int D =(A/10) * 10)-B-C;
       int E =(A-B-C)-D;
       int SUMA=0;
       int PRODUCTO=0;
       int SUMA2=0;
      
                  
       //Cálculo
       SUMA = (B/1000)+(C/100)+(D/10)+E;
       PRODUCTO =(B/1000)*(C/100)*(D/10)*E;
       SUMA2 = SUMA + PRODUCTO;  
      
      
      //Salida
      System.out.println("CONCEPTO                   VALOR      ");
      System.out.println("========================== =====");
      System.out.printf("Suma de los dígitos        %04d",SUMA );
      
      System.out.printf("\nProducto de los dígitos    %04d\n",PRODUCTO );
      
      System.out.println("                             =====");
      System.out.printf("                  TOTAL    %04d",SUMA2);
            
        }
}
 