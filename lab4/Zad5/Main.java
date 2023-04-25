public class Main {
    public static void main(String[] args) {

        Zawodnik[] zawodnicy = {
                new Zawodnik("Robert", 2, 12),
                new Zawodnik("Andrzej", 3, 15),
                new Zawodnik("Piotr", 5, 14)
        };
        int odleglosc = 50;
        while (true) {
            for (Zawodnik zawodnik : zawodnicy) {
                zawodnik.biegnij();
                if (zawodnik.dystans > odleglosc) {
                    System.out.println(zawodnik.imie + " wygrał!");
                    return;
                }
            }
        }
    }
}
