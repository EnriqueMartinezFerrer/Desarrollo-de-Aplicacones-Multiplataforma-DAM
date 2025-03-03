import fsg.in;
class Examen1
{
   public static void main(String[] args)
   {
      int o=1;
      int[] EM=null;
      do
      {
         menu();
         o=in.leerInt("OPCIÓN: ");
         switch (o)
         {
            case 1:EM=crearA();break;
            case 2:media(EM);break;
            case 3:rep(EM);break;
            case 4:showtC(EM);break;
            default :;
         }
      }
      while (o==1||o==2||o==3||o==4);
   }
   static void menu()
   {
      System.out.println("OPCIÓN    ACCIÓN\n======    ===================================\n  1       Crear Array, rellenarlo y mostrarlo\n  2       Obtener media, mayor y menor\n  3       Contar Repeticiones\n  4       Mostrar el array en formato celdas\nOtra      Terminar");
   }
   static int[] crearA()
   {
      System.out.println("****** CREAR ARRAY, RELLENARLO Y MOSTRARLO ********");
      int[] EM=new int[in.leerInt("Número de Datos: ",v->v>0&&v<26)];
      for (int i=0;i<EM.length;i++) EM[i]=(int)(Math.random()*10);
      for(int i=0;i<EM.length;i++)
      {
         if(i>0) System.out.print(", ");
         System.out.print(EM[i]);
      }
      System.out.println();
      in.detener();
      return EM;
   }
   static void media(int a[])
   {
      System.out.println("****** OBTENER LA MEDIA, EL MAYOR Y EL MENOR ********");
      int m=0,ma=0,me=26;
      for (int v:a) m+=v;
      m=(int)(m/a.length*10)/10;
      System.out.println("La media redondeada a un decimal es: "+m);
      for (int v:a) if (v>ma) ma=v;
      System.out.println("El mayor de los valores es: "+ma);
      for (int v:a) if (v<me) me=v;
      System.out.println("El menor de los valores es: "+me);
      in.detener();
   }
   static void rep(int a[])
   {
      System.out.println("****** INFORME DE LAS REPETICIONES DE CADA VALOR ********\nVALOR REPETICIONES\n===== ============");
      int[] b=new int[10];
      for (int i=0;i!=10;i++) for (int v:a) if (v==i) b[i]++;
      for (int i=0;i!=10;i++) if (b[i]!=0) System.out.printf("    %1d %12d\n",i,b[i]);
      System.out.println("------------------");
      in.detener();
   }
   static void showtC(int a[])
   {
      System.out.println("****** MOSTRAR ARRAY EN FORMATO CELDAS ********");
      String l1="|",l2="|";
      for (int v:a) 
      {
         l1+="---|";
         l2+=" "+v+" |";
      }
      System.out.println(l1+"\n"+l2+"\n"+l1+"\n");
      in.detener();
   }
}