package com.company;

public class WashingPowder implements Clean,Wash{
    @Override
    public void f4(String a) {
        System.out.println("Стиральный порошок "+a+ " для белья");
    }

    @Override
    public int f5(int min, int hour) {
        return min + hour;
    }
}
