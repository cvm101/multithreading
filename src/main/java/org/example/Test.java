package org.example;

public class Test implements Runnable{

    public void run(){
        int i = 0;
        while(i<5){
            System.out.println("Child Thread is running");
        }
    }

}
