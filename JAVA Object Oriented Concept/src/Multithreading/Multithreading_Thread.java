package Multithreading;

//public class Multithreading_Thread extends Thread{
//
//    public void run(){
//        for(int i = 0; i < 4; i++){
//            System.out.println("Thread is Running");
//        }
//    }
//
//    public void show(){
//        System.out.println("This is a thread");
//    }
//}

public class Multithreading_Thread extends Thread{
    private String threadName;
    private Thread t;

    public Multithreading_Thread(String threadName){
        this.threadName = threadName;
        System.out.println("Creating Thread " + threadName);
    }

    public Multithreading_Thread(){
        System.out.println("Creating Default Thread");
        this.threadName = "Default Thread";
    }

    @Override
    public void run() {
        System.out.println("Running the Thread " + threadName);
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}



