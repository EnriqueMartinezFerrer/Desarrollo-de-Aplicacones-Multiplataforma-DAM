import fsg.in;
class PLANTILLA
{  
   static public void main(String[] args)
   {
      //Constantes
      
      //Variables
      int[] a = new int[10];
      
      //Programa
      //Rellenar aletoriamente con valores entre 0 y 9
      for(int i=0;i<a.length;i++) //a[i]
         a[i] = (int)(Math.random()*10);
         
      //Mostrar separando los valores con una coma
     mostrar(a);
      
      //Sumar 1 a los pares y -1 a los impares
      for(int i=0;i<a.length;i++) // a[i]=8
         if(a[i]%2==0) a[i]++;
         else a[i]--;
         
      //Mostrar separando los valores con una coma
      mostrar(a);
      
      //Duplicar cada valor del array menores que 5
      for(int i=0; i<a.length;i++) //a[i]
         if(a[i]<5) //a[i] --> a[i]*2
            a[i]*=2;
            
      //Mostrar separando los valores con una coma
     mostrar(a);
      
      //Acumular a cada celda un valor entre -5 y 5
      for(int i=0;i<a.length;i++) //a[i] 
         a[i] += (int)(Math.random()*11)-5;
         
      //Mostrar separando los valores con una coma
      mostrar(a);
      


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