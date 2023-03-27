public class Wiatrak {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    int speed;
    boolean on;
    int radius;
    String color;

    public Wiatrak(){
        speed = MEDIUM;
        on = false;
        color = "White";
        radius = 5;
    }
    public Wiatrak(int speed, String color, int radius){
        this.speed = speed;
        this.color = color;
        this.radius = radius;
        this.on = false;
    }
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void info(){
        if(on){
            System.out.println("Status: włączony");
        }else{
            System.out.println("Status: wyłączony");
        }
        System.out.println("Prędkość: " + speed);
        System.out.println("Promień: " + radius);
        System.out.println("Kolor: " + color);
    }
}
