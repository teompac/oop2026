package feladat1;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements iQueue{

    private ArrayList<Object> items;
    private final int CAPACITY;
    public ArrayListQueue(int capacity){
        CAPACITY=capacity;
        items = new ArrayList<>(capacity);
    }
    @Override
    public void qnQueue(Object o) {
        if(isFull()){
            System.out.println("Tele van a sor");
            return;
        }
        items.add(o);
    }

    @Override
    public Object deQueue() {
        if(isEmpty()) {
            System.out.println("Ures a sor");
            return null;
        }
        return items.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return items.size() == 0;
    }

    @Override
    public boolean isFull() {
        return CAPACITY == items.size();
    }

    @Override
    public void printQueue() {
        System.out.println(items);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListQueue that = (ArrayListQueue) o;
        return Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, CAPACITY);
    }
}
