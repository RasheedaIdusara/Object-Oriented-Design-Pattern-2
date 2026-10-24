package lk.rasheeda.model;

interface Visitor {

    public void visit(Lion lion);

    public void visit(Elephant elephant);

    public void visit(Dog dog);

}

interface Animal {

    public void run();

    public void accept(Visitor visitor);

}

class EatVisitor implements Visitor{

    @Override
    public void visit(Lion lion) {
        System.out.println("Lion is eating");
    }

    @Override
    public void visit(Elephant elephant) {
        System.out.println("Elephant is eating");
    }

    @Override
    public void visit(Dog dog) {
        System.out.println("Dog is eating");
    }
}

class SleepVisitor implements Visitor{
    @Override
    public void visit(Lion lion) {
        System.out.println("Lion is Sleeping");
    }

    @Override
    public void visit(Elephant elephant) {
        System.out.println("Elephant is Sleeping");
    }

    @Override
    public void visit(Dog dog) {
        System.out.println("Dog is Sleeping");
    }
}

class Lion implements Animal {
    @Override
    public void run() {
        System.out.println("Lion run...");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class Elephant implements Animal {

    @Override
    public void run() {
        System.out.println("Elephant run...");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class Dog implements Animal {

    @Override
    public void run() {
        System.out.println("Dog run...");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

public class Test {

    public static void main(String[] args) {

        Lion lion = new Lion();
        Elephant elephant = new Elephant();
        Dog dog = new Dog();

        lion.run();
        elephant.run();
        dog.run();

        EatVisitor eatVisitor  = new EatVisitor();
        SleepVisitor sleepVisitor = new SleepVisitor();

        lion.accept(eatVisitor);
        elephant.accept(eatVisitor);
        dog.accept(eatVisitor);

        lion.accept(sleepVisitor);
        elephant.accept(sleepVisitor);
        dog.accept(sleepVisitor);


    }

}
