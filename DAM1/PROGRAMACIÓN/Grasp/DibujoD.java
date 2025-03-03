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
                   0 *
                   1 + +
         Fia i     2 + a + 
                   3 + a a +
                   4 * + + + *
                   
        Se observa que se muestra * para las posiciones (i,j) siguientes:
          (0,0) i=0 y j=0
          (4,0) i=LADO-1 y j=0
          (4,4) i=LADO-1 Y J=LADO-1        
        y se observa que se muestra "+" para las posiciones (i,j) siguientes:
          (1,0) (2,0) (3,0) j=0 y i>0 y i<LADO-1
          (4,1) (4,2) (4,3) i=LADO-1 y j>0 yj<LADO-1
          (1,1) (2,2) (3,3) i=j i>0 y i<LADO=-1
        y se observa que se muestra "a" para las posiciones (i,j) siguientes:
          (2,1) (3,1) (3,2) i>j y i>1 y i<LADO-1
       y se muestra " " para el resto de las posiciones
       
        Conclusion:
          i=0 y j=0 --> *
          si no si i=LADO-1 y j=0 --> *
          si no si i=LADO-1 y j=LADO-1 --> *
          si no si j=0 --> +
          si no si i=LADO-1 --> +
          si no si i=j --> +
          si no si i>j --> a
          si no "  "
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
            if(i==0 && j==0) //i=j=0
               s+="* ";
            else if(i==LADO-1 && j==0) //i=LADO-1 y j=0               
               s+="* ";
            else if(i==LADO-1 && j==LADO-1) //i=j=LADO-1               
               s+="* ";
            else if(j==0) //j=0
               s+="+ ";
            else if(i==LADO-1) //i=LADO-1
               s+="+ ";
            else if(i==j) //i=j
               s+="+ ";
            else if(i>j) //i<j
               s+="a ";
            else s+="  ";
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