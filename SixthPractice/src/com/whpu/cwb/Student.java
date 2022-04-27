package com.whpu.cwb;

public class Student {
    public void speak(int m) throws MyException{
        if(m>1000) {
            throw new MyException(m);
        }
    }
}
