import fsg.in;
class PLANTILLA
{  
   static public void main(String[] args)
   {
      //Constantes
      
      //Variables
      //Declarar un array de reales con 3 celdas
      double[] a = new double[10]; //{0,0,0}
      int ale = 0;
      int n = 0;
     
      //Programa
      //a) Se introducir�n los datos del array por la consola
      for(int i=0;i<a.length;i++)
         a[i] = in.leerDouble("Dato: ");
      
      // b) Si el valor de la segunda celda es mayor 
      //que el de la primera celda, se incrementar� en 
      //un uno el valor de la tercera celda; 
      //si no, se le asignar� a la tercera celda un 
      //valor aleatorio real entre 0 y 1 
      //(este �ltimo sin incluir).
      if(a[1]>a[0]) a[2]++;
      else a[2] = Math.random();
      
      //c) Se mostrar�n los valores de las tres celdas 
      //en una misma l�nea separados por comas.
      //System.out.println(a[0]+", "+a[1]+", "+a[2]);
      for(int i=0;i<a.length;i++)
      {
         if(i>0) System.out.print(", ");
         System.out.print(a[i]);
      }
      System.out.println();
      
      //Se generar� una posici�n aleatoria del
       //array (un valor entre 0 y 2, ambos inclusive). 
       //La celda aleatoria generada se le asignar� como 
       //valor la suma de las otras dos celdas.
       ale = (int)(Math.random()*3);
       switch(ale)
       {
            case 0: a[0]=a[1]+a[2]; break;
            case 1: a[1]=a[0]+a[2]; break;
            case 2: a[2]=a[1]+a[0]; break;
       }
       
      //e) Se mostrar�n los valores de las tres celdas 
      //en una misma l�nea separados por comas.
      for(int i=0;i<a.length;i++)
      {
         if(i>0) System.out.print(", ");
         System.out.print(a[i]);
      }
      System.out.println();
      
      //f) Se reinicializar� el array a uno de tama�o 
      //2 con valores aleatorios de n�meros enteros
      // entre 0 y 9, ambos inclusive
      n = in.leerInt("Tama�o: ",v->v>0);
      a = new double[n];
      for(int i=0;i<a.length;i++)
      { 
            a[i] = (int)(Math.random()*10);
      };
      
      //g) Se mostrar� el contenido de las dos celdas 
      //con el siguiente formato:
      for(int i=0;i<a.length;i++)
      {
         System.out.print("|---");
      }
      System.out.println("|");
      for(int i=0;i<a.length;i++)
      {
          System.out.print("| "+(int)a[i]+" ");
      }
      System.out.println("|");

      for(int i=0;i<a.length;i++)
      {
         System.out.print("|---");
      }
      System.out.println("|");
     
      
    } 
}