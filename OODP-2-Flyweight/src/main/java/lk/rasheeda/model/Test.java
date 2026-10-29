package lk.rasheeda.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

abstract class AbstractZombie{

    public abstract void display();

}

class SharedZombie {

    private String type;
    private int attackpower;
    private String texture;


    public SharedZombie(String type, int attackpower, String texture) {

        this.type = type;
        this.attackpower = attackpower;
        this.texture = texture;

    }

    public String getType() {
        return type;
    }

    public int getAttackpower() {
        return attackpower;
    }

    public String getTexture() {
        return texture;
    }

}

class Zombie extends AbstractZombie {

    private int x;
    private int y;
    private int health;

    private SharedZombie sharedZombie;

    public Zombie(String type,int attackPower,String texture,int x, int y, int health) {
        this.x = x;
        this.y = y;
        this.health = health;

        this.sharedZombie = SharedZombiePool.getSharedZombie(type,attackPower,texture);
    }

    @Override
    public void display() {

        System.out.println("Type : "+this.sharedZombie.getType());
        System.out.println("Attack Power : "+this.sharedZombie.getAttackpower());
        System.out.println("Texture : "+this.sharedZombie.getTexture());
        System.out.println("Position X : "+this.x);
        System.out.println("Position Y : "+this.y);
        System.out.println("Health : "+this.health);

        System.out.println();


    }



}

class SharedZombiePool{

    private static final ArrayList<SharedZombie> sharedZombieArrayList = new ArrayList<>();

    public static SharedZombie getSharedZombie(String type, int attackpower, String texture) {

        SharedZombie sz = null;

        for(SharedZombie szItem : sharedZombieArrayList){

            if (type.equals(szItem.getType())
                    && attackpower == szItem.getAttackpower()
                    && texture.equals(szItem.getTexture())){

                sz = szItem;
                break;

            }

        }

        if(sz == null){
            sz = new SharedZombie(type, attackpower, texture);
            sharedZombieArrayList.add(sz);
        }

        return sz;

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
