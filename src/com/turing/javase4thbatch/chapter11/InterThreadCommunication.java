package com.turing.javase4thbatch.chapter11;

class Message {
    private String content;
    private boolean hasNewMessage = false;

    public synchronized void send(String message) {
        while (hasNewMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        content = message;
        hasNewMessage = true;
        notify();
    }

    public synchronized String receive() {
        while (!hasNewMessage) {
            try {
                wait();
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
        hasNewMessage = false;
        notify();
        return content;
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        final Message message = new Message();

        Thread senderThread = new Thread(() -> {
            String[]  messages = { "Hello", "How are you?", "Goodbye" };
            for (String msg : messages) {
                message.send(msg);
                System.out.println("Sent: "+msg);
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });

        Thread receiverThread = new Thread(() -> {
            for (int i = 0; i < 3; i++){
                String receivedMsg = message.receive();
                System.out.println("Received: " + receivedMsg);
            }
        });

        senderThread.start();
        receiverThread.start();
    }
}
