import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj zakres liczb");
        System.out.println("od: ");
        int a = scan.nextInt();
        System.out.println("do: ");
        int b = scan.nextInt();
        Gra gra = new Gra(a,b);
        gra.newGame();

    }

}
