import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok");
        int bok1 = scan.nextInt();
        System.out.println("Podaj drugi bok");
        int bok2 = scan.nextInt();
        System.out.println("Podaj trzeci bok");
        int bok3 = scan.nextInt();

        if(bok1 + bok2 > bok3 && bok1 + bok3 > bok2 && bok2 + bok3 > bok1){
            System.out.println("Mozna zbudowac trojkat");
        } else{
            System.out.println("Z podanych bokow nie mozna zbudowac trojkata");
        }

    }
}
