package MutiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(10);
        //ExecutorService executor=Executors.newCachedThreadPool();

        for (int i=0;i<100;i++){
            PrintNumber p=new PrintNumber(i);
            executor.execute(p);
//            Thread t=new Thread(p);
//            t.start();

        }

    }
}
