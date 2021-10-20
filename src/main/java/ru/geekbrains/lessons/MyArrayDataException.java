package ru.geekbrains.lessons;

public class MyArrayDataException extends Exception {

    private int i;
    private int j;

    public MyArrayDataException(int i, int j)
    {
        super();
        this.i = i;
        this.j = j;
    }

    @Override
    public String getMessage() {
        return "В ячейке [" + (i + 1) + ", " + (j + 1) + "] найдены неверные данные!";
    }
}
