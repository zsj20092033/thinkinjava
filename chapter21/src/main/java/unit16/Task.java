package unit16;

public class Task implements Runnable {

    static Blocker blocker = new Blocker();

    public void run() {
        blocker.waitingCall();
    }
}
