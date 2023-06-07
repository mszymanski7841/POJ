package Zad5;

public class SzybkiSamochod extends Samochod{
    public SzybkiSamochod(int predkosc, String kolor, String marka, int rocznik){
        super(predkosc, kolor, marka, rocznik);
    }
    public int przyspiesz(){
        if(predkosc + 20 >= 200){
            return predkosc = 200;
        }
        return predkosc + 20;
    }
}
