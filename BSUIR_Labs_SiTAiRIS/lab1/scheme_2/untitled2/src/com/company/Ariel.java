package com.company;

public class Ariel extends WashingPowder implements RemoveOdour{
    @Override
    public String f3(String aroma) {
        return aroma;
    }

    @Override
    public void f10() {
        System.out.println("Порошок Ariel для цветного белья");
    }


}
