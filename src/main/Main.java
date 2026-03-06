package main;

import core.dinamic_data_structures.Collection;
import core.users.Player;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection collection = new Collection();
        HashSet hashSet = new HashSet<String>();
        hashSet.add("miguelx46");
        hashSet.add("maximo");
        collection.setHashSet(hashSet);

        LinkedList linkedList = new LinkedList<Integer>();
        linkedList.add(0,2025);
        linkedList.add(1,2026);
        linkedList.add(2,2027);
        linkedList.add(3,2028);
        linkedList.add(4,2025);
        collection.setLinkedList(linkedList);

        HashMap hashMap = new HashMap<Integer, String>();
        hashMap.put(1011, "blacking");
        hashMap.put(3076, "Eduardo");
        collection.setHashMap(hashMap);

        ArrayList arrayList = new ArrayList<Player>();
        arrayList.add(new Player("miguelx46", 0));
        arrayList.add(new Player("tronker", 1));
        collection.setArrayList(arrayList);

    }
}
