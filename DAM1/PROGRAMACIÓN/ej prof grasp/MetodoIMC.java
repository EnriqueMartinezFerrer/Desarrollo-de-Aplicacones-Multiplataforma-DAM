import fsg.in;
class MetodoIMC
{  
   static public void main(String[] args)
   {
      //Variables
      double peso = 0;
      double altura = 0;
      double imc = 0;
      String tipo = "";
      
      //Programa
     
      for(int i=1;i<=10;i++)
      {
         in.cls(); //Limpiar la pantalla
         
         //Cabecera
         System.out.println("******************************************************************");
         System.out.println("* IMC con funciones y procedimientos                             *");
         System.out.println("******************************************************************");
      
         peso = leerPeso();  //Leer peso
         altura = leerAltura(); //Leer altura
         imc = obtenerIMC(peso,altura); //Obtener imc
         tipo = interpretacion(imc); //Obtener interpretacion
         mostrarInforme(i,peso,altura,imc,tipo);
         in.dormir(5000);
      }
      
      //Detener el control
      in.detener();
    }
    
    /* ******************************************************************************* */
    /* FUNCIONES                                                                       */
    /* ******************************************************************************* */
    static double leerPeso()
    {
         double peso = 0;
    
         peso = in.leerDouble("Introduce el peso: ",v->v>=2 && v<=120 && (int)(v*100)/100.0==v);
         
         return peso;
    }
    
    static double leerAltura()
    {
         double altura = 0;
         
         altura = in.leerDouble("Introduce la altura: ",v->v>=0.2 && v<=2.2 && (int)(v*10)/10.0==v);
         
         return altura;
    }
    
    static double obtenerIMC(double peso, double altura)
    {
         double imc = 0;
         
         imc = peso/(altura*altura);
         
         imc = (int)(imc*10+0.5)/10.0;
         
         return imc;
    }
    
    static String interpretacion(double imc)
    {
         String s="";
         
         if(imc<18.5) s="Peso insuficiente";
         else if(imc<=24.9) s="Normopeso";
         else if(imc<=26.9) s="Sobrepeso grado I";
         else if(imc<=29.9) s="Sobrepeso grado II (preobesidad)";
         else if(imc<=34.9) s="Obesidad de tipo I";
         else if(imc<=39.9) s="Obesidad de tipo II";
         else if(imc<=49.9) s="Obesidad de tipo III (morbida)";
         else s="Obesidad de tipo IV (extrema)";
         
         return s;
    }
    
    /* ******************************************************************************* */
    /* PROCEDIMIENTOS                                                                  */
    /* ******************************************************************************* */
    static void mostrarInforme(int numero, double peso, double altura, double imc, String interpretacion)
    {
         System.out.println("*********************************************************************");
         System.out.println("* INFORME DE INDICE DE MASA CORPORAL                                *");
         System.out.println("*********************************************************************");
         System.out.println("PERSONA NUMERO: "+numero);
         System.out.println("PESO: "+peso);
         System.out.println("ALTURA: "+altura);
         System.out.println("IMC: "+imc);
         System.out.println("INTERPRETACION: "+interpretacion);
    }
}