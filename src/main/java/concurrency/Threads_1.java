package concurrency;

public class Threads_1 {
    public static void main(String[] args) {
        //Thread atual
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

        //Nova Thread
        Thread t1 = new Thread(new MeuRunnable());
        t1.run();//Executando na thread main

        //Nova Thread com Lambda
        Thread t2 = new Thread(() -> System.out.println(Thread.currentThread().getName()));

        //Varias Thread
        Thread t3 = new Thread(new MeuRunnable());

        t1.start();//Executando em uma nova thread
        t2.start();//Executando em uma nova thread
        t3.start();//Executando em uma nova thread
    }
}
