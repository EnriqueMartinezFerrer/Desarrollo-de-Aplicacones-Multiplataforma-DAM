import fsg.in;
class IVA
{
   public static void main(String[] args)
   {
            //Variables
      double valor = 0;
      int I= 0;
      double compra = 0;
      double IVA = 0;
      
      
      
      
      //Programa
       valor = in.leerDouble("Valor de la compra(entre 0.00 y 500.00): ");
       I = in.leerInt("IVA (entre 0 y 25%): ");
       
       //Calculo
       compra = (valor*100)/(100+I);
       //Redondearla a 2 decimales compra
       compra = (int) (compra*100 +0.5)/100.0;
       IVA= valor-compra;
       IVA = (int) (compra*100 +0.5)/100.0;

       
       
       //Salida
       System.out.println("Compra:" +compra);
       System.out.println("IVA:" + IVA);
       System.out.println("======");
       System.out.println(valor);
       
   }
}
