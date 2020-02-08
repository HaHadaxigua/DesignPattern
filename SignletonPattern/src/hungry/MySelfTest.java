package hungry;

public class MySelfTest implements Runnable{
    public static void main(String[] args) {

        MySelfTest mt = new MySelfTest();
        Thread thread = new Thread(mt, "mt1");
        thread.start();
        Thread thread2 = new Thread(mt, "mt2");
        thread2.start();

    }


    @Override
    public void run() {
        Object object = null;
        for(int i=0;i<10;i++){
            System.out.print("Thread: "+ i+"------");
            try {
                Thread.sleep(50);
                object = MySelf.getInstance();
                System.out.print("hashcoee:"+object.hashCode()+"----"+object+"\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    private void simpleTest(){
        MySelf mySelf = MySelf.getInstance();
        System.out.println(mySelf);
        System.out.println("mySelf.getAge():"+mySelf.getAge());
        MySelf mySelf1 = MySelf.getInstance();
        System.out.println(mySelf1);
        System.out.println("mySelf1.getAge():"+mySelf1.getAge());
        mySelf1.setAge(18);
        System.out.println("mySelf1.getAge():"+mySelf1.getAge());
        System.out.println("mySelf.getAge():"+mySelf.getAge());
        boolean result = mySelf == mySelf1;
        System.out.println("is mySelf1==mySelf?"+result);
    }
}
