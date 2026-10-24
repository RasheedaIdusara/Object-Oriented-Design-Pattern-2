package lk.rasheeda.model;

interface Icecream {

    public double getPrice();

    public String getDescription();
}

class VanilaIcecream implements Icecream {

    @Override
    public double getPrice() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Vanila Ice cream";
    }
}

class ChocalaIcecream implements Icecream {
    @Override
    public double getPrice() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "Chocala Ice cream";
    }
}

abstract class IcecreamDecorator implements Icecream {

    protected Icecream icecream;

    public IcecreamDecorator(Icecream icecream) {
        this.icecream = icecream;
    }

}

class ChocalateTopings extends IcecreamDecorator {

    public ChocalateTopings(Icecream icecream) {
        super(icecream);
    }

    @Override
    public double getPrice() {
        return this.icecream.getPrice() + 50;
    }

    @Override
    public String getDescription() {
        return this.icecream.getDescription() + " With ChocalateTopings";
    }
}

class NutTopings extends IcecreamDecorator {

    public NutTopings(Icecream icecream) {
        super(icecream);
    }

    @Override
    public double getPrice() {
        return this.icecream.getPrice() + 25;
    }

    @Override
    public String getDescription() {
        return this.icecream.getDescription() + " With NutTopings";
    }
}

public class Test {
    public static void main(String[] args) {

        Icecream icecream1 = new VanilaIcecream();
        System.out.println(icecream1.getDescription());
        System.out.println("Price: " + icecream1.getPrice());

        Icecream icecream2 = new VanilaIcecream();
        icecream2  = new  ChocalateTopings(icecream2);

        System.out.println(icecream2.getDescription());
        System.out.println("Price: " + icecream2.getPrice());


    }
}
