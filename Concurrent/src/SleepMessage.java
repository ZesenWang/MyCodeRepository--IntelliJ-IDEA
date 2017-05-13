/**
 * Created by wangz on 2017/3/4.
 */

public class SleepMessage implements Runnable{
    public static void main(String[] args) {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };
        try {
            Thread t = new Thread(new SleepMessage());
            t.start();
            //current thread need wait until t thread is terminated
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(String info:importantInfo){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(info);
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("the current thread can proceed only when I terminates");
    }
}
