public class Zadanie6 {
    static int NWD(int a, int b){
        while(a != b){
            if (a>b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(NWD(999,3108));
    }
}
