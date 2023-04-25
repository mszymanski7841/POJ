public class Main {
    public static void main(String[] args) {
        Karta[] karty = new Karta[52];
        int i = 0;
        for (Kolor kolor : Kolor.values()) {
            for (Figura figura : Figura.values()) {
                karty[i] = new Karta(figura, kolor);
                i++;
            }
        }
        for (Karta karta : karty) {
            System.out.println(karta);
        }

    }

}
