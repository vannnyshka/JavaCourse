package theory.generics;

import java.util.ArrayList;
import java.util.List;

public class LRUCache<T> {

    ArrayList<T> elements; //параметризован параметров T
    private int size;

    public LRUCache(int size){
        this.size = size;
        elements = new ArrayList<>();
    }

    public void addElement(T element){
        int currentSize = elements.size();
        if(elements.size() >= size){

            for(int i = 0; i < currentSize - size + 1; i++){
                elements.remove(0);
            }
            elements.add(element);
        }
    }

    @Deprecated
    public T getElement(int i){

        if(i >= elements.size()) {
            return null;
        }
        return elements.get(i);
    }

    public List<T> getAllElements(){
        return elements;
    }

}
