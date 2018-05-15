package unit7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CaptureUncaughtException {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(new HandlerThreadFactory());
        for (int i = 0; i < 5; i++) {
            exec.execute(new ExceptionThread2());
        }
        exec.shutdown();
    }
}
