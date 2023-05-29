package multithreading;

public class DaemonEx {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserTread userTread = new UserTread();
        userTread.setName("user_thread");
        DaemonTread daemonTread = new DaemonTread();
        daemonTread.setName("daemon_thread");
        daemonTread.setDaemon(true);
        userTread.start();
        daemonTread.start();
        System.out.println("Main thread ends");
    }
}

class UserTread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is daemon: " + isDaemon());

        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

class DaemonTread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is daemon: " + isDaemon());

        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
