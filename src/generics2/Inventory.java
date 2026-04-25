package generics2;

import java.util.*;

public class Inventory<T>{
    private List<T> items = new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }
    public void printItems(){
        for (T item : items) {
            System.out.println(item);
        }
    }

}