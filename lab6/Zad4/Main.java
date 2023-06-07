package Zad4;

public class Main {
    public static void main(String[] args) {
        Czas czas = new Czas(5,20);
        System.out.println(czas.toString());
        System.out.println(czas.dodajCzas(czas));
        System.out.println(czas.odejmijCzas(czas));
        System.out.println(czas.pomnozCzas(3));
    }
}
