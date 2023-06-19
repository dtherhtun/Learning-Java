package com.turing.javase4thbatch.chapter10;

class StackOverflowException extends Exception
{
    public StackOverflowException(String message) {
        super(message);
    }

}
class StackUnderflowException extends Exception
{
    public StackUnderflowException(String message) {
        super(message);
    }
}

class Stack
{
    private int[] items = new int[10];
    private int top = -1;

    public void push(int element) throws StackOverflowException
    {
        System.out.println("Top "+top);
        if(top >= items.length-1)
        {
            throw new StackOverflowException("Stackoverflow exception");
        }
        else
        {
            this.items[++top] = element;
        }

    }
    public int pop()throws StackUnderflowException
    {
        if(top ==-1)
        {
            throw new StackUnderflowException("Stack underflow exception");
        }
        return this.items[top--];
    }
}
public class CustomException {
    public static void main(String[] args) {
        Stack stack = new Stack();
        try
        {
            for (int i = 0; i < 10; i++) {
                stack.push(i);
            }
            for (int i = 0; i < 11; i++) {
                System.out.println("Pop "+stack.pop());
            }
        }
        /*
        catch(StackOverflowException | StackUnderflowException e)
        {
            System.out.println("Error "+e.getMessage());
            e.printStackTrace();
        }
         */
        catch(StackOverflowException e)
        {
            System.out.println("Error "+e.getMessage());
            e.printStackTrace();
        }
        catch(StackUnderflowException e)
        {
            System.out.println("Error "+e.getMessage());
            e.printStackTrace();
        }

    }
}
