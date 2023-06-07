package Zad5;

public class Samochod {
    int predkosc = 0;
    String kolor;
    String marka;
    int rocznik;
    public Samochod(){
        kolor = "";
        marka = "";
        rocznik = 0;
    }
    public Samochod(int predkosc, String kolor, String marka, int rocznik){
        this.predkosc = predkosc;
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
    }
    public int przyspiesz(){
        if(predkosc+20>=140){
            return predkosc = 140;
        }
        return predkosc + 20;
    }
    public String toString(Samochod samochod){
        return kolor + " " + marka + " rocznik " + rocznik;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Samochod samochod = (Samochod) obj;
        return kolor.equals(samochod.kolor) && marka.equals(samochod.marka) && rocznik == samochod.rocznik;
    }
}
