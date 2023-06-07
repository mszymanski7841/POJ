package Zad5;

public class Main {
    public static void main(String[] args) {
        Samochod samochod1 = new Samochod(120,"Szara","Toyota",2010);
        Samochod samochod2 = new Samochod(40, "Szara", "Toyota", 2010);
        SzybkiSamochod samochod3 = new SzybkiSamochod(190, "Szara", "Toyota", 2010);


        System.out.println(samochod3.przyspiesz());
        System.out.println(samochod1.przyspiesz());
        System.out.println(samochod1.toString(samochod1));
        System.out.println(samochod1.equals(samochod2));
        System.out.println(samochod1.equals(samochod3));
    }
}
