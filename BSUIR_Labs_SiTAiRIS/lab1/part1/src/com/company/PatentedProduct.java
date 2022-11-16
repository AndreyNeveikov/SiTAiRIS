package com.company;

public class PatentedProduct extends CombinerOfExistingProducts {
    @Override
    int f7(int a, int b) {
        return a + b;
    }
    @Override
    public int f2(int a, int b) {
        return a *b;
    }
    @Override
    public int f1(int a, int b) {
        return a-b;

    }
    public PatentedProduct() {
        System.out.println("f7:" + f7(3,4) +"f2:"+f2(1,2) + "f1:"+f1(2,1));
    }
}