import fsg.in;
class TableroAleatorio 
{
   public static void main (String args[]) 
   {
      //Variables
      int ancho = 0; //Ancho tablero
      int alto = 0; // Alto tablero
      int ale = 0; //Numero aleatorio de 0 y 1
      String s = ""; //Cadena con el tablero de salida
      
      //Programa
      in.cls();
      System.out.println("******************************************************************");
      System.out.println("* TABLERO ALEATORIO                                              *");
      System.out.println("******************************************************************");
         
      //Leer ancho del tablero
      ancho = in.leerInt("Ancho: ",v->v>2);
      
      //Leer ancho del tablero
      alto = in.leerInt("Alto: ",v->v>2);

      //Recorrer cada una de las filas del tablero (0, 1, ..., alto-1)
      for(int i=0;i<alto;i++)
      {
         //Mostrar linea del tablero
         for(int j=0;j<ancho;j++)
         {
            s+="|---";
         }
         s+="|\n";
         
         //Recorrer cada una de las columnas para cada uno de las filas
         for(int j=0;j<ancho;j++)
         {
            ale = (int)(Math.random()*2);
            s+="| "+ale+" ";
         }
         s+="|";
         
         //Saltar de linea entre cada fila
         s+="\n";
      }
      
      //Mostrar ultima linea del tablero
      for(int j=0;j<ancho;j++)
      {
         s+="|---";
      }
      s+="|\n"; 
               
      //Mostrar el dibujo del tablero
      System.out.println(s);

      //Detener el control
      in.detener();
 
   }	
}