package Zad2;

public class Zamowienie {
    Pozycja pozycje[];
    int maxRozmiar;

    public Zamowienie(){
        maxRozmiar = 10;
        pozycje = new Pozycja[maxRozmiar];
    }
    public Zamowienie(int maxRozmiar){
        this.maxRozmiar = maxRozmiar;
    }
    public void dodajPozycje(Pozycja pozycja){
        if (pozycje[pozycje.length - 1] != null){
            System.out.println("Maksymalny rozmiar zamowienia zostal przekroczony");
        }else{
            int i = 0;
            while(pozycje[i] != null){
                    i++;
            }
            pozycje[i] = pozycja;
        }
    }
    public double obliczWartosc(){
        double suma = 0;
        for(Pozycja pozycje : pozycje){
            if(pozycje != null){
                suma += pozycje.obliczWartosc();
            }
        }
        return suma;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Pozycja pozycje : pozycje){
            if(pozycje != null){
                sb.append(pozycje.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
