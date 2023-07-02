package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.*;

class Sum implements Callable<Integer> {

    int stop;
    Sum(int v) {
        this.stop = v;
    }
    @Override
    public Integer call() throws Exception {
        Integer result = 0;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < stop; i++) {
            result += i;
        }
        return result;
    }
}
public class CallableDemo {
    public static void main(String[] args)  {
        try {
            ExecutorService es = Executors.newFixedThreadPool(3);
            Future<Integer> sumResult;

            System.out.println("Submit");
            sumResult = es.submit(new Sum(20));
            System.out.println("Get "+ sumResult.get(20, TimeUnit.MILLISECONDS));
            System.out.println("Another line");

            es.shutdown();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }
    }
}
