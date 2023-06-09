package Zad7;

public class Kwadrat implements Figura{
     double bok;

    public Kwadrat(double bok){
        this.bok = bok;
    }
    public double obliczPole(){
        return Math.pow(bok,2);
    }
    public double obliczObwod(){
        return 4 * bok;
    }
}
