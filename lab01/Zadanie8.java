import java.util.Scanner;
import java.util.Arrays;


public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tab = new int[3];
        for(int i = 0; i<tab.length; i++){
            System.out.println("Podaj liczbe");
            tab[i] = scan.nextInt();
        }
        Arrays.sort(tab);

        for(int i= 2; i>=0; i--){
            System.out.println(tab[i]);
        }


    }
}
