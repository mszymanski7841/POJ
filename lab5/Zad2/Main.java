public class Main {
    public static void main(String[] args) {
        Bakery b1 = new Bakery("Gdańsk, Podwale Staromiejskie 9", 20);
        Bookshop bs1 = new Bookshop("Gdańsk, Długa 12", 50);
        System.out.println(b1.getInformation());
        System.out.println(bs1.getInformation());
    }
}
