package oneC;

import java.util.*;

public class ReverseIteration {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        Iterator<String> iterator = list.descendingIterator();

        System.out.println("Elements in reverse order:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}