import fsg.in;
class DibujoB 
{
   public static void main (String args[]) 
   {
      //Variables
      int ancho = 0; //Ancho rectangulo
      int alto = 0; // Alto rectangulo
      String s = ""; //Cadena con el dibujo de salida
      
      //Programa
      in.cls();
      System.out.println("******************************************************************");
      System.out.println("* DIBUJAR RECTANGULO                                             *");
      System.out.println("******************************************************************");
         
      /* ***************************************************************************************
      ancho = 8
      alto = 5
                        columna j
                     0 1 2 3 4 5 6 7
                   0 * + * + * + * +
                   1 + * + * + * + *
         Fia i     2 * + * + * + * +
                   3 + * + * + * + *
                   4 * + * + * + * +
                   
        Se observa que se muestra * para las posiciones (i,j) siguientes:
          (0,0) (0,2) (0,4) (0,6)   i y j pares
          (1,1) (1,3) (1,5) (1,7)   i y j impares
          (3,1) (3,3) (3,5) (3,7)   i y j pares
          (2,0) (2,2) (2,4) (2,6)   i y j impares
          (4,0) (4,2) (4,4) (4,6)   i y j pares
          
        Se observa que se muestra + para las posiciones (i,j) siguientes:
          (0,1) (0,3) (0,5) (0,7)   i par y j impar
          (1,0) (1,2) (1,4) (1,6)   i impar y j par
          (2,1) (2,3) (2,5) (2,7)   i par y j impar
          (3,0) (3,2) (3,4) (3,6)   i impar y j par
          (4,1) (4,3) (4,5) (4,7)   i par y j impar
          
          Conclusion:
          i y j pares --> *
          i y j impares --> *
          i par y j impar --> +
          i impar y j par --> +
          
      **************************************************************************************** */
      //Leer ancho del rectangulo
      ancho = in.leerInt("Ancho: ",v->v>2);
      
      //Leer ancho del rectangulo
      alto = in.leerInt("Alto: ",v->v>2);

      //Recorrer cada una de las filas del rectangulo (0, 1, ..., alto-1)
      for(int i=0;i<alto;i++)
      {
         //Recorrer cada una de las columnas para cada uno de las filas
         for(int j=0;j<ancho;j++)
         {
            if(i%2==0 && j%2==0) // i y j pares
               s+="* ";
            else if(i%2==1 && j%2==1) // i y j impares
               s+="* ";
            else  if(i%2==0 && j%2==1) // i par y j impar
               s+="+ ";
            else //i impar y j par
               s+="+ ";
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