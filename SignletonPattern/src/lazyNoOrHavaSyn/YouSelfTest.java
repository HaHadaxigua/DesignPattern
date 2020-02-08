package lazyNoOrHavaSyn;

public class YouSelfTest implements Runnable{
    Object obj = null;
    @Override
    public void run() {
//        obj = YouSelf.getInstance();
//        System.out.println(Thread.currentThread().getName()+"个---"+obj.hashCode());
        try {
            for(int i=0;i<10;i++){
                Thread.sleep(50);
                System.out.println(Thread.currentThread().getName()+"no."+i+"个---"+YouSelf.getInstance().hashCode());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        YouSelfTest yt = new YouSelfTest();
        Thread t1 = new Thread(yt, "thread-1");
        Thread t2 = new Thread(yt, "thread-2");
        t1.start();
        t2.start();
    }
}
