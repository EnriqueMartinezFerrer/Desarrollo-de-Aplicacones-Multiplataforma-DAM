//Enrique Martínez Ferrer
//Todo cuenta :)
import fsg.in;

class RecorrerArrays
{
   public static void main(String[] args)
   {
      //Variables
      int[]a=new int[10];
      //Programa
      for(int i=0;i<a.length;i++)
      a[i] = (int)(Math.random()*10);
      
      
      for(int i=0; i<a.length;i++)
      {
         if(i>0) System.out.print(", ");
         System.out.print(a[i]);
       }
       System.out.println();
       
       //Sumar 1 a los pares y -1 a los impares
       for(int i=0; i<a.length;i++) //a[i]=8
         if(a[i]%2==0) a[i]++;
         else a[i]--;
       //Mostrar valore separados con una coma
       for(int i=0; i<a.length;i++)
      {
         if(i>0) System.out.print(", ");
         System.out.print(a[i]);
       }
       System.out.println();
      //
      for(int i=0; i<a.length;i++)
         if(a[i]<5) 
            a[i]*=2;
       

      
       //
       for(int i=0; i<a.length;i++)
      {
         if(i>0) System.out.print(", ");
         System.out.print(a[i]);
       }
       System.out.println();
       //
       for(int i=0; i<a.length;i++)
         a[i] += (int)(Math.random()*11)-5;
       //
       for(int i=0; i<a.length;i++)
      {
         if(i>0) System.out.print(", ");
         System.out.print(a[i]);
       }
       System.out.println();



   }
}