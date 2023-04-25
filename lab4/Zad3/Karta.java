public class Karta {
    public Kolor kolor;
    public Figura figura;

    public Karta(Figura figura, Kolor kolor){
        this.figura = figura;
        this.kolor = kolor;
    }
    public String toString(){
        return figura + " " + kolor;
    }
}
