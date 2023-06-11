package Zad2_3;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Slownik<Integer, String> slownik1 = new Slownik<>(4);
        Slownik<String, String> slownik2 = new Slownik<>(4);
        File plik = new File("C:\\Users\\Matee\\IdeaProjects\\lab9hw\\Zad2\\slownik.txt");
        Slownik<String, String> slownikPlik = Slownik.wczytajSlownik(plik);

        slownik1.dodaj(1,"jeden");
        slownik1.dodaj(2,"dwa");
        slownik1.dodaj(3,"trzy");
        System.out.println(slownik1.toString());
        System.out.println(slownik1.czyZawiera(3));
        System.out.println(slownik1.czyZawiera(4));
        System.out.println(slownik1.wielkosc());
        slownik2.dodaj("Apple","Jabłko");
        slownik2.dodaj("Pineapple", "Ananas");
        slownik2.dodaj("Raspberries","Maliny");
        System.out.println(slownik2.toString());
        System.out.println(slownik2.czyZawiera("Apple"));
        System.out.println(slownik2.czyZawiera("Pear"));
        System.out.println(slownik2.wielkosc());
        slownik2.dodaj("Pear","Gruszka");
        System.out.println(slownik2.toString());

        System.out.println(slownikPlik);
        System.out.println(slownikPlik.wielkosc());
    }
}
