package class24;
public interface Animal {
    // Interface defining a fully abstract contract
        void makeSound();
        void eat();
    }
    // Concrete implementation of the Animal interface
    class Dog implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Dog barks");
        }
        @Override
        public void eat() {
            System.out.println("Dog eats bones");
        }
    }
    // Another concrete implementation of the Animal interface
    class Cat implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Cat meows");
        }
        @Override
        public void eat() {
            System.out.println("Cat eats fish");
        }
    }


