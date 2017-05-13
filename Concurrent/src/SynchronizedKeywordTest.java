/**
 * Created by wangz on 2017/4/8.
 */
public class SynchronizedKeywordTest {
    int sum = 0;
    //use synchronized statement
    public void increment(){
        synchronized (this){
            sum++;
        }
    }
    //use synchronized keyword
    public synchronized void printSum(){
        System.out.println(sum);
    }
    //it might be a wrong answer without synchronized keyword
//    public  void increment(){sum++;}
//    public  void printSum(){
//        System.out.println(sum);
//    }

    public static void main(String[] args) {
        SynchronizedKeywordTest test = new SynchronizedKeywordTest();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 50; i++){
                    test.increment();
                    test.printSum();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 50; i++){
                    test.increment();
                    test.printSum();
                }
            }
        }).start();
    }
}
