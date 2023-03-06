import java.util.Scanner;


public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe studentow");
        int num = scan.nextInt();
        int max = 0;
        String imie, imie2;
        System.out.println("Podaj imie");
        imie = scan.next();
        System.out.println("Podaj ilosc punktow");
        int pkt = scan.nextInt();
        for (int i = 0; i < num-1; i++) {
            System.out.println("Podaj imie");
            imie2 = scan.next();
            System.out.println("Podaj ilosc punktow");
             pkt = scan.nextInt();
            if (pkt > max) {
                max = pkt;
                imie = imie2;

            }

        }
        System.out.println(max +" " + imie);
    }
}
