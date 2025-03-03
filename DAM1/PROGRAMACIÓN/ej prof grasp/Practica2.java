import fsg.in;
class Practica2
{
   public static void main(String[] args)
   {
      //Variables
      String Nombre= "";
      int Altura= 0;
      double edad= 0;
      boolean carnet= "";
      char letra="\0";
      String Nombre2= "";
      int Altura2= 0;
      double edad2= 0;
      boolean carnet2= "";
      char letra2="\0";
            
      //Programa
      //Leer datos
      Nombre = in.leerLine("Nombre y apellidos: ");
      Altura = in.leerInt("Edad: ");
      edad = in.leerDouble("Altura: ");
      carnet = in.leerBoolean("Carnet de conducir: ");
      letra = in.leerChar("Letra: ");
      Nombre2 = in.leerLine("Nombre y apellidos: ");
      Altura2 = in.leerInt("Edad: ");
      edad2 = in.leerDouble("Altura: ");
      carnet2 = in.leerBoolean("Carnet de conducir: ");
      letra2 = in.leerChar("Letra: ");
      
      //Mostrar informe

      System.out.println("NOMBRE            EDAD  ALTURA   CARNET  LETRA");
      System.out.println("================  ====  ======   ======  =====");
      System.out.printf("%-16s %5d %,6.2f %-6B %5C\n",Nombre,Altura,edad,carnet,letra);
      System.out.printf("%-16s %5d %,6.2f %-6B %5C\n",Nombre2,Altura2,edad2,carnet2,letra2);
      System.out.println("----------------  ----  ------   ------  -----");

      
   }
}
