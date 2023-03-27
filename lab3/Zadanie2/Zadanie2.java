public class Zadanie2 {
    public static void main(String[] args) {
        Punkt p1 = new Punkt(3,4);
        Punkt p2 = new Punkt(5,10);
        Punkt p3 = new Punkt();

        double odleglosc2 = p3.odlegloscPunktow(4,5);
        double odleglosc = p1.odlegloscPunktow(p2);
        System.out.println("Odleglosc  punktu p1 od p2 wynosi: "+odleglosc);
        System.out.println("odleglosc punktu p3 od x=4 y=5 wynosi: " +odleglosc2);
    }
}
