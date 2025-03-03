import clases.Repostar;
import clases.enumerados.Semana;
import fsg.in;

public class RepostarArray {
    public static void main(String[] args)
    {
        Repostar[] r = new Repostar[0];
        int opcion = 0;
        while (true)
        {
            in.cls();
            menu();
            opcion = in.leerInt("OPCION: ");
            if(opcion<1 || opcion>4) break;
            in.cls();
            switch(opcion)
            {
                case 1: r = repostar(r); break;
                case 2: gastoDiario(r); break;
                case 3: gastoDiaSemana(r); break;
                case 4: veces(r); break;
            }
            in.detener();
        }
    }
    
    static void menu()
    {
        System.out.println("OPCION ACCION");
        System.out.println("====== ==============================================");
        System.out.println("     1 Repostar");
        System.out.println("     2 Gasto diario");
        System.out.println("     3 Gasto por d�a de la semana");
        System.out.println("     4 Veces que reposto por rango de litros");
    }
    
    static Repostar[] repostar(Repostar[] a)
    {
        //Array con los días de la semana
        Semana[] semana = Semana.values();
        
        //Semana, precio y litros del repostaje
        Semana s; //Dia de la semana
        int dia; //Día numerico
        double litros; //Litros
        double precio; //Precio
        
        //Nuevo repostaje
        Repostar r;
        
        //Leer día numerico validandolo
        dia = in.leerInt("DIA (1-7): ",v->v>=1 && v<=7);
        s = semana[dia-1];
        //Leer catidad de litros validandolo
        litros = in.leerDouble("LITROS: ",
                v->v>=1 && v<=50 && (int)(v*10+0.5)/10.0 == v,
                "Valor incorrecto: Tiene que estar entre 1 y 50 y con un máximo de un decimal\n");
        //Leer precio del litro validandolo
        precio = in.leerDouble("PRECIO: ",
                v->v>=0.5 && v<=1.5 && (int)(v*1000+0.5)/1000.0 == v,
                "El precio tiene que estar entre 0.500 y 1.500 y con un máximo de tres decimales\n");
        
        
        //Crear el nuevo repostaje
        r = new Repostar(s,litros,precio);
        
        //Añadir el nuevo repostaje
        Repostar[] nuevo = new Repostar[a.length+1];
        System.arraycopy(a, 0, nuevo, 0, a.length);
        nuevo[a.length]=r;
        
        System.out.println("Repstaje a�adido");
        return nuevo;
    }
    
    static void gastoDiario(Repostar[] a)
    {
        double total = 0;
        
        System.out.println("**********************************************");
        System.out.println("* INFORME DEL GASTO DE CADA DIA              *");
        System.out.println("**********************************************\n");
        System.out.println("DIA DIA DE LA SEMANA PRECIO LITRO LITROS REPOSTADOS COSTE REPOSTAJE");
        System.out.println("=== ================ ============ ================= ===============");
        for(int i=0;i<a.length;i++)
        {
            total+=a[i].coste(2);
            System.out.printf("%3d %-16s %12.3f %17.1f %15.2f\n", 
               i+1,a[i].getDia().name(),a[i].getPrecio(),a[i].getCantidad(),a[i].coste(2));
        }
        System.out.println("                                                    ===============");
        System.out.printf("%51s %15.2f\n","",total);
    }
    
    static void gastoDiaSemana(Repostar[] a)
    {
        //Array con el total de litros y coste de cada dia de la semana
        double[] litros = new double[7];
        double[] total = new double[7];
        
        //Obtener el total de litros y coste de cada dia de la semana
        for(int i=0;i<a.length;i++)
        {
            int dia = a[i].getDia().ordinal();
            litros[dia]+=a[i].getCantidad();
            total[dia]+=a[i].coste();
        }
        
        System.out.println("**********************************************");
        System.out.println("* INFORME DEL GASTO DE CADA DIA DE LA SEMANA *");
        System.out.println("**********************************************\n");
        System.out.println("DIA DE LA SEMANA LITROS TOTAL GASTO PRECIO MEDIO");
        System.out.println("================ ====== =========== ============");
        for(int i=0;i<litros.length;i++)
        {
            double pm = (litros[i]==0)?0:total[i]/litros[i];
            System.out.printf("%-16s %6.1f %11.2f %12.3f\n",
                    Semana.values()[i].name(),litros[i],total[i],pm);
        }
        System.out.println("------------------------------------------------");  
    }
    
    static void veces(Repostar[] a)
    {
        //Array con el numero de veces
        int[] veces = new int[5];
        
        //Obtener el numero de veces
        for(int i=0;i<a.length;i++)
            veces[(int)(a[i].getCantidad()-0.1)/10]++;
        
        System.out.println("**************************************************");
        System.out.println("* INFORME NUMERO DE REPOSTAJE POR RANGO DE LITROS *");
        System.out.println("***************************************************\n");
        System.out.println("RANGO DE LITROS VECES");
        System.out.println("=============== =====");
        for(int i=0;i<veces.length;i++)
            System.out.printf("%-14s %5d\n",
                    "("+i*10+","+(i+1)*10+ "]" ,veces[i]); 
    }
}
