package com.company;

public class DecorativeLipstick extends Pomade{
    @Override
    public int f7(int rub, int pen) {
        return super.f7(rub, pen);
    }

    public void f13 (String color){
        System.out.println("У меня есть " + color+ " помада");
    }

    @Override
    public int f2(int a, int b) {
        return a+b;
    }
}
