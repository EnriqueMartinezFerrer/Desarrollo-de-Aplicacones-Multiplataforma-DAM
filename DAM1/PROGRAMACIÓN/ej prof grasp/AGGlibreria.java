package nadie;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.function.Predicate;

public class in {
  public static final Scanner in = new Scanner(System.in);
  
  public static void detener() {
    detener("Pulsa enter para continuar ... ");
  }
  
  public static void detener(String mensaje) {
    System.out.print(mensaje);
    in.nextLine();
  }
  
  public static byte leerByte(String mensaje) {
    byte valor = 0;
    while (true) {
      try {
        System.out.print(mensaje);
        valor = in.nextByte();
        if (!in.nextLine().equals("")) {
          System.out.println("Pulsa enter al escribir el dato");
          continue;
        } 
        break;
      } catch (Exception e) {
        System.out.println("Valor incorrecto o desbordado");
        in.nextLine();
      } 
    } 
    return valor;
  }
  
  public static byte leerByte() {
    return leerByte("ESCRIBE UN ENTERO DE 1 BYTE: ");
  }
  
  public static short leerShort(String mensaje) {
    short valor = 0;
    while (true) {
      try {
        System.out.print(mensaje);
        valor = in.nextShort();
        if (!in.nextLine().equals("")) {
          System.out.println("Pulsa enter al escribir el dato");
          continue;
        } 
        break;
      } catch (Exception e) {
        System.out.println("Valor incorrecto o desbordado");
        in.nextLine();
      } 
    } 
    return valor;
  }
  
  public static short leerShort() {
    return leerShort("ESCRIBE UN ENTERO CORTO: ");
  }
  
  public static int leerInt(String mensaje) {
    int valor = 0;
    while (true) {
      try {
        System.out.print(mensaje);
        valor = in.nextInt();
        if (!in.nextLine().equals("")) {
          System.out.println("Pulsa enter al escribir el dato");
          continue;
        } 
        break;
      } catch (Exception e) {
        System.out.println("Valor incorrecto o desbordado");
        in.nextLine();
      } 
    } 
    return valor;
  }
  
  public static int leerInt() {
    return leerInt("ESCRIBE UN ENTERO: ");
  }
  
  public static long leerLong(String mensaje) {
    long valor = 0L;
    while (true) {
      try {
        System.out.print(mensaje);
        valor = in.nextLong();
        if (!in.nextLine().equals("")) {
          System.out.println("Pulsa enter al escribir el dato");
          continue;
        } 
        break;
      } catch (Exception e) {
        System.out.println("Valor incorrecto o desbordado");
        in.nextLine();
      } 
    } 
    return valor;
  }
  
  public static long leerLong() {
    return leerLong("ESCRIBE UN ENTERO LARGO: ");
  }
  
  public static float leerFloat(String mensaje) {
    float valor = 0.0F;
    while (true) {
      try {
        System.out.print(mensaje);
        valor = in.nextFloat();
        if (!in.nextLine().equals("")) {
          System.out.println("Pulsa enter al escribir el dato");
          continue;
        } 
        break;
      } catch (Exception e) {
        System.out.println("Valor incorrecto o desbordado");
        in.nextLine();
      } 
    } 
    return valor;
  }
  
  public static float leerFloat() {
    return leerFloat("ESCRIBE UN REAL DE SIMPLE PRECISION: ");
  }
  
  public static double leerDouble(String mensaje) {
    double valor = 0.0D;
    while (true) {
      try {
        System.out.print(mensaje);
        valor = in.nextDouble();
        if (!in.nextLine().equals("")) {
          System.out.println("Pulsa enter al escribir el dato");
          continue;
        } 
        break;
      } catch (Exception e) {
        System.out.println("Valor incorrecto o desbordado");
        in.nextLine();
      } 
    } 
    return valor;
  }
  
  public static double leerDouble() {
    return leerDouble("ESCRIBE UN REAL: ");
  }
  
  public static boolean leerBoolean(String mensaje) {
    boolean valor = false;
    while (true) {
      System.out.print(mensaje);
      try {
        valor = in.nextBoolean();
      } catch (Exception e) {
        in.nextLine();
        System.out.println("Valor incorrecto");
        continue;
      } 
      if (!in.nextLine().equals("")) {
        System.out.println("Pulsa enter al escribir el dato");
        continue;
      } 
      break;
    } 
    return valor;
  }
  
  public static boolean leerBoolean() {
    return leerBoolean("ESCRIBE TRUE/FALSE: ");
  }
  
  public static String leerString(String mensaje) {
    String valor = "";
    while (true) {
      System.out.print(mensaje);
      valor = in.next();
      if (!in.nextLine().equals("")) {
        System.out.println("Pulsa enter al escribir el dato");
        continue;
      } 
      break;
    } 
    return valor;
  }
  
  public static String leerString() {
    return leerString("ESCRIBE UNA PALABRA: ");
  }
  
