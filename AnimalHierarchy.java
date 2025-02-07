class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        // Default sound
    }

    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
        makeSound();
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Sound: Bark");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Sound: Meoww...");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Sound:  Chirp...");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog = new Dog("Toshu", 5);
        Animal cat = new Cat("Kohl", 10);
        Animal bird = new Bird("Kaju", 5);

        dog.printDetails();
        System.out.println();
        cat.printDetails();
        System.out.println();
        bird.printDetails();
    }
}
