import Multithreading.Multithreading_Thread;
import Multithreading.Multithreading_with_runnable_interface;

public class Main {
    public static void main(String[] args){
        Multithreading_Thread threadObj = new Multithreading_Thread();
//        threadObj.start();
        Multithreading_with_runnable_interface obj = new Multithreading_with_runnable_interface();
        Thread thread1 = new Thread(obj);
        thread1.start();
    }
}
