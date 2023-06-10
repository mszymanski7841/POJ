package Zad4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst do przeanalizowania");
        String tekst = scanner.nextLine();
        analizaTekstu(tekst);

    }
    private static void analizaTekstu(String tekst){
        int dlugoscTekstu = tekst.length();
        int iloscLiter = 0;
        int iloscSamoglosek = 0;
        int iloscSpolglosek = 0;
        int iloscBialychZnakow = 0;
        int iloscLiczb = 0;
        int iloscInnychZnakow = 0;
        for(int i = 0; i<dlugoscTekstu; i++){
            char c = tekst.charAt(i);
            if(Character.isLetter(c)){
                iloscLiter++;
                if(czySamogloska(c)){
                    iloscSamoglosek++;
                }else {
                    iloscSpolglosek++;
                }
            }
            if(Character.isWhitespace(c)){
                iloscBialychZnakow++;
            }
            if(Character.isDigit(c)){
                iloscLiczb++;
            }
            if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)){
                iloscInnychZnakow++;
            }

        }
        System.out.println("Podany tekst " + tekst +" zawiera:");
        System.out.println(iloscLiter+ " liter, w tym " + iloscSamoglosek + " samogłosek oraz " + iloscSpolglosek +" spółgłosek");
        System.out.println(iloscBialychZnakow + " białych znaków");
        System.out.println(iloscLiczb + " liczb");
        System.out.println(iloscInnychZnakow + " innych znaków");
    }
    private static boolean czySamogloska(char c){
        c = Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }else{
            return false;
        }
    }
}
