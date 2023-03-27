public class Zadanie4 {
    public static void main(String[] args) {
        Wiatrak w1 = new Wiatrak();
        Wiatrak w2 = new Wiatrak(3,"Black",10);

        w1.info();
        w2.info();
        w2.turnOn();
        w2.info();
    }

}
