package org.example;

public class MyThread extends Thread{
    public void run(){
        try {
            Thread.sleep(1000);
            System.out.println("Child Thread is running");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread(); // new state
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        t1.join();
    }
}
