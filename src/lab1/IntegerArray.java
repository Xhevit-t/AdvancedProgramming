package lab1;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public final class IntegerArray{
    private final int[] a;

    public IntegerArray(int[] a) {
        this.a = a;
    }
    public int length(int[] a){
        return a.length;
    }



    public int getElementAt(int i) {
        return a[i];
    }

    public int sum() {
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum = a[i];
        }
        return sum;
    }

    public double average() {
        return (Arrays.stream(a).sum())/a.length;
    }


    public int length() {
        return a.length;
    }




}

class ArrayReader {

    public static IntegerArray readIntegerArray(InputStream input) {
        Scanner jin = new Scanner(input);
        int n = jin.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = jin.nextInt();
        }
        jin.close();
        return new IntegerArray(a);
    }

}

