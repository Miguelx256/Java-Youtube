package core.dinamic_data_structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Collection {
    private ArrayList arrayList;
    private LinkedList linkedList;
    private HashSet hashSet;
    private HashMap hashMap;

    public Collection() {

    }

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public void setLinkedList(LinkedList linkedList) {
        this.linkedList = linkedList;
    }

    public void setHashSet(HashSet hashSet) {
        this.hashSet = hashSet;
    }

    public void setHashMap(HashMap hashMap) {
        this.hashMap = hashMap;
    }
}
