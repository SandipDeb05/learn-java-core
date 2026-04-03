package oops.abstraction;

//public class Interfaces extends Bird implements Animal {
//    @Override
//    public void eats() {
//        System.out.println("Food");
//    }
//}

//public class Interfaces extends Bird implements Animal, Mammal {
//    @Override
//    public void eats() {
//        System.out.println("Food");
//    }
//    @Override
//    public void runs() {
//        System.out.println("Runs");
//    }
//}

//public class Interfaces implements Animal, Mammal {
//    @Override
//    public void eats() {
//        System.out.println("Food");
//    }
//    @Override
//    public void runs() {
//        System.out.println("Runs");
//    }
//}

public class Interfaces implements Animal {
    @Override
    public void eats() {
        System.out.println("Food");
    }
}

// pure oops.abstraction
interface Animal {
    void eats();
}

interface Mammal {
    void runs();
}

class Bird {
    void fly() {
        System.out.println("Can fly");
    }
}