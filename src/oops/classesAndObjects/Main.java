package oops.classesAndObjects;

public class Main {
    public static void main(String[] args) {
        Person sandip = new Person("Sandip", 28);
        Person john = new Person("John", 30);
        Person unknow = new Person();

        sandip.printDetails();
        john.printDetails();
        unknow.printDetails();

        sandip.printEducation("B.Tech");
        john.printEducation("MBA");

        sandip.printEducation();

        System.out.println("Number of persons " + Person.personCount);

        Developer david = new Developer("David", 34);
        Designer mosh = new Designer("Mosh", 21);

        david.printDetails();
        mosh.printDetails();

        david.printProject();
        mosh.printPortfolio();
    }
}

class Person {
    // properties
    static int personCount = 0;
    String name;
    int age;

    // Default constructor
    public Person() {
        personCount++;
        this.name = "User";
        this.age = 18;
    }
    // parametrize constructor
    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    // method
    void printDetails() {
        System.out.println(name + " " + age);
    }

    // polymorphism (compile time)
    void printEducation() {
        System.out.println("just pass");
    }
    void printEducation(String education) {
        System.out.println(name + " did " + education);
    }
}

class Developer extends Person {
    public Developer(String name, int age) {
        super(name, age);
    }

    void printProject() {
        System.out.println("Build full stack ai project");
    }
    // Polymorphism (run time)
    @Override
    void printDetails() {
        System.out.println("Creator: " + name + " " + age);
    }
}

class Designer extends Person {
    public Designer(String name, int age) {
        super(name, age);
    }
    void printPortfolio() {
        System.out.println("Designed his portfolio website");
    }
}