package org.example;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        String string = reader.read();
//
        ArabCalculator arabCalculator = new ArabCalculator(string);
        Calculate calculate = new Calculate();
        int result = calculate.getCalculation(arabCalculator.getNumber1(), arabCalculator.getNumber2(), arabCalculator.getDelimeter());
        System.out.println(result);
    }
}
