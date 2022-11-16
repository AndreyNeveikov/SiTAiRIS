package com.company;

public class OrderManager extends Order implements OrderOptions {
    @Override
    public String f3(String operation) {
        return operation;
    }

    @Override
    public void f10() {
        System.out.println("Передача управления прошла успешно");
    }

}
