package org.example;

public class Main {
    public static void main(String[] args) {
        /* инициализируем класс Reader
        * */
        Reader reader = new Reader();
        /* вызываем метод класса Reader read()
        * */
        String string = reader.read();

        /* инициализируем класс new ArabCalculator() в конструктор прокидываем string
         * */
        ArabCalculator arabCalculator = new ArabCalculator(string);
        /* инициализируем класс new Calculate() в конструктор прокидываем string
         * */
        Calculate calculate = new Calculate();
        /*
        Вызываем метод класса Calculate getCalculation()
        * Для получения результата вызываем методы класса ArabCalculator, которые в сигнатуре метода getCalculation
        * */
        int result = calculate.getCalculation(arabCalculator.getNumber1(), arabCalculator.getNumber2(), arabCalculator.getDelimeter());
        System.out.println(result);
    }
}
