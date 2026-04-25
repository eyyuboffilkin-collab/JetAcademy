package generics;

import java.util.ArrayList;
import java.util.List;

class SmartStorage<T extends Comparable<T>>{
    private List<T> items = new ArrayList<>();

    public void add(T item){
        items.add(item);
    }
    public void printAll(){
        for (T item : items) {
            System.out.println(item);
        }
    }

    public T getMax(){
        if(items.isEmpty()){
            return null;
        }
        T max = items.get(0);

        for(T item : items){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }


}
