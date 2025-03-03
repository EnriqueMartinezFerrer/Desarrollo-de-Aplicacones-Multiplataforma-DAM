import fsg.in;
class RedondearTruncar
{
   public static void main(String[] args)
   {
            //Variables
      double valor = in.leerInt("valor");
      
      
      
      
      //Programa
      //Mostrar el valor truncado
      System.out.println("Truncar" + (int)valor);
       //Mostrar el valor Redondeado
      System.out.println("Redondear:" + (int)(valor+0.5));
      //Mostrar el valor Redondeado a las milésimas
      System.out.println("Redondear a las milésimas:" + (int)(valor*1000+0.5)/1000.0);
      //Mostrar el valor truncado
      System.out.println("Truncar a las centenas:" + (int)(valor/100)*100);

      
       
   }
}
