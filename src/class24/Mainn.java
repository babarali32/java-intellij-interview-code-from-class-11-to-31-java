package class24;

public class Mainn {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.eat();

        Animal cat = new Cat();
        cat.makeSound();
        cat.eat();
    }
}
