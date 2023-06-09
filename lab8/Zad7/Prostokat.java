package Zad7;

public class Prostokat implements Figura{
    double bok1;
    double bok2;

    public Prostokat(double bok1, double bok2){
        this.bok1 = bok1;
        this.bok2 = bok2;
    }
    public double obliczPole(){
        return bok1*bok2;
    }
    public double obliczObwod(){
        return (2*bok1)+(2*bok2);
    }
}
