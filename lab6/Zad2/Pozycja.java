package Zad2;

public class Pozycja {
    String nazwaTowaru;
    int iloscSztuk;
    double cenaSztuki;

    public Pozycja (String nazwaTowaru, int iloscSztuk, double cenaSztuki){
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cenaSztuki = cenaSztuki;
    }
    public double obliczWartosc(){
        return iloscSztuk*cenaSztuki;
    }

    @Override
    public String toString() {
        return "Towar: " + nazwaTowaru + " Ilość: " + iloscSztuk + " Cena za sztukę: " + cenaSztuki + " Razem: " + obliczWartosc();
    }
}
