import EMF.coches;
import fsg.in;
class Aplicaci�n
{
   public static void main(String[] args)
   {
      coches c=new coches(in.leerString("Cual es la matr�cula: ",v->v.matches("[0-9]{4}[A-Z]+")),coches.Combustible.valueOf(in.leerString("Cual es el tipo de combustible",v->v.equals("gasoil")||v.equals("gasolina95")||v.equals("gasolina98"))),in.leerInt("Cuantos Litros: ",v->v>=0));
      System.out.println("El coche puede recorrer esta distancia: "+c.distancia()+"km");
      c.repostar((int)(Math.random()*21));
      System.out.println("El coche recorrer� m�s distancia: "+c.distancia()+"km");
   }
}