package org.example.kunDSA.java8.functional;

class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("running from class implemented");
    }
}
public class RunnableLambdaExample {
    public static void main(String[] args) {
        Thread threadClass = new Thread(new ThreadDemo());

        Thread threadLambda = new Thread(()->{
            System.out.println("running from lambda");
        });

        Runnable runnable = () -> System.out.println("hey i m from runnable");
        Thread threadRunnable = new Thread(runnable);

        threadLambda.start();
        threadClass.start();
        threadRunnable.start();
    }
}
