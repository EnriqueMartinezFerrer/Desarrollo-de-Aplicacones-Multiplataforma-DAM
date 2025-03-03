package EMF;

import java.util.Scanner;

public class mar {
   public static Scanner sc=new Scanner(System.in);
//LEER BYTE
      public static byte leoByte(String escrito){
         while(true){
            try{
            System.out.print(escrito);
            return sc.nextByte();
            }
            catch(Exception e){
            System.out.println("El valor introducido está desbordado o no es un byte");
            sc.nextLine();
            }
      }
     }
//LEER SHORT
      public static short leoShort(String escrito){
         while(true){
            try{
            System.out.print(escrito);
            return sc.nextShort();
            }
            catch(Exception e){
            System.out.println("El valor introducido está desbordado o no es un short");
            sc.nextLine();
            }
          }
      }
//LEER LONG      
      public static long leoLong(String escrito){
         while(true){
            try{
            System.out.print(escrito);
            return sc.nextLong();
            }
            catch(Exception e){
            System.out.println("El valor introducido está desbordado o no es un long");
            sc.nextLine();
            }
          }
       }
//LEER FLOAT     
      public static float leoFloat(String escrito){
         while(true){
            try{
            System.out.print(escrito);
            return sc.nextFloat();
            }
            catch(Exception e){
            System.out.println("El valor introducido está desbordado o no es un float");
            sc.nextLine();
            }
          }
       }
//LEER DOUBLE    
      public static double leoDouble(String escrito){
         while(true){
            try{
            System.out.print(escrito);
            return sc.nextDouble();
            }
            catch(Exception e){
            System.out.println("El valor introducido está desbordado o no es un double");
            sc.nextLine();
            }
          }
       }
//LEER CHAR     
      public static char EscanearChar(String escrito){
         while(true){
            try{
            System.out.print(escrito);
            return sc.next().charAt(0);
            }
            catch(Exception e){
            System.out.println("El valor introducido está desbordado o no es un char");
            sc.nextLine();
            }
          }
       }
     
//LEER STRING             
       public static String leoString(String escrito) {
    while (true) {
      
        System.out.print(escrito);
        String k="";
        k = sc.next();
        if (!sc.nextLine().equals("")) {
          System.out.println("Pulsa enter al escribir el dato");
          continue;
        } 
        if(k.length()>0)
        return k;
        else
         {
           System.out.println("Texto vacío. \n ");
           continue;
         } 
       }
    } 
   }
