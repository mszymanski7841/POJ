package Zad1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File exercise = new File("D:\\exercise");
        File plik1 = new File("D:\\exercise\\plik1.txt");
        File plik2 = new File("D:\\exercise\\plik2.txt");
        File plik3 = new File("D:\\exercise\\plik3.txt");
        File folder1 = new File("D:\\exercise\\folder1");
        File folder2 = new File("D:\\exercise\\folder2");
        InformationProvider info = new InformationProvider();
        if (!exercise.exists()) {
            if (exercise.mkdir()) {
                System.out.println("Utworzono folder");
                plik1.createNewFile();
                plik2.createNewFile();
                plik3.createNewFile();
                folder1.mkdir();
                folder2.mkdir();
            } else {
                System.out.println("Nie udało się stworzyć folderu");
            }
        }else{
            info.displayInformation(exercise);
            info.displayInformation(plik1);
            info.displayInformation(plik2);
            info.displayInformation(plik3);
            info.displayInformation(folder1);
            info.displayInformation(folder2);
        }
    }
}
