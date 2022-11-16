package com.company;

public class Buyer extends Client implements OrderOptions, ChooseProduct {
    @Override
    public String f3(String recommendedProduct) {
        return recommendedProduct;
    }

    @Override
    public void f10() {
        System.out.println("Такой клиент существует");
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
    public int f9(int clientId) {
        return super.f9(clientId);
    }

    @Override
    public int f5(int modulCost, int workCost) {
        return modulCost + workCost;
    }
}


