import fsg.in;
import java.util.Arrays;

class EMFEV1
{
   public static void main(String[] args)
   {
      menu();
   }
   static void menu()
   {
      int[]em=new int[]{0};
      int opcion;
      while(true)
      {
         System.out.println("OPCIÓN     ACCIÓN");
         System.out.println("======     ===================================");
         System.out.println("  1        Crear array, rellenarlo y msotrarlo");
         System.out.println("  2        Obtener media, mayor, menor");
         System.out.println("  3        Contar repeticiones");
         System.out.println("  4        Mostrar el array en formato celdas");
         System.out.println("otra       Terminar");
         opcion=in.leerInt("OPCION: ");
         if(opcion<1||opcion>4)break;
         switch(opcion)
         {
            case 1:em=opcion1(em);break;
            case 2:opcion2(em);break;
            case 3:opcion3(em);break;
            case 4:opcion4(em);break;
         }
      }
      lib.printArrayInt(em);
   }
   static int[] opcion1(int[]a)
   {
      System.out.println("** CREAR ARRAY, RELLENARLO Y MOSTRARLO ****");
      a =new int[in.leerInt("Numero de datos: ",v->v>=1&&v<=25)];
      for(int i=0;i<a.length;i++) a[i]=(int)(Math.random()*10);
      lib.printArrayInt(a);
      lib.readKey();
      return a;
   }
   static void opcion2(int[]a)
   {
      System.out.println("** OBTENER LA MEDIA, EL MAYOR Y EL MENOR ****");
      double sum=0;
      double med=0;
      for(int v:a) sum+=v;
      double calc=sum/a.length;
      med=(int)(calc*10.0)/10.0;
      System.out.println("La media redondeada a un ecimal es "+med);
      Arrays.sort(a);
      System.out.println("El mayor de los valores es el "+a[a.length-1]);
      System.out.println("El menor de los valores es el "+a[0]);
      lib.readKey();
   }
   static void opcion3(int[]a)
   {
      int[]repet=new int[10];
      System.out.println("** INFORME DE LAS REPETICIONES DE VADA VALOR ****");  
      for(int i=0;i<a.length;i++)
      {
         for(int n=0;n<repet.length;n++)
         {
            if(a[i]==n) repet[n]++;
         }
      }
      System.out.println("VALOR REPETICIONES");
      System.out.println("===== ============");
      for(int i=0;i<repet.length;i++)
      {
         if(repet[i]>0) System.out.print("    "+i+"            "+repet[i]+"\n");
      }
      System.out.println("------------------");
      lib.readKey();
   }
   static void opcion4(int[]a)
   {
      System.out.println("** MOSTRAR ARRAY EN FORMATO CELDAS ****");
      for(int i=0;i<a.length;i++)
      {
         if(i==a.length-1) System.out.println("|---|");
         else System.out.print("|---"); 
      }
      for(int i=0;i<a.length;i++)
      {
         if(i==a.length-1) System.out.println("| "+a[i]+" |");
         else System.out.print("| "+a[i]+" ");
      }
      for(int i=0;i<a.length;i++)
      {
         if(i==a.length-1) System.out.println("|---|");
         else System.out.print("|---"); 
      }
      lib.readKey();
   }
}