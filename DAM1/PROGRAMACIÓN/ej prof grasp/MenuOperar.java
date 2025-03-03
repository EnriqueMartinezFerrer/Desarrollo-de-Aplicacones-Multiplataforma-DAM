import fsg.in;
class MenuOperar
{  
   static public void main(String[] args)
   {
      //Constantes
      final int TOPE = 4;
      
      //Variables
      int opcion = 0;
       
      //Programa
      while(true)
      {
         in.cls();
         menu();
         opcion = leerOpcion();
         if(opcion<1 || opcion>TOPE) break;
         in.cls();
         switch(opcion)
         {
            case 1: sumarDosEnteros(); break;
            case 2: restarDosEnteros(); break;
            case 3: multiplicarDosEnteros(); break;
            case 4: dividirDosEnteros(); break;
         }
      }      
    }
    
    /* ***************************************************************** */
    /* FUNCIONES                                                         */
    /* ***************************************************************** */
    static int leerOpcion()
    {
         return in.leerInt("Opcion: ");
    }
       
    /* ***************************************************************** */
    /* PROCEDIMIENTOS                                                    */
    /* ***************************************************************** */
    static void menu()
    {
      System.out.println("OPCION ACCION");
      System.out.println("====== ============================================");
      System.out.println("   1   Sumar dos enteros");
      System.out.println("   2   Restar dos enteros");
      System.out.println("   3   Multiplicar dos enteros");
      System.out.println("   4   Dividir dos enteros");
      System.out.println(" otra  Terminar");
    }
    
    static void sumarDosEnteros()
    {
      System.out.println("* ****************************************************** */");
      System.out.println("* SUMAR DOS ENTEROS                                      */");
      System.out.println("* ****************************************************** */");
      int a = in.leerInt("Escribe un entero: ");
      int b = in.leerInt("Escribe un entero: ");
      System.out.println("La suma vale " + (a+b));
      in.detener();
    }
    
    static void restarDosEnteros()
    {
      System.out.println("* ****************************************************** */");
      System.out.println("* RESTAR DOS ENTEROS                                     */");
      System.out.println("* ****************************************************** */");
      int a = in.leerInt("Escribe un entero: ");
      int b = in.leerInt("Escribe un entero: ");
      System.out.println("La resta vale " + (a-b));
      in.detener();
    }
    
    static void multiplicarDosEnteros()
    {
      System.out.println("* ****************************************************** */");
      System.out.println("* MULTIPLICAR DOS ENTEROS                                */");
      System.out.println("* ****************************************************** */");
      int a = in.leerInt("Escribe un entero: ");
      int b = in.leerInt("Escribe un entero: ");
      System.out.println("El producto vale " + a*b);
      in.detener();
    }
    
    static void dividirDosEnteros()
    {
      System.out.println("* ****************************************************** */");
      System.out.println("* DIVIDIR DOS ENTEROS                                    */");
      System.out.println("* ****************************************************** */");
      int a = in.leerInt("Escribe un entero: ");
      int b = in.leerInt("Escribe un entero: ");
      if(b!=0) System.out.println("La division vale " + a/b);
      else System.out.println("No se puede realizar la division");
      in.detener();
    }
}