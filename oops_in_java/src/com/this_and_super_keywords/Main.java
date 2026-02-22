package com.this_and_super_keywords;

class A {
    public void m1(){
        System.out.println("m1 method ... ");
    }

    public void m2(){
        System.out.println("m2 method ... ");
    }
}

class B extends A{

    public void m1(){
        System.out.println("m1 method in B class ... ");
    }

    public void m3(){
        System.out.println("m3 method ... ");

        // parent class m1 method
        super.m1();

        // child class m1 method ...
        m1();
    }
}


public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.m3();
        b.m2();
    }
}
