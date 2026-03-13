package main;

import core.dinamic_data_structures.Collection;
import core.users.Player;
import core.users.Wither;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("pepe", 13);
        Wither wither = new Wither();
        wither.attack();
        wither.move();
    }
}
