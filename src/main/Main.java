package main;

import core.entities.Player;
import core.entities.Wither;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("pepe", 13);
        Wither wither = new Wither();
        wither.attack();
        wither.move();
    }
}
