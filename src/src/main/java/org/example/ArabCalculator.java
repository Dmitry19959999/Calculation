package org.example;

public class ArabCalculator extends AbstractCalculate {

    public ArabCalculator(String input) {
        super(input);
    }
    final String [] values = input.split("[+-/*]");

    @Override
    public int getNumber1() {
        return Integer.parseInt(values[0]);
    }

    @Override
    public int getNumber2() {
        return Integer.parseInt(values[1]);
    }

    @Override
    public char getDelimeter() {
        return input.charAt(values[0].length());
    }

}
