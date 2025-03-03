import fsg.in;
class PLANTILLA
{  
   static public void main(String[] args)
   {
      //Constantes
      
      //Variables
      int[] numero = new int[in.leerInt("Tamaño: ",v->v>0)];
      int posicionParPrimero = 0;
      int posicionImparUltimo = 0;
      
      //Programa
      rellenar(numero);
      mostrar(numero);
      moverHaciaLaDerecha(numero);
      mostrar(numero);
      invertir(numero);
      mostrar(numero);
      posicionParPrimero = posicionPrimerPar(numero);
      posicionImparUltimo = posicionUltimoImpar(numero);
      mostrarPosicionPrimerPar(posicionParPrimero);
      mostrarPosicionUltimoImpar(posicionImparUltimo);
      
    } 
    
    static void mostrarPosicionUltimoImpar(int posicion)
    {
         if(posicion==-1)
         {
            System.out.println("No hay impares");
            return;
         }
         
         System.out.println("El ultimo impar esta en la posicion "+posicion);
    }

    
    static void mostrarPosicionPrimerPar(int posicion)
    {
         if(posicion==-1)
         {
            System.out.println("No hay pares");
            return;
         }
         
         System.out.println("El primer par esta en la posicion "+posicion);
    }
    
    static int posicionUltimoImpar(int[] a)
    {
         int ui = -1;
         
         //Recorrer de izquierda a derecha
         for(int i=0;i<a.length;i++)
            if(a[i]%2==1) //es impar
                 ui = i;
            
         return ui;
    }

    static int posicionPrimerPar(int[] a)
    {
         int pp = -1;
         
         //Recorrer de izquierda a derecha
         for(int i=0;i<a.length;i++)
            if(a[i]%2==0) //es par
            {
                 pp = i;
                 break;
            }
            
         return pp;
    }
    
    static void invertir(int[] a)
    {
        int aux = 0;
        //Recorrer hasta la mitad i<--> tamaño-1-i
        for(int i=0;i<a.length/2;i++)
        {
            aux = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = aux;
        }
    } 
    
    static void moverHaciaLaDerecha(int[] b)
    {
        //Recordar el ultimo
        int aux = b[b.length-1];
        
        //Recorrer de derecha a izquierda hasta el 1
        for(int i=b.length-1;i>0;i--)
         b[i] = b[i-1];
         
        //Asignar al primero el último
        b[0] = aux;
    
    }
    
    static void rellenar(int[] datos)
    {
         for(int i=0;i<datos.length;i++)
            datos[i] = (int)(Math.random()*10);
    }
    
    static void mostrar(int[] datos)
    {
         for(int i=0; i<datos.length;i++)
      {
         if(i>0) System.out.print(", ");
         System.out.print(datos[i]);
      }
      System.out.println();

    }

}