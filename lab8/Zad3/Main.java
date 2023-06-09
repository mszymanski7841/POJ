package Zad3;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Matee\\IdeaProjects\\lab8hw\\Zad3\\basedir");
        File[] katalogi = file.listFiles();
        int maxPlikow = 0;
        File katalogZMaxPlikami = null;
        for(File katalog:katalogi){
            int iloscPlikow = policzPliki(katalog);
            if(iloscPlikow>maxPlikow){
                maxPlikow = iloscPlikow;
                katalogZMaxPlikami = katalog;
            }
        }
        System.out.println("Najwięcej plików znajduje się w katalogu: " + katalogZMaxPlikami);
        System.out.println("Ilość plików: " + maxPlikow);
    }

    public static int policzPliki(File katalog) {
        File[] pliki = katalog.listFiles();
        return pliki.length;
    }
}

