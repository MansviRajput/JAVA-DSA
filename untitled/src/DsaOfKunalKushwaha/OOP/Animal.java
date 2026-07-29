package DsaOfKunalKushwaha.OOP;

abstract class Animal {
    abstract void sound(); // abstract method

    void eat() {
        System.out.println("OOP.DsaOfKunalKushwaha.Animal eats");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("OOP.DsaOfKunalKushwaha.Dog barks");
    }
}

class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.eat();
    }
}