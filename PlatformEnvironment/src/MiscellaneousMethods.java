/**
 * Created by wangz on 2017/8/26.
 */
public class MiscellaneousMethods {
    public static void main(String[] args) throws InterruptedException {
        measureTimeInterval();
        exitApp();
    }
    public static void measureTimeInterval() throws InterruptedException {
        long begin = System.currentTimeMillis();
        Thread.sleep(100);
        long end = System.currentTimeMillis();
        System.out.println("time interval: " + (end - begin));
    }

    public static void exitApp(){
        System.exit(10086);
        System.out.println("This is never gonna be printed");
    }

    public static void copyArray(){
        //System.arraycopy();
    }
}
