package com.tosan.example7;

import java.util.Random;
import java.util.concurrent.*;

public class Example7 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(Example7::count);
        int count = 0;
        try {
            count = future.get(1, TimeUnit.MILLISECONDS);
        } catch (TimeoutException ex){
            System.out.println(ex);
        }
        System.out.println("count is " + count);
        Future<Integer> future1 = executorService.submit(Example7::count);
//        int count1 = future1.get();
//        System.out.println(count + " and " + count1);
        try {
            count = future.get(1, TimeUnit.MILLISECONDS);
        } catch (TimeoutException ex){
            System.out.println(ex);
        }
        executorService.shutdownNow();        System.out.println("count is " + count);
        System.out.println("count is " + count);
    }

    public static Integer count() throws InterruptedException {
        Random random = new Random();
        Thread.sleep(10);
        int count = 0;
        for (int i=0;i< random.nextInt(10000); i++){
            count += i;
            System.out.println(Thread.currentThread().getName() + " Count is "+ count);
        }
        return count;
    }
}
