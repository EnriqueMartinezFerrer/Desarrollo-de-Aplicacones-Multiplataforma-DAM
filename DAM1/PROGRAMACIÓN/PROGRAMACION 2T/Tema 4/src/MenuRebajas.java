import fsg.in;
import clases.Rebajas;
public class MenuRebajas
{  
   static public void main(String[] args)
   {
      //Constantes
      final int TOPE = 3;
      
      //Variables
      Rebajas r = new Rebajas(1.0,10);
      int opcion = 0;
      
      //Programa
      while(true)
      {
         in.cls();
         menu();
         opcion = leerOpcion();
         if(opcion<1 ||opcion>TOPE) break;
         in.cls();
         switch(opcion)
         {
            case 1: introducirPrecio(r); break;
            case 2: introducirPorcentaje(r); break;
            case 3: obtenerPrecioAnterior(r); break;         }
       }
    } 
    
    /* MENU DE OPCIONES */
    static void menu()
    {
         System.out.println("OPCION ACCION");
         System.out.println("====== ===================================");
         System.out.println("   1   Introducir el precio actual");
         System.out.println("   2   Introducir el porcentaje de rebaja");
         System.out.println("   3   Obtener el precio sin la rebaja");
         System.out.println(" otra  Finalizar");
    }
    
    static int leerOpcion()
    {
         return in.leerInt("OPCION: ");
    }
    
    /* OPCIONES DEL MENU */
    static void introducirPrecio(Rebajas reb)
    {
         double nuevoPrecio = 0;
         
         nuevoPrecio = in.leerDouble("PRECIO NUEVO: ");
         reb.setPrecio(nuevoPrecio);
         in.detener();
    }
    
    static void introducirPorcentaje(Rebajas reb)
    {
         int porcentaje = 0;
         
         porcentaje = in.leerInt("PORCENTAJE: ",v->v>=10 && v<=80);
         reb.setPorcentaje(porcentaje);
         
         in.detener();
    }
    
    static void obtenerPrecioAnterior(Rebajas reb)
    {
         System.out.println("PRECIO ACTUAL: "+reb.getPrecio());
         System.out.println("PORCENTAJE REBAJA: "+reb.getPorcentaje());
         System.out.println("PRECIO ANTERIOR: "+reb.precioAnterior());
         in.detener();
    }
}