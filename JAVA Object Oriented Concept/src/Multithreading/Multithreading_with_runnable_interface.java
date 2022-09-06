package Multithreading;

public class Multithreading_with_runnable_interface implements Runnable{
//    @Override
//    public void run() {
//        for(int i = 0; i < 4; i++){
//            System.out.println("This is a Thread");
//        }
//    }

    @Override
    public void run(){
        for(int i = 0; i < 4; i++){
            System.out.println("This is a Thread");
//          Print at the interval of 1 sec
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println("exception " + e.getMessage());
            }
        }
    }
}
