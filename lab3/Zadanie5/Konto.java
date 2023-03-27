public class Konto {
    int ID;
    int balance = 0;

    public Konto(int ID, int balance){
        this.ID = ID;
        this.balance = balance;
    }
    public void checkBalance(){
        System.out.println("Stan konta: " + balance + " zł.");
    }
    public void depositFunds(int amount){
        balance += amount;
        System.out.println("Wpłacono na konto " + amount+" zł.");
    }
    public void withdrawFunds(int amount){
        if(balance > 0 && balance >= amount){
            balance -= amount;
            System.out.println("Wypłacono " + amount + " zł.");
        }else{
            System.out.println("Brak środków na koncie!");
        }
    }
}
