package com.company;

public class Lenor extends Conditioner implements RemoveOdour, RetainsСolor{
    @Override
    public String f3(String aroma) {
        return aroma;
    }

    @Override
    public void f10() {
        System.out.println("Кондиционер Lenor для цветного белья");
    }

    @Override
    public void f4(String a) {

    }

    @Override
    public int f2(int a, int b) {
        return a+b;
    }

    @Override
    public void f8() {

    }

    @Override
    public int f9(int litr) {
        return super.f9(litr);
    }

    @Override
    public int f5(int min, int hour) {
        return min+hour;
    }
}
