package OOP.Pollymorphism;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overrides the sound method in the base class
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overrides the sound method in the base class
    void sound() {
        System.out.println("Cat meows");
    }
}


public class runTime {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Upcasting
        Animal animal2 = new Cat(); // Upcasting

        animal1.sound(); // Calls Dog's overridden method
        animal2.sound(); // Calls Cat's overridden method
    }

}
