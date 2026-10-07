package ex3;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti sirul: ");
        String sir = scanner.nextLine();

        System.out.print("Introduceti sirul de inserat: ");
        String deInserat = scanner.nextLine();

        System.out.print("Pozitia de inserare: ");
        int pozInserare = scanner.nextInt();

        System.out.print("Pozitia de la care se sterge: ");
        int pozStergere = scanner.nextInt();

        System.out.print("Numarul de caractere de sters: ");
        int nrCaractere = scanner.nextInt();

        scanner.close();

        StringBuilder sb1 = new StringBuilder(sir);
        sb1.insert(pozInserare, deInserat);
        System.out.println("Dupa inserare: " + sb1);

        StringBuilder sb2 = new StringBuilder(sir);
        sb2.delete(pozStergere, pozStergere + nrCaractere);
        System.out.println("Dupa stergere: " + sb2);
    }
}
