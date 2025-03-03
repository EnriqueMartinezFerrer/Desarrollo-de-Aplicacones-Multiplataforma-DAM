

import fsg.in;
class CarreraDeCaballos 
{
   public static void main (String args[]) 
   {
      //Variables
      int ale = 0; //Caballo que avanza
      //Contadores de avance de cada caballo
      int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0;
      //Salida de cada caballo
      String s1 = "1", s2 = "2", s3 = "3", s4 = "4", s5 = "5", s6 = "6";
      
      //Programa
      while(true)
      {
         //Generar caballo aleatorio
         ale = (int)(Math.random()*6)+1;
         
         //Avanzar el caballo generado aleatoriamene
         switch(ale)
         {
            case 1:  s1 = "* "+s1; //Avanza el caballo 1
                     c1++; //Incrementar el contador del caballo 1
                     break;
            case 2:  s2 = "* "+s2; //Avanza el caballo 2
                     c2++; //Incrementar el contador del caballo 2
                     break;
            case 3:  s3 = "* "+s3; //Avanza el caballo 3
                     c3++; //Incrementar el contador del caballo 3
                     break;
            case 4:  s4 = "* "+s4; //Avanza el caballo 4
                     c4++; //Incrementar el contador del caballo 4
                     break;
            case 5:  s5 = "* "+s5; //Avanza el caballo 5
                     c5++; //Incrementar el contador del caballo 5
                     break;
            default: s6 = "* "+s6; //Avanza el caballo 6
                     c6++; //Incrementar el contador del caballo 6
                     break;
         }
         
         //limpiar pantalla
         in.cls();
         System.out.println("******************************************************************");
         System.out.println("* CARRERA DE CABALLOS                                            *");
         System.out.println("******************************************************************");
         
         //Mostrar pantalla
         System.out.println(s1);
         System.out.println(s2);
         System.out.println(s3);
         System.out.println(s4);
         System.out.println(s5);
         System.out.println(s6);
         
         //Comprobar si hay caballo ganador
         if(c1==10 || c2==10 || c3==10 || c4==10 || c5==10 || c6==10) break;
         
         //Dormir 1 segundo
         in.dormir(1000);
     }
      
      
      //Mostrar caballo ganador
      System.out.println("El caballo ganador es el "+ale);
      
      //Detener el control
      in.detener();
 
   }	
}