package com.whpu.cwb;

public class MyException extends Exception{
    MyException(int m){
        System.out.println("m大于1000");
    }
}
