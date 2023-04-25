import java.util.Scanner;

public class Symulacja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Moneta moneta = new Moneta();
        System.out.println("Podaj ilość rzutów");
        double rzuty = scan.nextInt();
        moneta.rzutMoneta(rzuty);
    }
}
