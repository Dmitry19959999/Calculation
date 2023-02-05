package org.example;

import org.example.exception.FormatExeption;

public class Calculate {
    private int result;
    public int getCalculation(int number1, int number2, char delimeter)  {

        switch (delimeter) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                new FormatExeption("Неверный ввод знака");
        }
        return result;
    }
}
