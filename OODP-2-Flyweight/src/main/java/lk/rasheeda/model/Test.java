package lk.rasheeda.model;

import java.util.HashMap;
import java.util.Map;

abstract class Zombie{

    public abstract void display();

}

class SharedZombie extends Zombie{

    private String type;
    private int attackpower;
    private String texture;


    public SharedZombie(String type, int attackpower, String texture) {

        this.type = type;
        this.attackpower = attackpower;
        this.texture = texture;

    }

    @Override
    public void display() {

    }
}

class UniqueZombie{

    private int x;
    private int y;
    private int health;

    private Zombie zombie;

    public UniqueZombie(int x, int y, int health, Zombie zombie) {
        this.x = x;
        this.y = y;
        this.health = health;
        this.zombie = zombie;
    }

}

class ZombiePool{

    private static Map<String, Zombie> zombiesMap = new HashMap<>();

    public static Zombie getZombie(){

        if (){

        }
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
