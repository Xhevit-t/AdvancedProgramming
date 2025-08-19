package aud4.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> integerList =  new ArrayList<>(100);
        List<String> stringList =  new ArrayList<>();

        integerList.add(8);
        integerList.add(7);
        integerList.add(2);
        integerList.add(5);
        integerList.add(4);
        integerList.add(5);

        stringList.add("A");

        System.out.println(integerList);
        System.out.println(stringList);

        System.out.println(integerList.size());

        System.out.println(integerList.get(3));
        System.out.println(integerList.contains(182));

        System.out.println(integerList.indexOf(5));
        System.out.println(integerList.lastIndexOf(5));

        System.out.println(integerList.removeIf(i -> i > 5));
        System.out.println(integerList);


    }
}
