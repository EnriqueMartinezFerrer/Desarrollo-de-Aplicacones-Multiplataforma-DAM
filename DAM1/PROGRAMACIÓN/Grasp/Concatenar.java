import fsg.in;
class Concatenar
{
   public static void main(String[] args)
   {
            //Variables
      String Nombre = "";
      String Ap1 = "";
      String Ap2 = "";
      int Dia = 0;
      int Mes = 0;
      int Año = 0;
      //Programa
      Nombre = in.leerString("Nombre: ");
      Ap1 = in.leerString("1º Apellido: ");
      Ap2 = in.leerString("2º Apellido: ");
      Dia = in.leerInt("Día: ");
      Mes = in.leerInt("Mes: ");
      Año = in.leerInt("Año: ");

      System.out.println("Me llamo" " "+ Nombre +" "+ Ap1 + " " + Ap2+ " " + "y nací el" + " "+Dia+"-"+Mes+"-"+Año);  
   }
}
 