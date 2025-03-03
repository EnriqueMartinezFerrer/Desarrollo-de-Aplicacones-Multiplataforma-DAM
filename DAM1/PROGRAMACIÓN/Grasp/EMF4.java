//Enrique Martínez Ferrer
import EMF.mar;

class Examen4
{
   public static void main(String[] args)
   {
      //Variables
      String s="";
      
      int lado=mar.leoInt("Escribe número impar de filas y columnas: ");
      for(int i=0;i<lado;i++)
      {
         for(int j=0;j<lado;j++)
         {
            if (lado%2!=0){
               if (j==0 && i==0) s+="+ ";
               else if (i==lado-1 && j==0) s+="+ ";
               else if (j==lado-1 && i==0) s+="+ ";
               else if (i==lado/2 && j==0) s+="+ ";
               else if (j==lado/2 && i==0) s+="+ ";
               else if (i==lado/2 && j==lado-1) s+="+ ";
               else if (j==lado/2 && i==lado-1) s+="+ ";
               else if (i==lado-1 && j==lado-1) s+="+ ";
               else if (i==lado/2) s+="* ";
               else if (j==lado/2) s+="* ";
               else if (i+j==lado-1) s+="* ";
               else if (i==j) s+="* ";
               else s += "  ";
            }
         }
         s+="\n";
      }
      System.out.println(s);
      
        }
}