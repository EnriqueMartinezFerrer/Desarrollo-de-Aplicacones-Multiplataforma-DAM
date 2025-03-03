import fsg.in;
class DibujoF
{
   public static void main(String[] args)
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
                   1   * + *
         Fia i     2 * + + + * 
                   3   * + *
                   4     *
                   
        Se observa que se muestra * para las posiciones (i,j) siguientes:
          (0,2) (1,1) (2,2) i+j=LADO/2
          (0,2) (1,3) (2,4) j-i=LADO/2
          (2,0) (3,1) (4,2) i-j=LADO/2
          (2,4) (3,3) (4,2) i+j=LADO/2+2*(LADO/2)=3*(LADO/2)
        Se observa que se muestra + para las posiciones (i,j) siguientes:     
          (1,2) --> i+j>LADO/2 y j-i<LADO/2 y i-j<LADO/2 y i+j<3*(LADO/2)
        y en el resto de las posiciones se muestra "  
        " 
        Conclusion:
          i+j=LADO/2 --> *
          j-i=LADO/2 --> *
          i-j=LADO/2 --> *
          i+j=3*(LADO/2) --> *
          i+j>LADO/2 y j-i<LADO/2 y i-j<LADO/2 y i+j<3*(LADO/2) --> +
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
            if(i+j==LADO/2) s+="* ";
            else if(j-i==LADO/2) s+="* ";
            else if(i-j==LADO/2) s+="* ";
            else if(i+j==3*(LADO/2)) s+="* ";
            else if(i+j>LADO/2 && j-i<LADO/2 && i-j<LADO/2 && i+j<3*(LADO/2)) s+="+ ";
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