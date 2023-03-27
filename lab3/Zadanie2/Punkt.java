import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Punkt {
    int x;
    int y;

    public Punkt(){
        x = 0;
        y = 0;
    }
    public Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double odlegloscPunktow(int x, int y){
        double odlegloscx = this.x - x;
        double odlegloscy = this.y - y;
        double odleglosc = Math.sqrt(Math.pow(odlegloscx,2)+Math.pow(odlegloscy,2));
        return odleglosc;
    }
    public double odlegloscPunktow(Punkt innyPunkt){
        double odleglosc = Math.sqrt(Math.pow((innyPunkt.x - this.x),2)+Math.pow((innyPunkt.y - this.y),2));
        return odleglosc;
    }
}
