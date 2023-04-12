public class Dog extends Animal{
    public Dog(String name, String color){
        super(name, color);
    }

    public void makeSound(){
        System.out.println(name + " " + color);
        System.out.println("Pies robi: hau hau!");
    }
}
