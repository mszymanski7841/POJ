package Zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Osoba osoba = null;
        while(osoba == null){
        System.out.println("Podaj imię");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj rok urodzenia");
        int rokUrodzenia = scanner.nextInt();
        scanner.nextLine();
        try{
            osoba = new Osoba(imie, nazwisko,rokUrodzenia);
            System.out.println(osoba.toString());
        }catch (Exception wyjatek){
            System.out.println("Wystąpił wyjątek! " + wyjatek.getMessage());
            System.out.println("Podaj dane ponownie.");
        }
    }
}
}
