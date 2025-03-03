import clases.Consumicion;

public class ConsumicionAplicacion {
    public static void main(String[] args)
    {
        //Array con las 10 consumiciones inicializadas a null
        Consumicion[] c = new Consumicion[10];
        
        //Array de aritculos
        Consumicion.Articulos[] articulos = Consumicion.Articulos.values();
        
        //Articulo, precio y unidades de cada consumiciÃ³n a generar aleatoriamente
        Consumicion.Articulos ar = Consumicion.Articulos.caña;
        double precio = 1;
        int unidades = 1;
        
        //Totalizador
        double total = 0;
        
        //Generar aleatoriamente las 10 consumiciones
        for(int i=0;i<c.length;i++)
        {
            ar = articulos[(int)(Math.random()*articulos.length)];
            unidades = (int)(Math.random()*20)+1;
            precio = ((int)(Math.random()*1000)+1)/100.0;
            
            c[i] = new Consumicion(ar,precio,unidades);
        }
        
        //Mostrar el informe
        System.out.println("ARTICULO  PRECIO UNIDADES COSTE CONSUMICION");
        System.out.println("========= ====== ======== =================");
        for(int i=0;i<c.length;i++)
        {
            System.out.printf("%-9s %6.2f %8d %17.2f\n",c[i].getArticulo().name(),c[i].getPrecio(),c[i].getNumeroDeUnidades(),c[i].coste());
            total+=c[i].coste();
        }
        System.out.println("                          =================");
        System.out.printf("%25s %17.2f\n", "", total);
    }
}
