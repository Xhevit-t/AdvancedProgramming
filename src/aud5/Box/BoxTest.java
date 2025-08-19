package aud5.Box;

import java.util.stream.IntStream;

public class BoxTest {
    public static void main(String[] args) {
        Box<Integer> box = new Box<Integer>();

        IntStream.range(0,100)
                .forEach(i -> box.add(i));

        IntStream.range(0,103)
                .forEach(i -> System.out.println(box.draw()));

    }

}
