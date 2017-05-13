/**
 * Created by wangz on 2017/4/8.
 */
public class Interrupted {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //check for interrupt status, wait to be interrupted
                while (!Thread.interrupted());
                //the codes below are excecuted. what does interrupt mean ?
                System.out.println("I'm interrupted");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Am I still alive?");
            }
        });
        thread.start();

        //set interrupt status
        thread.interrupt();
    }
}
