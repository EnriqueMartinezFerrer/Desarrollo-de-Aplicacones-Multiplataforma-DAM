import fsg.in;
class PLANTILLA
{  
   static public void main(String[] args)
   {
      //Constantes
      
      //Variables
      int[] datos = new int[in.leerInt("Numero de datos: ",v->v>0)];
      int[] repeticiones = new int[100];
      int[] valores; //Array con los valores que mas se repiten //maximo numero de repeticiones
      
      int maximo = 0;
      
      //Programa
      rellenar(datos);
      contarRepeticiones(datos, repeticiones);
      maximo = mayorRepeticiones(repeticiones);
      valores = valoresMaximasRepeticiones(repeticiones,maximo);
      mostrarValores(valores);
    } 
    
    static void rellenar(int[] datos)
    {
         for(int i=0;i<datos.length;i++)
           datos[i] = (int)(Math.random()*100);
    }
    
    static void contarRepeticiones(int[] datos, int[] repeticiones)
    {
         for(int v:datos)
            repeticiones[v]++;
    }
    
    static int mayorRepeticones(int[] repeticiones)
    {
         int n = 0;
         for(int v:repeticiones)
            if(v>n) n = v;
         return n;
    }
    
    static int contarMaximasRepeticiones(int[] repeticiones)
    {
        int maximo = mayorRepeticiones(repeticiones);
        int con = 0;
        for(int v:repeticiones)
         if(v==maximo)
            con++;
        return con;
    }
    
    static int[] valoresMaximasRepeticiones(int[] repeticiones, int maximo)
    {
        int[] val = new int[contarMaximasRepeticiones(repeticiones)];
        int pos = 0;
        for(int i=0;i<repeticiones.length;i++)
            if(repeticiones[i]==maximo)
               val[pos++]=i;
         
         return val;
    }
    
    static void mostrarValores(int[] valores)
    {
      if(valores.length==1) System.out.print("El valor que mas se repite es ");
      else System.out.println("Los valores que mas se repiten son ");
      for(int i=0; i<datos.length;i++)
      {
         if(i>0) System.out.print(", ");
         System.out.print(datos[i]);
      }
      System.out.println();
    }
}