  public static String leerLine(String mensaje) {
    String valor = "";
    System.out.print(mensaje);
    valor = in.nextLine();
    return valor;
  }
  
  public static String leerLine() {
    return leerLine("ESCRIBE UNA LINEA: ");
  }
  
  public static char leerChar(String mensaje) {
    String valor = "";
    while (true) {
      System.out.print(mensaje);
      valor = in.next();
      if (valor.length() != 1) {
        System.out.println("Escribe un caracter");
        continue;
      } 
      if (!in.nextLine().equals("")) {
        System.out.println("Pulsa enter al escribir el dato");
        continue;
      } 
      break;
    } 
    return valor.charAt(0);
  }
  
  public static char leerChar() {
    return leerChar("ESCRIBE UN CARACTER: ");
  }
  
  public static void dormir(long tiempo) {
    try {
      Thread.sleep(tiempo);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } 
  }
  
  public static void proceso(String... s) {
    try {
      ProcessBuilder pb = new ProcessBuilder(s);
      pb.inheritIO().start().waitFor();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } 
  }
  
  public static void cls() {
    String so = System.getProperty("os.name");
    if (so.indexOf("Window") != -1) {
      proceso(new String[] { "cmd", "/c", "cls" });
    } else {
      for (int i = 0; i < 100; i++)
        System.out.println(""); 
    } 
  }
  
  public static byte leerByte(String mensaje, Predicate<Byte> v, String... error) {
    byte valor = 0;
    while (!v.test(Byte.valueOf(valor = leerByte(mensaje)))) {
      if (error.length > 0) {
        System.out.print(error[0]);
        continue;
      } 
      System.out.println("Valor incorrecto");
    } 
    return valor;
  }
  
  public static short leerShort(String mensaje, Predicate<Short> v, String... error) {
    short valor = 0;
    while (!v.test(Short.valueOf(valor = leerShort(mensaje)))) {
      if (error.length > 0) {
        System.out.print(error[0]);
        continue;
      } 
      System.out.println("Valor incorrecto");
    } 
    return valor;
  }
  
  public static int leerInt(String mensaje, Predicate<Integer> v, String... error) {
    int valor = 0;
    while (!v.test(Integer.valueOf(valor = leerInt(mensaje)))) {
      if (error.length > 0) {
        System.out.print(error[0]);
        continue;
      } 
      System.out.println("Valor incorrecto");
    } 
    return valor;
  }
  
  public static long leerLong(String mensaje, Predicate<Long> v, String... error) {
    long valor = 0L;
    while (!v.test(Long.valueOf(valor = leerLong(mensaje)))) {
      if (error.length > 0) {
        System.out.print(error[0]);
        continue;
      } 
      System.out.println("Valor incorrecto");
    } 
    return valor;
  }
  
  public static float leerFloat(String mensaje, Predicate<Float> v, String... error) {
    float valor = 0.0F;
    while (!v.test(Float.valueOf(valor = leerFloat(mensaje)))) {
      if (error.length > 0) {
        System.out.print(error[0]);
        continue;
      } 
      System.out.println("Valor incorrecto");
    } 
    return valor;
  }
  
  public static double leerDouble(String mensaje, Predicate<Double> v, String... error) {
    double valor = 0.0D;
    while (!v.test(Double.valueOf(valor = leerDouble(mensaje)))) {
      if (error.length > 0) {
        System.out.print(error[0]);
        continue;
      } 
      System.out.println("Valor incorrecto");
    } 
    return valor;
  }
  
  public static boolean leerBoolean(String mensaje, Predicate<Boolean> v, String... error) {
    boolean valor = false;
    while (!v.test(Boolean.valueOf(valor = leerBoolean(mensaje)))) {
      if (error.length > 0) {
        System.out.print(error[0]);
        continue;
      } 
      System.out.println("Valor incorrecto");
    } 
    return valor;
  }
  
  public static String leerString(String mensaje, Predicate<String> v, String... error) {
    String valor = "";
    while (!v.test(valor = leerString(mensaje))) {
      if (error.length > 0) {
        System.out.print(error[0]);
        continue;
      } 
      System.out.println("Valor incorrecto");
    } 
    return valor;
  }
  
  public static String leerLine(String mensaje, Predicate<String> v, String... error) {
    String valor = "";
    while (!v.test(valor = leerLine(mensaje))) {
      if (error.length > 0) {
        System.out.print(error[0]);
        continue;
      } 
      System.out.println("Valor incorrecto");
    } 
    return valor;
  }
  
  public static char leerChar(String mensaje, Predicate<Character> v, String... error) {
    char valor = Character.MIN_VALUE;
    while (!v.test(Character.valueOf(valor = leerChar(mensaje)))) {
      if (error.length > 0) {
        System.out.print(error[0]);
        continue;
      } 
      System.out.println("Valor incorrecto");
    } 
    return valor;
  }
}