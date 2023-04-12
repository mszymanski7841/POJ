public class Cat extends Animal{
    public Cat(String name, String color){
        super(name, color);
    }

    public void makeSound(){
        System.out.println(name + " " + color);
        System.out.println("Kot robi: miau miau!");
    }
}
