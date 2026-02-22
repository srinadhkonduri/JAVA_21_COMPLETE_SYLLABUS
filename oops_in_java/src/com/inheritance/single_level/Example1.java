package com.inheritance.single_level;


class A{
    int year = 2026;
    public void sayHello(){
        System.out.println("saying hello to the world");
    }

    public void executeMethods(){
        System.out.println("saying good after noon to the world");

        // accessing say hello method
        sayHello();
    }
}


class B extends A{
    public void sayBye(){
        System.out.println("saying bye to the world");
    }

    public void  sayPorraWasteFellow(){
        sayBye();
        System.out.println("namaste uncle nenu aagam ni me padalaku shathakoti vandanalu");


    }
}

public class Example1 {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        System.out.println(a.year);
        System.out.println(b.year);
    }
}
