package Zad2;

public class Main {
    public static void main(String[] args) {
        Pozycja[] pozycje = new Pozycja[2];
        Zamowienie zamowienie = new Zamowienie();

        pozycje[0] = new Pozycja("Chleb", 2, 4.5);
        pozycje[1] = new Pozycja("Mleko", 4, 3.25);

        zamowienie.dodajPozycje(pozycje[0]);
        zamowienie.dodajPozycje(pozycje[1]);
        System.out.println("Spis pozycji: ");
        System.out.println(zamowienie.toString());

        double wartoscZamowienia = zamowienie.obliczWartosc();
        System.out.println("Wartosc zamowienia wynosi: " + wartoscZamowienia);

    }
}
