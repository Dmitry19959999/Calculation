package org.example.exception;

/*
* Создал собственный класс FormatExeption с помощью  "extends Exception"
* */
public class FormatExeption extends Exception {
    public FormatExeption(String message) {
        super(message);
    }
}
