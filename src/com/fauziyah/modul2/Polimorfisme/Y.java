package com.fauziyah.modul2.Polimorfisme;

public class Y extends X {
    //overriding
    public void getValue(String value){
        super.getValue(value);
        System.out.println("Value Y\t: " + value);
    }
}
