package concurrency;

public class Synchronized_1 {
    static int i = -1;

    public static class MeuRunnable implements Runnable{
//        static Object lock1 = new Object();//porta de entrada para bloco sincronizado
//        @Override
//        public synchronized void run() { //synchronized na assinatura do metodo
        public void run() {
            imprime();
//            synchronized (this){//bloco synchronized sincronizando instancia de MeuRunnable
//                i++;
//                String name = Thread.currentThread().getName();
//                System.out.println(name + ":" + i);
//            }
        }
    }

    public static void imprime(){
        synchronized (Synchronized_1.class){//sincronizado pela classe pelo fato de ser statico, uma thread pode executar na jvm toda
            i++;
            String name = Thread.currentThread().getName();
            System.out.println(name + ":" + i);
        }
    }
    public static void main(String...args){
        MeuRunnable runnable = new MeuRunnable();

        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
