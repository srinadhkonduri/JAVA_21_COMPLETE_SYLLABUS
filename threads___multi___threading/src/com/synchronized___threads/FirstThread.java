package com.synchronized___threads;

public class FirstThread extends Thread{

    SharedLogic sharedLogic;

    public FirstThread(SharedLogic sharedLogic){
        this.sharedLogic = sharedLogic;
    }


    @Override
    public void run(){
        sharedLogic.printData(10);
    }

}
