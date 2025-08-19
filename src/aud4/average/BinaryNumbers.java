package aud4.average;

import java.io.*;
import java.util.Random;

/*
 * Write n random integers into a binary file.
 * Then, read the file data and calculate the average.
 */

public class BinaryNumbers {
    public static final String FILE_NAME = "C:\\Users\\Home\\Desktop\\NaprednoProgramiranje\\FirstAud1\\src\\aud4\\average\\numbers.dat";

    private static void generateFile(int n) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            Random random = new Random();
            for (int i = 0; i < n; i++) {
                int nextRandom = random.nextInt(1000);
                objectOutputStream.writeInt(nextRandom);
            }
            objectOutputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static double average() {
        int count = 0;
        double sum = 0;

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME));
            try {
                while (true) {
                    int number = objectInputStream.readInt();
                    sum += number;
                    count++;
                }
            } catch (EOFException e) {
                System.out.println("EOF reached");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sum / count;
    }

    public static void main(String[] args) {
        generateFile(1000);
        System.out.println("Average: " + average());
    }
}
