package lk.rasheeda.model;

interface visitor {

    public void visit(Lion lion);

    public void visit(Elephant elephant);

    public void visit(Dog dog);

}

interface animal {

    public void run();

    public void accept(visitor visitor);

}

class Lion implements animal {
    @Override
    public void run() {
        System.out.println("Lion run...");
    }

    @Override
    public void accept(visitor visitor) {
        visitor.visit(this);
    }
}

class Elephant implements animal {

    @Override
    public void run() {
        System.out.println("Elephant run...");
    }

    @Override
    public void accept(visitor visitor) {
        visitor.visit(this);
    }
}

class Dog implements animal {

    @Override
    public void run() {
        System.out.println("Dog run...");
    }

    @Override
    public void accept(visitor visitor) {
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

    }

}
