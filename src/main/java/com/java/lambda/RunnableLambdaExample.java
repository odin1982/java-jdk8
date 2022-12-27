package main.java.com.java.lambda;

class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("run method called ...");
    }
}


public class RunnableLambdaExample{
    public static void main(String[] args) {
        Runnable hilo =  () -> {
            System.out.println("run method called ...");
        };

        hilo.run();
    }
}
