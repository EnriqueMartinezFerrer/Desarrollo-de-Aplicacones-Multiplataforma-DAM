import fsg.in;
class Estudiante
{
   public static void main(String[] args)
   {
      String ciclo = "";
      String nombre = "";
      
      
     
     //Programa
     ciclo = in.leerLine("Nombre del ciclo: ");
     nombre = in.leerString("Nombre: ");
     int edad = in.leerInt("Edad: ");
     float peso = in.leerFloat("Peso: ");
     char letra = in.leerChar("Letra del DNI: ");
     boolean carnet = in.leerBoolean("Tienes Carnetde conducir: ");
     



     
     System.out.println(ciclo+"\n"+nombre+"\n"+edad+"\n"+peso+"\n"+letra+"\n"+carnet);
           
    }
}