package Zad4;

public class Zawodnik {
    private String imie;
    private String nazwisko;
    private int numer;
    private int predkoscMax;

    public Zawodnik(String imie, String nazwisko, int numer, int predkoscMax){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer = numer;
        this.predkoscMax = predkoscMax;
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public int getNumer(){
        return numer;
    }
    public int getPredkoscMax(){
        return predkoscMax;
    }
}
