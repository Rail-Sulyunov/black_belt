package multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();
        System.out.println("Main ends");

    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i < 1000000000; i++) {
            if (isInterrupted()) {
                System.out.println("Potok hotyat prervat");
                System.out.println("Vse horosho, zavershaem!");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Potoc hotyat prervat vo vremya sna");
                System.out.println(sqrtSum);
                return;
            }
        }

    }
}