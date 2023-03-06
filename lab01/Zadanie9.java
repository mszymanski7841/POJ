import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj x1");
        int x1 = scan.nextInt();
        System.out.println("Podaj x2");
        int x2 = scan.nextInt();
        System.out.println("Podaj y1");
        int y1 = scan.nextInt();
        System.out.println("Podaj y2");
        int y2 = scan.nextInt();

        double x = (x2-x1);
        double y = (y2-y1);

       double powx = Math.pow(x,2);
       double powy = Math.pow(y,2);

       double odleglosc = Math.sqrt((powx+powy));

        System.out.println(odleglosc);

    }
}
