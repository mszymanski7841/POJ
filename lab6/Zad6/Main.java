package Zad6;

public class Main {
    public static String usunElementy(int n, String... strings) {
        StringBuilder wynik = new StringBuilder();
        int i = 0;
        for (String str : strings) {
            if (i % n == 0) {
                wynik.append(str).append(" ");
            }
            i++;
        }
        return wynik.toString();
    }

    public static void main(String[] args) {
        String wynik = usunElementy(2, "Ala", "nie", "ma", "test", "kota i", "psa", "papugę");
        System.out.println(wynik);
    }
}