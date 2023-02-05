package org.example;

import java.util.Scanner;
/*
* Класс для вычитки из контроллера
* */
public class Reader {
    public String read() {
        String line = null;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            line = scanner.nextLine();
        } else {
            scanner.next();
        }
        return line;
    }
}
