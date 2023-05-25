package multithreading;

public class Ex12 {
    static final Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }

    void whatsAppCall() {
        synchronized (lock) {
            System.out.println("whatsAppCall call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("whatsAppCall call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImpMobile());
        Thread thread2 = new Thread(new RunnableImpSkype());
        Thread thread3 = new Thread(new RunnableImpWhatsApp());
        thread1.start();
        thread2.start();
        thread3.start();


    }
}

class RunnableImpMobile implements Runnable {

    @Override
    public void run() {
        new Ex12().mobileCall();
    }
}

class RunnableImpSkype implements Runnable {

    @Override
    public void run() {
        new Ex12().skypeCall();
    }
}

class RunnableImpWhatsApp implements Runnable {

    @Override
    public void run() {
        new Ex12().whatsAppCall();
    }
}

