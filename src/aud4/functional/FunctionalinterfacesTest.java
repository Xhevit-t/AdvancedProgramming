package aud4.functional;

import java.util.Random;
import java.util.function.*;

public class FunctionalinterfacesTest {

    public static void main(String[] args) {

        Predicate<Integer> LessThan100 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };
    }
    Predicate<Integer> lessThan100 = integer -> integer  < 100 ;

    Supplier<Integer> integerSupplier = new Supplier<Integer>() {
        @Override
        public Integer get() {
            return new Random().nextInt(1000);
        }
    };
    Consumer<String> StringConsumer = new Consumer<String>() {
        @Override
        public void accept(String s) {
            System.out.println(s);
        }
    };
    Consumer<String> stringConsumer = s -> System.out.println(s);

    Function<Integer, String> FormatNumberString = new Function<Integer, String>() {
        @Override
        public String apply(Integer integer) {
            return String.format("%d\n",integer);
        }
    };

    Function<Integer, String> formatNumberString = Integer -> String.format("%d\n",Integer);

    BiFunction<Integer,Integer,String> SumNumbersAndFormat = new BiFunction<Integer, Integer, String>() {
        @Override
        public String apply(Integer integer, Integer integer2) {
            return String.format("%d + %d = %d",integer,integer2,integer+integer2);
        }
    };
    BiFunction<Integer,Integer,String> sumNumbersAndFromat = (i,i1) -> String.format("%d + %d = %d",i,i1,i+i1);

}
