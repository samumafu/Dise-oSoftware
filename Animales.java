class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}

class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}

class Cat extends Mammal {

    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}

class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}

public class Animales {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal");
        System.out.println(genericAnimal);

        Mammal mammal = new Mammal("Generic Mammal");
        System.out.println(mammal);

        Cat cat = new Cat("Whiskers");
        System.out.println(cat);
        cat.greets();

        Dog dog = new Dog("Buddy");
        System.out.println(dog);
        dog.greets();

        Dog anotherDog = new Dog("Rex");
        dog.greets(anotherDog);
    }
}
