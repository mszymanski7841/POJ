import java.util.Scanner;

public class Zadanie7 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj pierwsza litere:");
        char litera = scan.next().charAt(0);
        System.out.println("Podaj druga litere:");
        char litera2 = scan.next().charAt(0);

        if(litera == litera2){
            System.out.println("Litery sa takie same i wystepuja na tym samym miejscu w alfabecie");
        } else if (litera<litera2){
            System.out.println("Litera " + litera2 + " wystepuje pozniej niz litera "+litera);
        } else {
            System.out.println("Litera " + litera + " wystepuje pozniej niz litera "+litera2);
        }
    }
}
