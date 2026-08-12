class Animalsingleinheritance{
    void eat() {
        System.out.println("Animal Eats");
    }
}

class Dog extends Animalsingleinheritance{
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
