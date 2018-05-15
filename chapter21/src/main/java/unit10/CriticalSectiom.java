package unit10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CriticalSectiom {
    static void testApproaches(PairManager pm1, PairManager pm2) {
        ExecutorService exec = Executors.newCachedThreadPool();
        PairManipulator p1 = new PairManipulator(pm1);
        PairManipulator p2 = new PairManipulator(pm2);
        PairChecker pc1 = new PairChecker(pm1);
        PairChecker pc2 = new PairChecker(pm2);
        exec.execute(p1);
        exec.execute(p2);
        exec.execute(pc1);
        exec.execute(pc2);
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }
        System.out.println("p1: " + p1 + "\np2: " + p2);
        System.exit(0);
    }

    public static void main(String[] args) {
        PairManager pm1 = new PairManager1(),
                pm2 = new PairManager2();
        testApproaches(pm1, pm2);
    }
}
