import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Сoncurrency1 {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Callable task = () -> {
//            try {
//                TimeUnit.SECONDS.sleep(1);
//                return 123;
//            }
//            catch (InterruptedException e) {
//                throw new IllegalStateException("task interrupted", e);
//            }
//        };
//
//
//        ExecutorService executor = Executors.newFixedThreadPool(1);
//        Future<Integer> future = executor.submit(task);
//
////        System.out.println("future done? " + future.isDone());
//
//        Integer result = null;
//        try {
//            result = future.get(10, TimeUnit.MILLISECONDS);
//        } catch (TimeoutException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("future done? " + future.isDone());
//        System.out.print("result: " + result);
////        executor.shutdown();


//        ExecutorService executor = Executors.newWorkStealingPool();
//        List<Callable<String>> callables = Arrays.asList(
//                () -> "task1",
//                () -> "task2",
//                () -> "task3");
//
//        executor.invokeAll(callables)
//                .parallelStream()
//                .map(future -> {
//                    try {
//                        return future.get();
//                    }
//                    catch (Exception e) {
//                        throw new IllegalStateException(e);
//                    }
//                })
//                .forEach(System.out::println);



//        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
//        Runnable task = () -> System.out.println("\nScheduling: " + System.nanoTime());
//        ScheduledFuture<?> future = executor.schedule(task, 10, TimeUnit.SECONDS);
//        TimeUnit.MILLISECONDS.sleep(1337);
//        for (int i = 0; i < 12; i++) {
//            long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
//            System.out.println(String.format("Remaining Delay: %sms", remainingDelay));
//            TimeUnit.SECONDS.sleep(1);
//        }
//        executor.shutdown();



//        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
//        Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());
//        int initialDelay = 30;
//        int period = 1;
//        executor.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.SECONDS);




        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        Runnable task = () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Scheduling: " + System.nanoTime());
            }
            catch (InterruptedException e) {
                System.err.println("task interrupted");
            }
        };
        executor.scheduleAtFixedRate(task, 0, 50, TimeUnit.MILLISECONDS);


    }
}
