package Zad6;

public class TransformacjaString {
    public static String usunZnaki(String tekst, Znak znak){
        String regex = null;
        switch(znak){
            case SPOLGLOSKA -> regex ="[^aeiouyAEIOUY]";
            case SAMOGLOSKA -> regex = "[aeiouyAEIOUY]";
            case SPACJA -> regex = "[\\s]";
            case LICZBA -> regex = "[0-9]";
            case ZNAK_SPECJALNY -> regex = "[^a-zA-Z0-9 ]";
        }
        if(regex != null){
            tekst = tekst.replaceAll(regex, "");
        }
        return tekst;
    }
    public static String podmienZnaki(String tekst, Znak znak, String podmien){
        String regex = null;
        switch(znak){
            case SPOLGLOSKA -> regex ="[^aeiouyAEIOUY]";
            case SAMOGLOSKA -> regex = "[aeiouyAEIOUY]";
            case SPACJA -> regex = "[\\s]";
            case LICZBA -> regex = "[0-9]";
            case ZNAK_SPECJALNY -> regex = "[^a-zA-Z0-9 ]";
        }
        if(regex != null){
            tekst = tekst.replaceAll(regex, podmien);
        }
        return tekst;
    }
    public static String pozostawZnaki(String tekst, Znak znak) {
        String regex = null;
        switch(znak){
            case SPOLGLOSKA -> regex ="[aeiouyAEIOUY]";
            case SAMOGLOSKA -> regex = "[^aeiouyAEIOUY]";
            case SPACJA -> regex = "[^\\s]";
            case LICZBA -> regex = "[^0-9]";
            case ZNAK_SPECJALNY -> regex = "[a-zA-Z0-9 ]";
        }
        if(regex != null){
            tekst = tekst.replaceAll(regex, "");
        }
        return tekst;
    }
}
