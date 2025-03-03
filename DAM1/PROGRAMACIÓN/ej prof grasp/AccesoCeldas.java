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
      //a) Se introducirán los datos del array por la consola
      for(int i=0;i<a.length;i++)
         a[i] = in.leerDouble("Dato: ");
      
      // b) Si el valor de la segunda celda es mayor 
      //que el de la primera celda, se incrementará en 
      //un uno el valor de la tercera celda; 
      //si no, se le asignará a la tercera celda un 
      //valor aleatorio real entre 0 y 1 
      //(este último sin incluir).
      if(a[1]>a[0]) a[2]++;
      else a[2] = Math.random();
      
      //c) Se mostrarán los valores de las tres celdas 
      //en una misma línea separados por comas.
      //System.out.println(a[0]+", "+a[1]+", "+a[2]);
      for(int i=0;i<a.length;i++)
      {
         if(i>0) System.out.print(", ");
         System.out.print(a[i]);
      }
      System.out.println();
      
      //Se generará una posición aleatoria del
       //array (un valor entre 0 y 2, ambos inclusive). 
       //La celda aleatoria generada se le asignará como 
       //valor la suma de las otras dos celdas.
       ale = (int)(Math.random()*3);
       switch(ale)
       {
            case 0: a[0]=a[1]+a[2]; break;
            case 1: a[1]=a[0]+a[2]; break;
            case 2: a[2]=a[1]+a[0]; break;
       }
       
      //e) Se mostrarán los valores de las tres celdas 
      //en una misma línea separados por comas.
      for(int i=0;i<a.length;i++)
      {
         if(i>0) System.out.print(", ");
         System.out.print(a[i]);
      }
      System.out.println();
      
      //f) Se reinicializará el array a uno de tamaño 
      //2 con valores aleatorios de números enteros
      // entre 0 y 9, ambos inclusive
      n = in.leerInt("Tamaño: ",v->v>0);
      a = new double[n];
      for(int i=0;i<a.length;i++)
      { 
            a[i] = (int)(Math.random()*10);
      };
      
      //g) Se mostrará el contenido de las dos celdas 
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