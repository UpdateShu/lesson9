package ru.geekbrains.lessons;

public class MyArraySizeException extends Exception {
    @Override
    public String getMessage() {
        return "Задан массив неверного размера!";
    }
}
