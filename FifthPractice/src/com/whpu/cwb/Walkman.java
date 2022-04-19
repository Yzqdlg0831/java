package com.whpu.cwb;

public class Walkman implements Soundable {

    @Override
    public void phonation() {
        System.out.println("Walkman设备发声");
    }

    @Override
    public void ModulateTheSound() {
        System.out.println("Walkman调节声音大小");
    }
}
