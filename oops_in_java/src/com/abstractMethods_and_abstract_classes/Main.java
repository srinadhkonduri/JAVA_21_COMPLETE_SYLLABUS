package com.abstractMethods_and_abstract_classes;

abstract class Birds {
    abstract public void doThings();
}

class Sparrow extends Birds {

    @Override
    public void doThings() {
        System.out.println("sparrow can fly in the air");
    }
}


class Penguin extends Birds {

    @Override
    public void doThings() {
        System.out.println("penguin can swim in the water");
    }
}

class Peacock extends Birds{

    @Override
    public void doThings() {
        System.out.println("peacock can walk around the land");
    }
}


public class Main {
    public static void main(String[] args) {
        new Sparrow().doThings();
        new Penguin().doThings();
        new Peacock().doThings();
    }
}
