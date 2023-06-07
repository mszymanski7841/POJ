package Zad3;

public class MojaData {
    int dni;
    int miesiac;
    int rok;
    public MojaData(){
        dni = 1;
        miesiac = 1;
        rok = 1970;
    }
    public MojaData(int dni, int miesiac, int rok){
        this.dni = dni;
        this.miesiac = miesiac;
        this.rok = rok;
    }
    public String toString(){
        return dni + "." + miesiac + "." + rok;
    }
    public String toStringD(){
        String dzienZ;
        if (dni < 10){
            dzienZ = "0" + dni;
        }else{
            dzienZ = String.valueOf(dni);
        }
        return dzienZ + "." + miesiac + "." + rok;
    }
    public String toStringM(){
        String miesiacS;
        miesiacS = String.valueOf(miesiac);
        switch (miesiac){
            case 1:
                miesiacS = "sty";
                break;
            case 2:
                miesiacS = "lut";
                break;
            case 3:
                miesiacS = "mar";
                break;
            case 4:
                miesiacS = "kwi";
                break;
            case 5:
                miesiacS = "maj";
                break;
            case 6:
                miesiacS = "cze";
                break;
            case 7:
                miesiacS = "lip";
                break;
            case 8:
                miesiacS = "sie";
                break;
            case 9:
                miesiacS = "wrz";
                break;
            case 10:
                miesiacS = "paz";
                break;
            case 11:
                miesiacS = "lis";
                break;
            case 12:
                miesiacS = "gru";
                break;
            default:
                break;
        }
            return dni + " " + miesiacS + " " + rok;
    }
}
