package aud4.calculator;

import java.util.Scanner;

public class CalcluatorTest {
    public static char getCharLower(String line){
        if(line.trim().length()>0){
        return Character.toLowerCase(line.charAt(0));
        }else return '?';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator Calculator = new Calculator();
        while (true) {
        System.out.println("Calculator");
        String s = sc.nextLine();
        char c = getCharLower(s);
        if (c == 'r') {
            System.out.println("final result =%f");
        }

        String[] parts = s.split("\\s+");
        char operator = parts[0].charAt(0);
        double value = Double.parseDouble(parts[1]);

        try {
            String result = Calculator.execute(operator, value);
            System.out.println(result);
            System.out.println(Calculator);
        } catch (UnknownOperatorException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("(Y/N)");
        String line = sc.nextLine();
        char choice = getCharLower(line);
        if (choice == 'n') break;
    }

    }
}
