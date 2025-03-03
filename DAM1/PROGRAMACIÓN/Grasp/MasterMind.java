import fsg.in;
class MasterMind 
{
   public static void main (String args[]) 
   {
      //Variables
      int secreto = 0; //Numero secreto
      int numero = 0; //Numero introducido por el usuario
      //Variables para descomponer el número secreto
      int us = 0, ds = 0, cs = 0, ms = 0;
      //Variables para descomponer el número introducido por el usuario
      int un = 0, dn = 0, cn = 0, mn = 0;
      //Contador de muertos, heridos e intentos
      int muertos = 0, heridos = 0, intentos = 1;
                     
      //Programa
      in.cls();
      System.out.println("******************************************************************");
      System.out.println("* JUEGO DEL MASTER MIND                                          *");
      System.out.println("* Tienes que adivinar un número entre 1000 y 9999 en 10 intentos *");
      System.out.println("******************************************************************");
      
      secreto = (int)(Math.random()*10000); //Generar número secreto
      
      while(true)
      {
         //Leer numero del usuario
         numero = in.leerInt("Numero: ",v->v>=0 && v<=9999);
         
         //Descomponer numero secreto
         us = secreto%10;
         ds = secreto/10%10;
         cs = secreto/100%10;
         ms = secreto/1000;
         
         //Descomponer numero introducido por el usuario
         un = numero%10;
         dn = numero/10%10;
         cn = numero/100%10;
         mn = numero/1000;
         
         //Calcular numero de muertos
         if(un==us) us = 11; //Ver si se acertaron las unidades (evitar que pueda ser herido)
         if(dn==ds) ds = 12; //Ver si se acertaron las decenas (evitar que pueda ser herido)
         if(cn==cs) cs = 13; //Ver si se acertaron las centenas (evitar que pueda ser herido)
         if(mn==ms) ms = 14; //Ver si se acertaron las unidades de millar (evitar que pueda ser herido)
         muertos = us/10 + ds/10 + cs/10 + ms/10;
           
         //Calcular numero de heridos
         if(us<10) //El digito de las unidades del numero introducido puede herir
         { 
            if(un==ds) ds = 21; //Ver si las unidades del número coinciden con las decenas del secreto
            else if(un==cs) cs = 21; //Ver si las unidades del número coinciden con las centenas del secreto
            else if(un==ms) ms = 21; //Ver si las unidades del número coinciden con las unidades de mil del secreto
         }
         
         if(ds<10) //El digito de las decenas del numero introducido puede herir
         {
            if(dn==us) us = 22; //Ver si las decenas del número coinciden con las unidades del secreto
            else if(dn==cs) cs = 22; //Ver si las decenass del número coinciden con las centenas del secreto
            else if(dn==ms) ms = 22; //Ver si las decenas del número coinciden con las unidades de mil del secreto
         }
         
         if(cs<10) //El digito de las centenas del numero introducido puede herir
         {
            if(cn==us) us = 23; //Ver si las centenas del número coinciden con las unidades del secreto
            else if(cn==ds) cs = 23; //Ver si las centenas del número coinciden con las decenas del secreto
            else if(cn==ms) ms = 23; //Ver si las centenas del número coinciden con las unidades de mil del secreto
         }
         
         if(ms<10) //El digito de las unidades de millar del numero introducido puede herir
         {
            if(mn==us) us = 24; //Ver si las unidades de mil del número coinciden con las unidades del secreto
            else if(mn==ds) ds = 24; //Ver si las unidades de mil del número coinciden con las decenas del secreto
            else if(mn==cs) cs = 24; //Ver si las unidades de mil del número coinciden con las unidades de mil del secreto
         }
         heridos = us/20 + ds/20 + cs/20 + ms/20;
         
         //Mostrar numero, muertos y heridos sin saltar de línea
         System.out.printf("%04d %dM %dH ",numero,muertos,heridos);
         
         //Incrementar intentos
         intentos++;
         
         //Comporbar 
         if(muertos==4 || intentos==11) break;         
      }
      
      //Mostrar salida
      if(muertos==4) System.out.println("\nHas acertado el número");
      else System.out.println("\nEl número a adivinar era el "+secreto);
      
      //Detener el control
      in.detener();
   }	
}