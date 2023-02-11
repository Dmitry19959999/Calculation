import java.util.Scanner;

class Calc {

    public static void main(String[] args) throws Exception {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите два числа: ");
            String expression = scanner.nextLine();//считываем наше выражение
            System.out.println(parse(expression));
        }
    }
    public static String parse(String expression) throws Exception {// метод parse
        int num1;
        int num2;
        String oper;
        String result;
        boolean isRoman;
        String[] operands = expression.split("[+\\-*/]"); // делаем деление по арифметическим знакам
        if (operands.length < 2) throw new Exception("строка не является математической операцией");
        oper = detectOperation(expression);
        if (operands.length > 2) throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        oper = detectOperation(expression);
        //если оба числа римские
        if (Roman.isRoman(operands[0]) && Roman.isRoman(operands[1])) {
            //конвертируем оба числа в арабские для вычисления действия
            num1 = Roman.convertToArabian(operands[0]);
            num2 = Roman.convertToArabian(operands[1]);
            isRoman = true;
        }
        //если оба числа арабские
        else if (!Roman.isRoman(operands[0]) && !Roman.isRoman(operands[1])) {
            num1 = Integer.parseInt(operands[0]);
            num2 = Integer.parseInt(operands[1]);
            isRoman = false;
        }
        //если одни число римское, а другое - арабское
        else {
            throw new Exception("Используются одновременно разные системы счисления");
        }
        if (num1 > 10 || num2 > 10) {
            throw new Exception("Числа должны быть от 1 до 10");
        }
        int arabian = calc(num1, num2, oper);
        if (isRoman) {
            //если римское число получилось меньше либо равно нулю, генерируем ошибку
            if (arabian <= 0) {
                throw new Exception("в римской системе нет отрицательных чисел");
            }
            //конвертируем результат операции из арабского в римское
            result = Roman.convertToRoman(arabian);
        } else {
            //Конвертируем арабское число в тип String
            result = String.valueOf(arabian);
        }
        //возвращаем результат
        return result;
    }

    static String detectOperation(String expression) {
        if (expression.contains("+")) return "+";
        else if (expression.contains("-")) return "-";
        else if (expression.contains("*")) return "*";
        else if (expression.contains("/")) return "/";
        else return null;
    }

    public static int resultat;
    static int calc(int a, int b, String oper) {
        switch (oper){
            case "+":
                resultat = a + b;
                break;
            case "-":
                resultat = a - b;
                break;
            case"*":
                resultat = a * b;
                break;
            case "/":
                resultat = a / b;
            default:
               new FormatException("Неверный ввод знака");
        }
        return resultat;
    }

}



