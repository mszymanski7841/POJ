import java.lang.Math;
public class Kwadrat {
    int bok;
    int pole;
    int obwod;

    public Kwadrat(int bok){
        this.bok = bok;
    }
    public void poleKwadratu(){
        pole = bok*bok;
        System.out.println("Pole kwadratu wynosi: " + pole);
    }
    public void obwodKwadratu(){
        obwod = 4*bok;
        System.out.println("Obwód kwadratu wynosi: " + obwod);
    }
}
