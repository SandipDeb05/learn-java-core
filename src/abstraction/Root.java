package abstraction;

public class Root {
    public static void main(String[] args) {
        Audi a1 = new Audi();
        a1.start();
    }
}

abstract class Car {
    int price;

    abstract void start();
    // not true abstraction
    void engin() {
        System.out.println("HF engine");
    }
}

class Audi extends Car {
    void start() {
        System.out.println("Audi started");
    }
}