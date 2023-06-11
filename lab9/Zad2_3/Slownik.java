package Zad2_3;

import java.io.*;

public class Slownik <K,V> {
    private K[] klucze;
    private V[] wartosci;

    public Slownik(int size) {
        klucze = (K[])new Object[size];
        wartosci = (V[]) new Object[size];
    }

    public boolean dodaj(K klucz, V wartość) {
        for (int i = 0; i < klucze.length; i++) {
            if (klucze[i]==klucz) {
                wartosci[i] = wartość;
                return true;
            }
        }
        int wolnyIndeks = pierwszyWolnyIndeks();
        if (wolnyIndeks != -1) {
            klucze[wolnyIndeks] = klucz;
            wartosci[wolnyIndeks] = wartość;
            return true;
        }
        return false;
    }

    public boolean czyZawiera(K klucz){
        for(int i = 0; i<klucze.length; i++){
            if(klucze[i] == klucz){
                return true;
            }
        }
        return false;
    }
    public int wielkosc(){
        int iloscSlow = 0;
        for(int i=0; i<klucze.length;i++){
            if(klucze[i]!=null){
                iloscSlow++;
            }
        }
        return iloscSlow;
    }

    private int pierwszyWolnyIndeks(){
        if (klucze[0]==null){
            return 0;
        }
        int wolnyIndeks=1;
        for (int i=1;i<klucze.length; i++){
            if (klucze[i]==null){
                return i;
            }
            wolnyIndeks++;
        }
        return wolnyIndeks>klucze.length? -1:wolnyIndeks;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("[");
        for (int i=0;i<pierwszyWolnyIndeks();i++){
            buffer.append(String.format("%s->%s,", klucze[i], wartosci[i]));
        }
        if (buffer.length()>1){
            buffer.deleteCharAt(buffer.length()-1);
        }
        buffer.append("]");
        return buffer.toString();
    }

    public static Slownik<String, String> wczytajSlownik(File file) throws IOException {
        Slownik<String,String> slownik = null;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String linia;
        int iloscLinii = 0;
        while((linia = reader.readLine())!=null){
            iloscLinii++;
        }
        slownik = new Slownik<>(iloscLinii);
        reader.close();
        reader = new BufferedReader(new FileReader(file));
        int i = 0;
        while((linia = reader.readLine())!=null){
            String[] parts = linia.split("->");
            if(parts.length == 2){
                String klucz = parts[0].trim();
                String wartosc = parts[1].trim();
                slownik.dodaj(klucz,wartosc);
                i++;
            }
        }
        return slownik;
    }
}
