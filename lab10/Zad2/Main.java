package Zad2;

import java.util.*;
import java.util.Random;

public class Main {
    private static Set<Integer> liczbyOdUzytkownika() {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> liczbyOdUzytkownika = new HashSet<>();
        int i = 0;
        while (i < 6) {
            System.out.println("Podaj liczbę z przedziału 1-49: ");
            try {
                int liczba = scanner.nextInt();
                if (liczba >= 1 && liczba <= 49 && !liczbyOdUzytkownika.contains(liczba)) {
                    liczbyOdUzytkownika.add(liczba);
                    i++;
                } else {
                    System.out.println("Podana liczba jest nieprawidłowa, lub została już wybrana!");
                }
            } catch (InputMismatchException e) {
                System.out.println("To nie jest liczba!");
                scanner.next();
            }
        }

        return liczbyOdUzytkownika;
    }
    private static Set<Integer> liczbyKomputer(){
        Set<Integer> liczbyKomputer = new HashSet<>();
        Random random = new Random();
        int i = 0;
        while(i<6){
            int liczba = random.nextInt(49-1) + 1;
            liczbyKomputer.add(liczba);
            i++;
        }
        return liczbyKomputer;
    }
    private static int trafienia(Set<Integer> liczbyOdUzytkownika, Set<Integer> liczbyKomputer){
        int trafienia = 0;
        for(int liczba : liczbyOdUzytkownika){
            if(liczbyKomputer.contains(liczba)){
                trafienia++;
            }
        }
        return trafienia;
    }
    public static void main(String[] args) {
        Set<Integer> liczbyOdUzytkownika = liczbyOdUzytkownika();
        Set<Integer> liczbyKomputer = liczbyKomputer();
        int iloscTrafien = trafienia(liczbyOdUzytkownika,liczbyKomputer);
        System.out.println(liczbyOdUzytkownika);
        System.out.println(liczbyKomputer);
        System.out.println(iloscTrafien);
    }
}
