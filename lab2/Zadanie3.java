import java.util.Arrays;
import java.util.Scanner;

public class Zadanie3 {
    static void main (int tab1[], int tab2[], int a, int b){
        if(a!=b){
            System.out.println(Arrays.toString(new int[0]));
        }else{
        int[] liczby3 = new int[a];
        for(int i=0; i<a; i++){
            liczby3[i] = tab1[i]+tab2[i];
        }
        System.out.println(Arrays.toString(liczby3));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy nr 1");
        int wielkosc1 = scan.nextInt();
        int[] liczby1 = new int[wielkosc1];
        for(int i=0; i<wielkosc1; i++) {
            System.out.println("Podaj liczbe do tablicy");
            int liczba = scan.nextInt();
            liczby1[i] = liczba;
        }
        System.out.println("Podaj wielkosc tablicy nr 2");
        int wielkosc2 = scan.nextInt();
        int[] liczby2 = new int[wielkosc2];
        for(int i=0; i<wielkosc2; i++){
            System.out.println("Podaj liczbe do tablicy");
            int liczba = scan.nextInt();
            liczby2[i] = liczba;
        }

        main(liczby1,liczby2,wielkosc1,wielkosc2);


    }
}
