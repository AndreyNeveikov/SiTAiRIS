package com.company;

public class ExpectedResult extends TesterProgramm implements HumanTestering, RatePrice {
    @Override
    String f9() {
        return "f9";
    }
    @Override
    public String f10() {
        return "f10";
    }
    @Override

    public String f8() {
        return "f8";
    }
    @Override
    public int f2(int a, int b) {
        return 2;
    }
    @Override
    public String f3(String a) {
        return null;
    }
    @Override
    public void f4(String s1) {
        System.out.print("f4");
    }
    @Override
    public int f5(int a, int b) {
        return a+b;
    }
    @Override
    public int f1(int a, int b) {
        return a-b;
    }
    public ExpectedResult() {
        System.out.println("Some result");
    }
}