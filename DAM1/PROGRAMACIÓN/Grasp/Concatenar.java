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
      int A�o = 0;
      //Programa
      Nombre = in.leerString("Nombre: ");
      Ap1 = in.leerString("1� Apellido: ");
      Ap2 = in.leerString("2� Apellido: ");
      Dia = in.leerInt("D�a: ");
      Mes = in.leerInt("Mes: ");
      A�o = in.leerInt("A�o: ");

      System.out.println("Me llamo" " "+ Nombre +" "+ Ap1 + " " + Ap2+ " " + "y nac� el" + " "+Dia+"-"+Mes+"-"+A�o);  
   }
}
 