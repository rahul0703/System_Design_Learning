package Multithreading;

public class Multithreading_Thread extends Thread{

    public void run(){
        for(int i = 0; i < 4; i++){
            System.out.println("Thread is Running");
        }
    }

    public void show(){
        System.out.println("This is a thread");
    }
}
