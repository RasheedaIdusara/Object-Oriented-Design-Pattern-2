package lk.rasheeda.model;

class Zombie{

    private String type;
    private int attackpower;
    private String texture;
    private int x;
    private int y;
    private int health;

    public Zombie(String type, int attackpower, String texture, int x, int y, int health) {
        this.type = type;
        this.attackpower = attackpower;
        this.texture = texture;
        this.x = x;
        this.y = y;
        this.health = health;
    }

    public void display() {

        System.out.println("type : " + this.type);
        System.out.println("attackpower : " + this.attackpower);
        System.out.println("texture : " + this.texture);
        System.out.println("x : " + this.x);
        System.out.println("y : " + this.y);
        System.out.println("health : " + this.health);

    }

}

public class Test {

    public static void main(String[] args) {

        Zombie z1
                = new Zombie("IceZombie",10,"blue color",250,250,100);

        Zombie z2
                = new Zombie("FireZombie",20,"blue color",500,250,100);

        Zombie z3
                = new Zombie("IceZombie",10,"blue color",500,250,95);

        Zombie z4
                = new Zombie("IceZombie",10,"blue color",750,250,100);

        z1.display();
        z2.display();
        z3.display();
        z4.display();

    }

}
