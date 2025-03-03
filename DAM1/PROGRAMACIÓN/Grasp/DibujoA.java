//Enrique Martínez Ferrer
import EMF.mar;
class EMF4
{
   public static void main (String args[]) 
   {
      //Variables
      int ancho = 0; //Ancho rectangulo
      int alto = 0; // Alto rectangulo
      String s = ""; //Cadena con el dibujo de salida
      
      //Programa
      System.out.println("******************************************************************");
      System.out.println("* DIBUJAR RECTANGULO                                             *");
      System.out.println("******************************************************************");
         
      /* ***************************************************************************************
      ancho = 8
      alto = 5
                        columna j
                     0 1 2 3 4 5 6 7
                   0 * * * * * * * *
                   1 * + + + + + + *
         Fia i     2 * + + + + + + *
                   3 * + + + + + + *
                   4 * * * * * * * *
                   
        Se observa que se muestra * para las posiciones (i,j) siguientes:
          (0,0) (0,1) (0,2) (0,3) (0,4) (0,5) (0,6) (0,7)   i = 0
          (4,0) (4,1) (4,2) (4,3) (4,4) (4,5) (4,6) (4,7)   i = alto-1
          (0,0) (1,0) (2,0) (3,0) (4,0) (5,0) (6,0) (7,0)   j = 0          
          (7,0) (7,0) (7,0) (7,0) (7,0) (7,0) (7,0) (7,0)   j = ancho-1
          (4,0) (4,2) (4,4) (4,6)   i y j pares
        y se observa que se muestra + para el resto de las posiciones
         
        Conclusion:
          i = 0 --> *
          i = alto-1 --> *
          j = 0 --> *
          j = ancho-1 --> *
          el resto --> +
          
      **************************************************************************************** */
      //Leer ancho del rectangulo
      ancho = in.leerInt("Ancho: ");
      anchito = ancho>2;
      //Leer ancho del rectangulo
      alto = in.leerInt("Alto: ");
      altito = alto>2;

      //Recorrer cada una de las filas del rectangulo (0, 1, ..., alto-1)
      for(int i=0;i<alto;i++)
      {
         //Recorrer cada una de las columnas para cada uno de las filas
         for(int j=0;j<ancho;j++)
         {
            if(i==0) //i=0
               s+="* ";
            else if(i==alto-1) //i=alto-1
               s+="* ";
            else  if(j==0) //j=0
               s+="* ";
            else if(j==ancho-1) //j=ancho-1
               s+="* ";
            else
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