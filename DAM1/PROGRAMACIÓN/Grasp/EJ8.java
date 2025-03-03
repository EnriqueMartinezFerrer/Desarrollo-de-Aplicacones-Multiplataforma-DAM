import fsg.in;
class EJ8
{
   public static void main(String[] args)
   {
   //Nombre: Enrique Martínez Ferrer
            //Variables
       int A = in.leerInt("Dime un numero entre 1000 y 9999: ",v->v>=1000 && v<=9999,"No tiene cuatro dígitos\n");
       
       int B = A/1000;      
       int C = A%1000/100;
       int D = A%100/10;
       int E = A%10;
       
       System.out.println(A);
                     
       if(B==E && C==D)System.out.println("Es capicua");
       else System.out.println("No es capicua");


                
           
                  
                   
        }
}

