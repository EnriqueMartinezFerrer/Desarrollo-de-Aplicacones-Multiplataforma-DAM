import fsg.in;
import java.util.*;
class PLANTILLA
{  
   static public void main(String[] args)
   {
      //Constantes
      
      //Variables
      int[] avances;
      final int n; //numero de caballos
      int cab; //Ultimo caballo que avanza
      
      //Programa
      n = leerNumeroDeCaballos();
      avances = new int[n];
      while(true)
      {
         cab = generarCaballo(n);
         avanzaCaballo(cab,avances);
         mostrar(avances);
         if(finalizar(avances)) break;
         detener();
       }
       
       mostrarCaballoGanador(cab);
      
    }
    
    static void mostrarCaballoGanador(int caballoGanador)
    {
         System.out.println("El caballo ganador es el "+(caballoGanador+1));
    }
    
    static boolean finalizar(int[] puntos)
    {
       for(int valor:puntos)
         if(valor==20) return true;
       return false;
    }
    
    static void detener()
    {
         in.dormir(1000);
    }
    
    static void mostrar(int[] puntos)
    {
         in.cls();
         //Recorrer todos los caballos cuyos puntos estan en "puntos"
         for(int i=0;i<puntos.length;i++) //puntos[i] = 5
         {
            for(int j=0;j<puntos[i];j++)
            {
               System.out.print("* ");
            }
            System.out.println(i+1);
         }
    }
    
    static void avanzaCaballo(int caballoQueAvanza,int[] puntos)
    {
      puntos[caballoQueAvanza]++;
    }
    
    static int generarCaballo(int numero)
    {
         int caballo = 0;
         caballo = (int)(Math.random()*numero);
         return caballo;
    }
    
    static int leerNumeroDeCaballos()
    {
         return in.leerInt("Introduce número de caballos: ",
               v->v>=2);
    }
}