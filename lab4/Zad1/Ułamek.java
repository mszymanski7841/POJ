public class Ułamek {
    int a;
    int b;

    public Ułamek(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void wyswietlanie(){
        System.out.println(a+"\n"+"-"+"\n"+b);
    }
    public void mnozenie(Ułamek innyUłamek){
        int mnozenieLicznik = innyUłamek.a * this.a;
        int mnozenieMianownik = innyUłamek.b * this.b;
        System.out.println(mnozenieLicznik+"\n"+"-\n"+mnozenieMianownik);
    }
    public void dzielenie(Ułamek innyUłamek){
        int mnozenieLicznik = innyUłamek.b * this.a;
        int mnozenieMianownik = innyUłamek.a * this.b;
        System.out.println(mnozenieLicznik+"\n"+"-\n"+mnozenieMianownik);
    }
    public void dodawanie(Ułamek innyUłamek){
        int wspMianownik = this.b * innyUłamek.b;
        int licznikA = this.a * innyUłamek.b;
        int licznikB = innyUłamek.a * this.b;
        int wspLicznik = licznikA + licznikB;
        System.out.println(wspLicznik+"\n-"+"\n"+wspMianownik);

    }
}
