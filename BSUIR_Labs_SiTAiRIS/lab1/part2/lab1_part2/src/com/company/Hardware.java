package com.company;

public class Hardware extends ComponentPart {
    @Override
    public int f7(int modulCost, int workCost) {
        return super.f7(modulCost, workCost);
    }

    public void f13 (String modulName){
        System.out.println("На ваш компьютер установлено " + modulName);
    }

    @Override
    public int f2(int a, int b) {
        return a+b;
    }
}
