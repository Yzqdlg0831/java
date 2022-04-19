package com.whpu.cwb;

public class Radio implements Soundable {

    @Override
    public void phonation() {
        System.out.println("Radio设备发声");
    }

    @Override
    public void ModulateTheSound() {
        System.out.println("Radio调节声音大小");
    }
}
