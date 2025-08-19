package aud5.Box;

// V - value
// E - element
// T - type

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Box<E> {
    private List<E> elements;
    public static Random random = new Random();
    public Box() {
        elements = new ArrayList<>();
    }

    public void add(E element) {
        elements.add(element);
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }

    public E draw() {
        if (isEmpty()) return null;

        return elements.get(random.nextInt(elements.size()));
    }


}
