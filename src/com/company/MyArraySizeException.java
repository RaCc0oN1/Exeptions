package com.company;

public class MyArraySizeException extends Throwable {
    int lenght, needLenght;
    public MyArraySizeException(String s) {
        super(s);
    }
}
