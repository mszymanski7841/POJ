import java.util.Scanner;
import java.util.Arrays;
public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy");
        int wielkosc = scan.nextInt();
        String[] znaki = new String[wielkosc];
        for(int i=0; i<wielkosc; i++){
            System.out.println("Podaj znak do tablicy");
            String znak = scan.next();
            znaki[i] = znak;
        }
        for(int i=0; i<wielkosc; i++){
            System.out.print(znaki[i]+";");
        }






    }
}
