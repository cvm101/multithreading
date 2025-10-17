package org.example;

public class MultiThreadingPractice {
    public static void main(String[] args) {
      Test t1 = new Test(); //new state
        Thread th1 = new Thread(t1);
        th1.start(); // runnable state
        while(true){
            System.out.println("Main Thread is running");
        }
    }
}
