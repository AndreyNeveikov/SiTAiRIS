package com.company;

public class Software extends ComponentPart {
    @Override
    public int f7(int modulCost, int workCost) {
        return super.f7(modulCost, workCost);
    }

    public void f12 (String loadingStatus){
        System.out.println("Пограммное обеспечение успешно "+ loadingStatus);
    }

    @Override
    public int f2(int a, int b) {
        return a+b;
    }
}
