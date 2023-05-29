package multithreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 =new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread10 : Popitka zahvatit monitor obekta lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread10 : Monitor obekta lock1 zahvachen");
            System.out.println("Thread10 : Popitka zahvatit monitor obekta lock2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread10 : Monitori obekta " +
                        "lock1 i lock2 zahvacheni");

            }
        }
    }
}
class Thread20 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread20 : Popitka zahvatit monitor obekta lock2");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread20 : Monitor obekta lock2 zahvachen");
            System.out.println("Thread20 : Popitka zahvatit monitor obekta lock1");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread20 : Monitori obekta " +
                        "lock1 i lock2 zahvacheni");

            }
        }
    }
}