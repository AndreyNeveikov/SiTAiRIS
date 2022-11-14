package com.company;

public class HygienicLipstick extends Pomade{
    @Override
    public int f7(int rub, int pen) {
        return super.f7(rub, pen);
    }

    public void f12 (String property){
        System.out.println("Моя гигиеническая помада "+ property);
    }

    @Override
    public int f2(int a, int b) {
        return a+b;
    }
}
