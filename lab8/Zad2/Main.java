package Zad2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("C:\\Users\\Matee\\IdeaProjects\\lab8hw\\Zad2\\Input");
        Scanner odczyt = new Scanner(plik);
        int suma = 0;
        int numerLinii = 1;
        while(odczyt.hasNext()){
            int linia = odczyt.nextInt();
            if(numerLinii %2 == 0) {
                suma += linia;
            }
            numerLinii++;
        }
        System.out.println(suma);
    }
}
