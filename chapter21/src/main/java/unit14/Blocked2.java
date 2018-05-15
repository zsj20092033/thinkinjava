package unit14;

public class Blocked2 implements Runnable {
    BlockedMutex blockedMutex = new BlockedMutex();

    public void run() {
        System.out.println("Waiting for f() in BlockedMutex");
        blockedMutex.f();
        System.out.println("Broken out of blocked call");
    }
}
