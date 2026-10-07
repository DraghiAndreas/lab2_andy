package ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainFile {

    public static void main(String[] args) throws FileNotFoundException {

        String grup = "re";

        ArrayList<Vers> lista = new ArrayList<>();
        Scanner fisier = new Scanner(new File("src/ex2/cantec_in.txt"));

        while (fisier.hasNextLine()){
            lista.add(new Vers(fisier.nextLine()));
        }
        fisier.close();

        Vers[] versuri = lista.toArray(new Vers[0]);

        PrintStream out = new PrintStream("src/ex2/cantec_out.txt");
        Random random = new Random();

        for (int i = 0; i < versuri.length; i++) {
            Vers v = versuri[i];

            String text = v.getText();
            if (random.nextDouble() < 0.1) {
                text = v.Maj();
            }

            String linie = text + "   [cuvinte: " + v.nrCuv() + ", vocale: " + v.nrVoc() + "]";
            if (v.seTerm(grup)) {
                linie = linie + " *";
            }

            out.println(linie);
        }
        out.close();
    }

}
