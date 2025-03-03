import fsg.in;
class DibujoC 
{
   public static void main (String args[]) 
   {
      //Constantes
      final int LADO; //Lado del cuadrado

      //Variables
      String s = ""; //Cadena con el dibujo de salida
      
      //Programa
      in.cls();
      System.out.println("******************************************************************");
      System.out.println("* DIBUJAR CUADRADO                                               *");
      System.out.println("******************************************************************");
         
      /* ***************************************************************************************
         LADO = 5
                        columna j
                     0 1 2 3 4
                   0     *  
                   1     *
         Fia i     2 * * * * * 
                   3     *
                   4     *
                   
        Se observa que se muestra * para las posiciones (i,j) siguientes:
          (2,0) (2,1) (2,2) (2,3) (2,4 ) i = LADO/2
          (0,2) (1,2) (2,2) (3,2) (4,2)  j = LADO/2        
        y se observa que se muestra "  " para el resto de las posiciones
         
        Conclusion:
          i = LADO/2 --> *
          j = LADO/2 --> *
          el resto --> "  "
          
      **************************************************************************************** */
      //Leer lado del cuadrado
      LADO = in.leerInt("Lado: ",v->v>2 && v%2==1);
      
      //Recorrer cada una de las filas del cuadrado (0, 1, ..., LADO-1)
      for(int i=0;i<LADO;i++)
      {
         //Recorrer cada una de las columnas para cada uno de las filas
         for(int j=0;j<LADO;j++)
         {
            if(i==LADO/2) //i=LADO/2
               s+="* ";
            else if(j==LADO/2) //j=LADO/2               
               s+="* ";
            else
               s+="  ";
         }
         
         //Saltar de linea entre cada fila
         s+="\n";
      }   
               
      //Mostrar el dibujo del rectangulo
      System.out.println(s);

      //Detener el control
      in.detener();
 
   }	
}