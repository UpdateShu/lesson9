package ru.geekbrains.lessons;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Подсчёт суммы элементов в массиве 1:");
        Object[][] mass1 = { { 1, 2, 3, 4}, { 5, 4, 3, 2}, { 0, 9, 8, 7, 3, 3, 3}, { 2, 2, 2, 2} };
        trySum(mass1);

        System.out.println("Подсчёт суммы элементов в массиве 2:");
        Object[][] mass2 = { { 1, 2, 3, 4}, { 5, 1, 3, 2}, { 0, 9, 2, 'A' }, { 2, 2, 2, 2} };
        trySum(mass2);

        System.out.println("Подсчёт суммы элементов в массиве 3:");
        Object[][] mass3 = { { 1, 2, 3, 4}, { 5, 4, 3, 2}, { 0, 9, 8, 7 }, { 2, 2, 2, 2} };
        trySum(mass3);
    }

    static void trySum(Object[][] mass) {

        printMass(mass);
        try {
            sum(mass);
        }
        catch (Exception ex) {
           System.out.println(ex.getMessage());
        }
        finally {
            System.out.println();
        }
    }

    static void sum(Object[][] mass) throws MyArraySizeException, MyArrayDataException {
        if (!validateLength(mass))
            throw new MyArraySizeException();

        int s = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++)
            {
                if (mass[i][j] instanceof Integer) {
                    int n = (int)mass[i][j];
                    s += n;
                }
                else {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Сумма элементов массива: " + s);
    }

    static boolean validateLength(Object[][] mass)
    {
        if (mass.length != 4)
            return false;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].length != 4)
                return false;
        }
        return true;
    }

    static void printMass(Object[][] mass)
    {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++)
                System.out.print(mass[i][j] + " ");
            System.out.println();
        }
    }
}