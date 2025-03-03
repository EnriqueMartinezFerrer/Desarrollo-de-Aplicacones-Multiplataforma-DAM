import fsg.in;
class PLANTILLA
{  
   static public void main(String[] args)
   {
      //Constantes
      
      //Variables
      double[] temp = rellenar();
      double mayor, menor, media, mediaSin;
      
      //Programa
      mostrar(temp);
      mayor = mayor(temp);
      menor = menor(temp);
      media = media(temp);
      mediaSin = media(temp,mayor,menor);
      mostrar("Media de todos las temperaturas: ",media);
      mostrar("Media de todas las temperaturas intermedias: ",mediaSin);
      
    }
    
    static void mostrar(String mensaje, double media)
    {
         System.out.println(mensaje + media);
    }
    
    static double media(double[] a, double mayor, double menor)
    {
         double suma = 0;
         int con = 0;
         for(double v:a)
            if(v>menor && v<mayor)
            {
               suma+=v;
               con++;
            }
            
          //if(con==0) throw new IllegalArgumentException("Division por cero");
               
          return suma/con;
                 
    }
    
    static double media(double[] a)
    {
        double suma = 0;
        for(double v:a)
            suma+=v;
            
         return suma/a.length;
    }
    
    static double menor(double[] a)
    {
         double menor = a[0];
         for(double v:a) if(v<menor) menor = v;
         return menor;
    }
    
    static double mayor(double[] a)
    {
         double mayor = a[0];
         for(double v:a) if(v>mayor) mayor = v;
         return mayor;
    }

    
    static void mostrar(double[] datos)
    {
      for(int i=0; i<datos.length;i++)
      {
         if(i>0) System.out.print(", ");
         System.out.print(datos[i]);
      }
      System.out.println();

    }
 
    
    static double leer()
    {
         double a = 0;
         a = in.leerDouble("Escribe una temperatura: ",
               v->v>=-10 && v<=50);
         return a;
    }
    
    static double[] rellenar()
    {
       double[] a = new double[10];
       for(int i=0;i<a.length;i++)
         a[i] = leer();
         
        return a;
    }
}