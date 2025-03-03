import fsg.in;
class Examen1
{
   public static void main(String[] args)
   {
      int o=1;
      int[] vi=null;
      do
      {
         menu();
         o=in.leerInt("OPCIÓN: ");
         switch (o)
         {
            case 1:vi=crearA();break;
            case 2:media(vi);break;
            case 3:rep(vi);break;
            case 4:showtC(vi);break;
            default :;
         }
      }
      while (o==1||o==2||o==3||o==4);
   }
   static void menu()
   {
      System.out.println("OPCIÓN    ACCIÓN\n======    ===================================\n  1       Crear Array, rellenarlo y mostrarlo\n  2       Obtener media, mayor y menor\n  3       Contar Repeticiones\n  4       Mostrar el array en formato celdas\nOtra        Terminar");
   }
   static int[] crearA()
   {
      System.out.println("****** CREAR ARRAY, RELLENARLO Y MOSTRARLO ********");
      int[] vi=new int[in.leerInt("Número de Datos: ",v->v>0&&v<26)];
      for (int i=0;i<vi.length;i++) vi[i]=(int)(Math.random()*10);
      for(int i=0;i<vi.length;i++)
      {
         if(i>0) System.out.print(", ");
         System.out.print(vi[i]);
      }
      System.out.println();
      return vi;
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
   }
}