package core.users;

public class Wither implements Entity {

    @Override
    public void attack() {
        System.out.println("wither atacando");
    }

    @Override
    public void move() {
        System.out.println("wither volando por los aires");
    }
}
