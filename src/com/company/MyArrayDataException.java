package com.company;

public class MyArrayDataException extends Throwable {
    String gotta;
    int num;
    public MyArrayDataException(String gotta, int num) {
        super(gotta);
        this.num = num;
    }
}
