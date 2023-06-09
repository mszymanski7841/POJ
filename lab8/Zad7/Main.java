package Zad7;

public class Main {
    public static void main(String[] args) {
        Figura[] figury = new Figura[3];
        figury[0] = new Kwadrat(3);
        figury[1] = new Prostokat(4,5);
        figury[2] = new Kolo(4);

        for (Figura figura : figury){
            System.out.println("Pole: " + figura.obliczPole());
            System.out.println("Obwód: " + figura.obliczObwod());
            System.out.println("");
        }
    }
}
