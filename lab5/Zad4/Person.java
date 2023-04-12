public class Person {
    String firstName;
    String lastName;
    int age;
    int height;
    double weight;

    public Person(){
        firstName = "";
        lastName = "";
        age = 0;
        height = 0;
        weight = 0;
    }
    public Person(String firstName, String lastName, int age, int height, double weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String toString(){
        return "Imię: " + firstName +
                "\nNazwisko: " + lastName +
                "\nWiek: " + age +
                "\nWzrost: " + height +
                "\nWaga: " + weight;
    }

}
