package org.example;

/*
* Абстрактный класс калькулятора, который имплементирует интерфейс Calculator
* */
public abstract class AbstractCalculate implements Calculator {

    public String input;

    public AbstractCalculate(String input) {
        this.input = input;
    }

}
