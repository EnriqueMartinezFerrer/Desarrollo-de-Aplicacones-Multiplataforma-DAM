//Enrique Martínez Ferrer
//Todo cuenta :)
import EMF.mar;

class Examen4B
{
   public static void main(String[] args)
   {
      //Variables
      int billetes = 0;
      int dinero = 0;
      String nombre = mar.leoString("Dime tu nombre: ");
      int billete5 = mar.leoInt("Cuantos billetes de 5: ");
      if(billete5>10) 
      {
      System.out.println("El número de billetes debe ser entre 0 y 10");
      }

      int billete10 = mar.leoInt("Cuantos billetes de 10: ");
      if(billete10>10) 
      {
      System.out.println("El número de billetes debe ser entre 0 y 10");
      }

      int billete20 = mar.leoInt("Cuantos billetes de 20: ");
      if(billete20>10) 
      {
      System.out.println("El número de billetes debe ser entre 0 y 10");
      }

      int billete50 = mar.leoInt("Cuantos billetes de 50: ");
      String s="";
                    if(billete50>10) 
      {
      System.out.println("El número de billetes debe ser entre 0 y 10");
      }
     dinero=billete5*5 + billete10*10 + billete20*20 + billete50 * 50;
     System.out.println("Número de billetes de 50: "+billete50);
     System.out.println("Número de billetes de 20: "+billete20);
     System.out.println("Número de billetes de 10: "+billete10);
     System.out.println("Número de billetes de 5: "+billete5);
     System.out.println("NOMBRE Y APELLIDOS   50 20 10  5 TOTAL");
     System.out.println("==================== == == == == ======");
     System.out.println(nombre +"                 "+ billete5 + " " + billete10 + " " + billete20 + " " + billete50 +" "+ dinero);
     billetes = billete5 + billete10 + billete20 + billete50;
     System.out.println("Núm de billetes: " + billetes);
   }
}
                

     
     
