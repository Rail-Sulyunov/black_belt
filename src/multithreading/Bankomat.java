package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employees("Zaur", lock);
        new Employees("Oleg", lock);
        new Employees("Elena", lock);
        Thread.sleep(5000);
        new Employees("Viktor", lock);
        new Employees("Marina", lock);
    }
}

class Employees extends Thread {
    String name;
    private Lock lock;

    public Employees(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + " ждет....");
//            lock.lock();
                System.out.println(name + " пользуется банкоматом");
                Thread.sleep(2000);
                System.out.println(name + " завершил (а) свои дела");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + "не хочет ждать в очереди");
        }
    }
}