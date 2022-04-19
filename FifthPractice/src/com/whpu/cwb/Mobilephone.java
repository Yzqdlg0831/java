package com.whpu.cwb;

public class Mobilephone implements Soundable{

    @Override
    public void phonation() {
        System.out.println("Mobilephone设备发声");
    }

    @Override
    public void ModulateTheSound() {
        System.out.println("Mobilephone调节声音大小");
    }
}
