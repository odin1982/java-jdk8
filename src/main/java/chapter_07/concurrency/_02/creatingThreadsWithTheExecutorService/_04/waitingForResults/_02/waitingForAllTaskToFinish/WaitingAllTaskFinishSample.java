package chapter_07.concurrency._02.creatingThreadsWithTheExecutorService._04.waitingForResults._02.waitingForAllTaskToFinish;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class WaitingAllTaskFinishSample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(() -> 30 + 11);
            Future<Integer> result1 = service.submit(() -> 40 + 11);
            Future<Integer> result2 = service.submit(() -> 50 + 11);
            Future<Integer> result3 = service.submit(() -> 60 + 11);
            Future<Integer> result4 = service.submit(() -> 70 + 11);
        }finally{
            if(service != null) service.shut
        }

        if(service != null){
            service.awaitTermination(1, TimeUnit.MINUTES);
            if(service.isTerminated())
                System.out.println("All task finished");
            else
                System.out.println("At least one task is still running");
        }
    }

}
