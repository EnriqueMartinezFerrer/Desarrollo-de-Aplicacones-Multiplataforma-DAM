import fsg.in;
class MenuConSubmenu
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
            case 1: dibujarCuadrado(); break;
            case 2: costeConsumicion(); break;
            case 3: numeroDeAmstrong(); break;
            case 4: submenuOperar(); break;
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
      System.out.println("   1   Dibujar cuadrado");
      System.out.println("   2   Coste consumicion");
      System.out.println("   3   Numero de Amstrong");
      System.out.println("   4   Submenu operar");
      System.out.println(" otra  Terminar");
    }
    
    static void dibujarCuadrado()
    {
      //Cosntantes
      final int LADO;
      
      //Variables
      String s="";
 
      //Programa
      System.out.println("* ****************************************************** */");
      System.out.println("* DIBUJAR CUADRADO                                       */");
      System.out.println("* ****************************************************** */");

      //Leer lado del cuadrado
      LADO = in.leerInt("Lado: ",v->v>2 && v%2==1,"El lado tiene que ser impar\n");
            
      //Recorrer cada una de las filas del cuadrado (0, 1, ..., LADO-1)
      for(int i=0;i<LADO;i++)
      {
         //Recorrer cada una de las columnas para cada uno de las filas
         for(int j=0;j<LADO;j++)
         {
            if(i==j) s+="* ";
            else if(i+j==LADO-1) s+="* ";
            else s+="  ";
         }
         
         //Saltar de linea entre cada fila
         s+="\n";
      }   
               
      //Mostrar el dibujo del rectangulo
      System.out.println(s);

      in.detener();
    }
    
    static void costeConsumicion()
    {
      //Variables
      int clientes = 0;
      int numeroDeConsumiciones = 0;
      double precioConsumicion = 0;
      String informe = "";
      
      //Programa
      System.out.println("* ****************************************************** */");
      System.out.println("* COSTE CONSUMICIONES                                    */");
      System.out.println("* ****************************************************** */");
      
      //Leer numero de clientes
      clientes = in.leerInt("Numero de clientes: ",v->v>=1,"El numero de clientes tiene que ser positivo");
      
      //Recorrer cada uno de los clientes
      for(int i=0;i<clientes;i++)
      {
         numeroDeConsumiciones = in.leerInt("Numero de consumiciones: ",v->v>=1 && v<=10,"El numero de consumiciones tiene que ser entre 1 y 10\n");
         precioConsumicion = in.leerDouble("Precio consumicion: ",v->v>=1 && v<=2.5 && (int)(v*100+0.5)/100.0==v,"El precio tiene que estar entre 1 y 2,5\n");
         informe+=String.format("%23d %18.2f %17.2f\n",numeroDeConsumiciones,precioConsumicion,numeroDeConsumiciones*precioConsumicion);
      }
      
      informe ="NUMERO DE CONSUMICIONES PRECIO CONSUMICION TOTAL CONSUMICION\n"+
               "======================= ================== =================\n"+
               informe; 
      informe=informe +
               "------------------------------------------------------------";   
      
      //Mostrar informe
      in.cls();
      System.out.println("* ****************************************************** */");
      System.out.println("* COSTE CONSUMICIONES                                    */");
      System.out.println("* ****************************************************** */");
      
      System.out.println(informe);
            
      in.detener();
    }
    
    static void numeroDeAmstrong()
    {
      //Variables
      int n = 0;
      int copia = 0;
      int digitos = 1;
      int total = 0;
      
      //Programa
      System.out.println("* ****************************************************** */");
      System.out.println("* NUMERO DE AMSTRONG                                     */");
      System.out.println("* ****************************************************** */");
      
      //Leer el número que se quiere comprobar si es un numero de Amstrong
      n = in.leerInt("Escribe un numero: ",v->v>0,"El numero tiene que ser positivo\n");
      
      //Obtener el número de digitos que tiene "n"
      while(true)
      {
         if(n<Math.pow(10,digitos)) break;
         digitos++;
      }
      
      //Copiar n;
      copia = n;
      
      //Obtener la suma de cada digito elevado a "digitos"
      while(true)
      {
         total+=(int) Math.pow(copia%10,digitos);
         copia/=10;
         if(copia==0) break;
      }
      
      //Comprobar si es un numero de Amstrong
      if(n==total) System.out.println("Es un número de Amstrong");
      else System.out.println("No es un número de Amstrong");
      
      in.detener();
    }

    static void submenuOperar()
    {
      //Constantes
      final int TOPE = 4;
      
      //Variables
      int opcion = 0;
       
      //Programa
      while(true)
      {
         in.cls();
         submenu();
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

    static void submenu()
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