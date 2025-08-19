package aud4.calculator;

public class Division implements Strategy{

    @Override
    public double calculate(double num1, double num2) {
        return num1/num2;
    }
}
