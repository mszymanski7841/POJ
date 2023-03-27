import java.util.Scanner;
public class Bankomat {
    public Konto[] konta;
    public Bankomat(Konto[] konta){
        this.konta = konta;
    }
    public void Menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ID konta");
        int ID = scan.nextInt();
        if(ID>=0 && ID < konta.length && konta[ID] != null){
            while(true){
                System.out.println("Wybierz opcję:");
                System.out.println("1. Stan konta");
                System.out.println("2. Wpłata");
                System.out.println("3. Wypłata");
                System.out.println("4. EXIT");
                int opcja = scan.nextInt();

                if(opcja < 1 || opcja > 4){
                    System.out.printf("Podana opcja nie istnieje!");
                    continue;
                }
                if(opcja == 1){
                    konta[ID].checkBalance();
                }
                if(opcja == 2){
                    System.out.println("Podaj ilość do wpłacenia");
                    int amount = scan.nextInt();
                    konta[ID].depositFunds(amount);
                }
                if(opcja == 3){
                    System.out.println("Podaj ilość do wypłacenia");
                    int amount = scan.nextInt();
                    konta[ID].withdrawFunds(amount);
                }
                if(opcja == 4){
                    break;
                }
            }
            }else{
            System.out.println("Konto o podanym ID nie istnieje!");
        }

    }
}
