package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> lista = new ArrayList<>();

        Scanner FileScanner = new Scanner(new File("src/ex1/judete_in.txt"));
        while(FileScanner.hasNextLine()){
            String linie = FileScanner.nextLine().trim();
            if(!linie.isEmpty()){
                lista.add(linie);
            }
        }

        String[] judete = lista.toArray(new String[0]);

        Collator collator = Collator.getInstance(new Locale("ro", "RO"));
        collator.setStrength(Collator.PRIMARY);
        Arrays.sort(judete, collator);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti judetul : ");
        String cautat = scanner.nextLine().trim();
        scanner.close();

        int poz = Arrays.binarySearch(judete,cautat,collator);

        System.out.println("Pozitia : " + poz);
        }

    }

