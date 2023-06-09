package Zad7;

public class Kolo implements Figura{
    double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    public double obliczPole() {
        return Math.PI * Math.pow(promien,2);
    }

    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }
}
