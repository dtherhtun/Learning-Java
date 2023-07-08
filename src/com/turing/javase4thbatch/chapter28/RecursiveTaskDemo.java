package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class TotalSum extends RecursiveTask<Double> {

    final int threshold = 500;
    double[] data;
    int start, end;

    TotalSum(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }
    @Override
    protected Double compute() {
        double sum = 0;

        if ((end-start) < threshold ) {
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
        } else {
            int middle = (start+end)/2;
            TotalSum subTaskA = new TotalSum(data,start,middle);
            TotalSum subTaskB = new TotalSum(data,middle+1,end);

            subTaskA.fork();
            subTaskB.fork();

            sum = subTaskA.join() + subTaskB.join();
            System.out.println("Middle return "+ middle+" Sum "+ sum);
        }
        return sum;
    }
}
public class RecursiveTaskDemo {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();

        double[] numbers =  new double[10000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        TotalSum sum = new TotalSum(numbers, 0, numbers.length);
        double result = fjp.invoke(sum);
        // fjp.execute(sum); async

        System.out.println("Result "+ result);
    }
}
