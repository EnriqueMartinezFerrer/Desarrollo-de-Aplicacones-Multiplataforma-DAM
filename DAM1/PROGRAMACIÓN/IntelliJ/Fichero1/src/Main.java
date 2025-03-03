import fsg.in;
import clases.Source;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        String FICHERO1 = Main.class.getResource("/fic/Nombres.txt").getFile();
        String FICHERO2 = "G:\\IntelliJ\\Fichero1\\src\\fic\\Nombres.txt";
        String a = in.leerString("Escribe un nombre: ");
        System.out.println(Source.FICHERO1);
        BufferedReader fe = new BufferedReader(new FileReader(FICHERO2));
        //System.out.println(Main.class.getResource("/fic/Nombres.txt"));
        String r;
        while((r=fe.readLine())!=null)
            System.out.println(r);
        fe.close();

        BufferedWriter fw = new BufferedWriter(new FileWriter(FICHERO2,true));
        fw.write(a);
        fw.newLine();
        fw.close();

        System.out.println(Source.FICHERO1);
    }
}
