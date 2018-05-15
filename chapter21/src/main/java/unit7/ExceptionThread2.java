package unit7;

public class ExceptionThread2 implements Runnable {

    public void run() {
        throw new RuntimeException();
    }
}
