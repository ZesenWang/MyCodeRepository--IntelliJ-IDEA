/**
 * Created by wangz on 2017/4/8.
 */
public class Interrupted {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        Thread.sleep(1000);
        //set interrupt status
        thread.interrupt();
    }
}
