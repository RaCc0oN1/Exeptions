package com.company;

public class Main {
    int getSomeInt;
    int getSomeInt2;
    String getSomeSum;
    int needLenght = 4;

    void main() throws MyArraySizeException, MyArrayDataException {
        String[][] arr = {{"1", "2", "7", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            exc1(arr);
        } catch (MyArraySizeException е) {
            System.out.println("Array is bad.");
            return;
        }
        System.out.println("-READY-");


        try {
            exc2(arr);
        } catch (MyArrayDataException e) {
            System.out.println("Вроде, поймал." + " Координата один - " + getSomeInt + " Координата два - " + getSomeInt2);
            return;
        }
        System.out.println("-READY-");


    }

    void exc1(String[][] arr) throws MyArraySizeException {
        if (arr.length != needLenght) {
            throw new MyArraySizeException("За пределы матрицы");
        }
    }

    void exc2(String[][] arr) throws MyArrayDataException {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                getSomeInt = i;
                getSomeInt2 = j;
                if (isInteger(arr[i][j])) {
                    arr[i][j] = String.valueOf(arr[i][j]);
                    getSomeSum += arr[i][j];
                } else {
                    throw new MyArrayDataException("Gotta", getSomeInt);
                }
            }

        }

    }

    private boolean isInteger(String arr) {
        try {
            Integer.valueOf(arr);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
