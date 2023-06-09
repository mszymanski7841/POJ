package Zad1;

import java.io.File;

public class InformationProvider {
    public void displayInformation(File file){
        System.out.println("Nazwa pliku: "+file.getName());
        System.out.println("Ścieżka: "+file.getAbsolutePath());
        System.out.println("Czy jest plikiem? "+ file.isFile());
        System.out.println("Czy jest katalogiem? "+file.isDirectory());
        System.out.println("Czy istnieje? " + file.exists());
    }
}
