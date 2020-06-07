package lazyDoubleCheckedLocking;

public class Test implements Runnable {

    Object obj = null;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            obj = Singleton.getInstance();
            System.out.println(Thread.currentThread() + "no." + i + "----" + obj.hashCode());
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        Thread t1 = new Thread(t, "thread1:");
        Thread t2 = new Thread(t, "thread2:");
        t1.start();
        t2.start();
    }
}
