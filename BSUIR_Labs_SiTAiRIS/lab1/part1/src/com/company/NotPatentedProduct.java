package com.company;

public class NotPatentedProduct extends CombinerOfExistingProducts {
    @Override
    int f7(int a, int b) {
        return a + b;
    }
    @Override
    public int f2(int a, int b) {
        return a*b;
    }
    @Override
    public int f1(int a, int b) {
        return a-b;
    }
    public NotPatentedProduct() {
        System.out.println("f7:" + f7(6,4)  +  " f2:"+f2(9,2) +" f1:"+f1(2,1));
    }
}
