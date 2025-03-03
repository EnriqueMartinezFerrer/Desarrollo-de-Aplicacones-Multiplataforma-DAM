import fsg.in;
class PLANTILLA
{  
   static public void main(String[] args)
   {
      //Constantes
      
      //Variables
      int[] datos = new int[10];
      int[] positivos = null;
      int[] negativos = null;
       
      //Programa
      rellenar(datos);
      mostrar("",datos);
      positivos = crearPositivos(datos);
      mostrar("Positivos ***************\n",positivos);
      negativos = crearNegativos(datos);
      mostrar("Negativos: ",negativos);
      mostrar(datos);
      
    }
    
    static int[] crearNegativos(int[] datos)
    {
         int[] pos = new int[tamañoPositivos(datos)];
         int posicion = 0;
         
         for(int v:datos)
            if(v<0) //guardar en pos ¿en dónde?
            { 
               pos[posicion]=v;
               posicion++;
            }
         
         return pos;
    }

    
    static int[] crearPositivos(int[] datos)
    {
         int[] pos = new int[tamañoPositivos(datos)];
         int posicion = 0;
         
         for(int v:datos)
            if(v>0) //guardar en pos ¿en dónde?
            { 
               pos[posicion]=v;
               posicion++;
            }
         
         return pos;
    }
    
    static void tamañoPositivos(int[] datos, int[] n)
    {
       n[0] = 0;
       for(int v:datos)
         if(v>0) n[0]++;
    }
    
    static void tamañoNegativos(int[] datos, int[] n)
    {
       n[0] = 0;
       for(int v:datos)
         if(v<0) n[0]++;
    }

    
    static int tamañoPositivos(int[] datos)
    {
       int con = 0;
       for(int v:datos)
         if(v>0) con++;
       return con;
    } 
    
    static void rellenar(int[] a)
    {
      for(int i=0;i<a.length;i++)
         a[i] = (int)(Math.random()*21)-10;
    }
    static void mostrar(int[] datos)
    {
      mostrar("",datos);
    }
    static void mostrar(String mensaje,int[] datos)
    {
      System.out.print(mensaje);
      for(int i=0; i<datos.length;i++)
      {
         if(i>0) System.out.print(", ");
         System.out.print(datos[i]);
      }
      System.out.println();
    }
}