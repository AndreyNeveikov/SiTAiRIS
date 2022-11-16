package com.company;

public class Order implements PrepareDocuments, AddNewOrder{
    @Override
    public void f4(String a) {
        System.out.println("Создан заказ с хэшем " + a);
    }

    @Override
    public int f5(int workTime, int deliveryTime) {
        return workTime + deliveryTime;
    }
}
