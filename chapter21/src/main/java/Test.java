import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test implements Runnable {

    public void run() {
        System.out.println("hello");
        try {
            Thread.currentThread().wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("world");
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Test());
        }

    }

}
