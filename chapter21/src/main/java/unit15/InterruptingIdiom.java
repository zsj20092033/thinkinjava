package unit15;

import java.util.concurrent.TimeUnit;

public class InterruptingIdiom {
    public static void main(String[] args) throws Exception {
//        if (args.length != 1) {
//            System.out.println("usage: java InterruptingIdiom delay-in-ms");
//            System.exit(1);
//        }
        Thread t = new Thread(new Blocked3());
        t.start();
        TimeUnit.MILLISECONDS.sleep(1100);
        t.interrupt();
    }
}
