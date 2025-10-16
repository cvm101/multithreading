package org.example;

public class MultiThreadingPractice {
    public static void main(String[] args) {
      Test t1 = new Test();
        Thread th1 = new Thread(t1);
        th1.start();
        while(true){
            System.out.println("Main Thread is running");
        }
    }
}
