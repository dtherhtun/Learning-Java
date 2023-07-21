package com.turing.javase4thbatch.chapter15;

interface DoubleNumericArrayFunc
{
    double func(double[] arr) throws EmptyArrayException;
}
class EmptyArrayException extends Exception
{

    public EmptyArrayException() {
        super("Empty array exception");
    }

}
public class ExceptionDemo {
    public static void main(String[] args) {
        double[] values = {1.0f, 2.0, 3.0};
        DoubleNumericArrayFunc doubleArr = (arr)->{
            double sum = 0;
            if(arr.length == 0)
            {
                throw new EmptyArrayException();
            }
            else
            {
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                }
            }
            return sum;
        };

        try {
            System.out.println("DoubleArr "+doubleArr.func(values));
        } catch (EmptyArrayException ex) {
            ex.printStackTrace();
        }
    }
}
