abstract class Animal {
    private String name;
    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void sound();

    void displayName() {
        System.out.println("Animal Name: " + name);
    }
}
class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Dog says: Bark");
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Cat says: Meow");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog("Buddy");
        Animal a2 = new Cat("Kitty");

        a1.displayName();
        a1.sound();

        System.out.println();

        a2.displayName();
        a2.sound();
    }
}
