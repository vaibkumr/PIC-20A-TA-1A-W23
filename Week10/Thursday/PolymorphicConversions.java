public class PolymorphicConversions {
    public static void main(String[] args) {
        
        // Upcasting (always allowed)
        Animal animal = new Dog();
        animal.makeSound(); // The dog barks

        // Downcasting (may cause compile-time or run-time errors)
        // 1. Compile-time error: incompatible types
        // Dog dog = new Animal(); // Uncommenting this line will cause a compile-time error

        // 2. Run-time error: ClassCastException
        try {
            Dog dog = (Dog) new Animal(); // This line will cause a run-time error (ClassCastException)
        } catch (ClassCastException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 3. Correct downcasting (no errors)
        Dog dog = (Dog) animal;
        dog.makeSound(); // The dog barks

        // 4. Downcasting with instanceof (safe approach)
        if (animal instanceof Dog) {
            Dog anotherDog = (Dog) animal;
            anotherDog.makeSound(); // The dog barks
        } else {
            System.out.println("animal is not an instance of Dog");
        }

        // 5. Casting between unrelated types (compile-time error)
        // Fish fish = (Fish) new Dog(); // Uncommenting this line will cause a compile-time error

    }
}



class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks");
    }
}

class Fish extends Animal{
    void makeSound() {
        System.out.println("The fish doesn't make a sound");
    }
}

