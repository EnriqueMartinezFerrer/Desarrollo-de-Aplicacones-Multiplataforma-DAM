import fsg.in;
class ParametrosPorReferencias
{  
   static public void main(String[] args)
   {
      //Constantes
      
      //Variables
      final double[] n = {0};
      final double[] m = {0};
      
      //Programa
      leerReal(n);
      leerReal(m);
      mostrar(n[0]);
      mostrar(m[0]);
      intercambiar(n,m);
      mostrar(n[0]);
      mostrar(m[0]);
      
    }
    
    static void intercambiar(final double[] a, final double[] b)
    {
         double aux = a[0];
         a[0] = b[0];
         b[0] = aux;
    }
    
    static void mostrar(double a)
    {
      System.out.println("Valor: "+a);
    }
    
    static void leerReal(final double[] a)
    {
      a[0] = in.leerDouble("Real: ");
    } 
}