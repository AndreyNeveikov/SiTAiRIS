package com.company;

    public class NewProduct implements CreateProduct {
        public int f2(int a, int b) {

            return a - b;
        }
        public int f1(int a, int b) {

            return a * b;
        }
        public NewProduct() {
            System.out.println("f2:" + f2(3,1) + "f1:"+ f1(1,1));
        }
    }

