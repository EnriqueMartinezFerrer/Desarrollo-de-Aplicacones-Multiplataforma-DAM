import fsg.in;
class TablaDeMultiplicar 
{
   public static void main (String args[]) 
   {
      //Constante
      final int NUMERO;
      
      //Variables
            
      //Programa
      in.cls();
      
      //Cabecera
      System.out.println("******************************************************************");
      System.out.println("* TABLA DE MULTIPLICAR                                           *");
      System.out.println("******************************************************************");
         
      //Leer el número cuya tabla de multiplicar se quiere obtener
      NUMERO = in.leerInt("Numero (0 a 10): ",v->v>=0 && v<=10);
      
      //Recorrer los numeros 0,1, ... , 10  para multiplicarlos por NUMERO
      for(int i=0; i<=10; i++)
          System.out.println(i+" x "+NUMERO+" = "+(i*NUMERO));
      
      //Detener el control
      in.detener();
 
   }	
}