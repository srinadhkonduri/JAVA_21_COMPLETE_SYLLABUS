package com.inheritance.multi_level;

class Parent {
    public void hello(){
        System.out.println("saying hello");
    }
}


class Child extends Parent{
    public void helloChild(){
        System.out.println("saying hello child");
    }
}


class GrandChild extends Child{
    public void helloGrandChild(){
        System.out.println("saying hello grand child");
    }
}

public class Example2 {
    public static void main(String[] args) {
        GrandChild grandChild = new GrandChild();
        grandChild.hello();
        grandChild.helloChild();
        grandChild.helloGrandChild();
    }
}
