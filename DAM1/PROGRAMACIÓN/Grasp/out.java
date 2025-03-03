package iaup;

import java.util.Scanner;

public class out {
   public static Scanner lectura=new Scanner(System.in);
//LEER BYTE
      public static byte EscanearByte(String entero){
         while(true){
            try{
            System.out.print(entero);
            return lectura.nextByte();
            }
            catch(Exception e){
            System.out.println("El valor introducido está desbordado o no es un byte");
            lectura.nextLine();
            }
      }
     }
//LEER SHORT
      public static short EscanearShort(String entero){
         while(true){
            try{
            System.out.print(entero);
            return lectura.nextShort();
            }
            catch(Exception e){
            System.out.println("El valor introducido está desbordado o no es un short");
            lectura.nextLine();
            }
          }
      }
//LEER INT      
      public static int EscanearInt(String entero){
         while(true){
            try{
            System.out.print(entero);
            return lectura.nextInt();
            }
            catch(Exception e){
            System.out.println("El valor introducido está desbordado o no es un int");
            lectura.nextLine();
            }
          }
       }
//LEER LONG      
      public static long EscanearLong(String entero){
         while(true){
            try{
            System.out.print(entero);
            return lectura.nextLong();
            }
            catch(Exception e){
            System.out.println("El valor introducido está desbordado o no es un long");
            lectura.nextLine();
            }
          }
       }
//LEER FLOAT     
      public static float EscanearFloat(String entero){
         while(true){
            try{
            System.out.print(entero);
            return lectura.nextFloat();
            }
            catch(Exception e){
            System.out.println("El valor introducido está desbordado o no es un float");
            lectura.nextLine();
            }
          }
       }
//LEER DOUBLE    
      public static double EscanearDouble(String entero){
         while(true){
            try{
            System.out.print(entero);
            return lectura.nextDouble();
            }
            catch(Exception e){
            System.out.println("El valor introducido está desbordado o no es un double");
            lectura.nextLine();
            }
          }
       }
//LEER CHAR     
      public static char EscanearChar(String caracter){
         while(true){
            try{
            System.out.print(caracter);
            return lectura.next().charAt(0);
            }
            catch(Exception e){
            System.out.println("El valor introducido está desbordado o no es un char");
            lectura.nextLine();
            }
          }
       }
//LEER STRING             
      public static String EscanearString(String texto){
         System.out.print(texto);
         return lectura.next();
        }
    }
