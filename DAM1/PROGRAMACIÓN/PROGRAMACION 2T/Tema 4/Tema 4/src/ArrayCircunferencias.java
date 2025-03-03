import clases.figuras.*;
public class ArrayCircunferencias
{
   public static void main(String[] args)
   {
      Circunferencia[] c = new Circunferencia[10];
      for(int i=0;i<c.length;i++) //c[i]
         c[i] = new Circunferencia(Math.random()*9+1);
         
       for(int i=0;i<c.length;i++)
       {
         System.out.println("*** CIRCUNFERENCIA "+(i+1)+ "******");
         System.out.println("RADIO: "+c[i].getRadio());
         System.out.println("LONGITUD: "+c[i].longitud());
         System.out.println("AREA: "+c[i].area());
       }  
   }
}
