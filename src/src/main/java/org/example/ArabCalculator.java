package org.example;

/*
* Кальулятор для арабских цифр, расширяет абстрактный класс AbstractCalculate
* */
public class ArabCalculator extends AbstractCalculate {

    public ArabCalculator(String input) {
        super(input);
    }

    /*
    *  Разделяем входную стрингу по делиметру "[+-/*]", получаем массив String (если String input = "3+2",
    * получаем массив с значениями String [] values = {"1", "2"})
    * */
    final String [] values = input.split("[+-/*]");

    /*
    * Получаем из массива String [] values значение под индексом 0
    * */
    @Override
    public int getNumber1() {
        return Integer.parseInt(values[0]);
    }

    /*
     * Получаем из массива String [] values значение под индексом 1
     * */
    @Override
    public int getNumber2() {
        return Integer.parseInt(values[1]);
    }

    /*
     * Получаем из входного параметра input значение делиметра
     * */
    @Override
    public char getDelimeter() {
        return input.charAt(values[0].length());
    }

}
