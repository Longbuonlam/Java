package Week5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Multithreading {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i=1; i<=10; i++){
            int taskID = i;
            executor.submit(() -> {
                System.out.println("Executing task "+ taskID +" by "+Thread.currentThread());
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch(InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
    }
}
