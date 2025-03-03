import fsg.in;
class Ej30
{
   public static void main(String[] args)
   {
   //Nombre: Enrique Martínez Ferrer
            //Variables
       int Edad = in.leerInt("Edad entre 0 y 120: ",A->A>=0 && A<=120,"Edad incorrecta\n");
       float Num = in.leerFloat("Número real y positivo: ", A->A>0,"Incorrecto\n");
       double Peso = in.leerDouble("Peso entre 1.0 y 140.0: ", A->A>=1.0 && A<=140.0 && A==(A/10)*10, "Error\n");
       char Vocal = in.leerChar("Dime una vocal sin diéresis ni acentos: ",A->A=='a' || A=='e' || A=='i' || A=='o' || A=='u' || A=='A'|| A=='E' || A=='I' || A=='O' || A=='U',"Letra incorrecta\n");
        char Letra = in.leerChar("Dime una letra en minúsculas: ", A->A>=(char)97 && A<=(char)122 ,"Letras solo en minúsculas\n");
       //Salida
        System.out.println(Edad);
        System.out.println(Num); 
        System.out.println(Peso);
        System.out.println(Vocal);  
        System.out.println(Letra);                
        }
}
               