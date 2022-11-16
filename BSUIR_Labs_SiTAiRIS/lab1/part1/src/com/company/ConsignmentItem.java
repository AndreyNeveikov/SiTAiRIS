package com.company;

public class ConsignmentItem extends PurchasedItem implements RatePrice {
    @Override
    String f11() {
        return "f11";
    }
    @Override
    public String f10() {
        return "f10";
    }
    @Override
    public String f3(String a) {
        return a;
    }
    @Override
    public void f4(String s1) {
        System.out.print("f4");
    }
    @Override
    public int f5(int a, int b) {
        return a - b;
    }
    @Override
    public int f1(int a, int b) {
        return a + b;
    }
    public ConsignmentItem() {
        System.out.println("Consignment item");
    }
}