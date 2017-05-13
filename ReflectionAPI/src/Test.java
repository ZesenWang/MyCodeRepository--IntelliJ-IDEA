/**
 * Created by wangz on 2017/2/20.
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Father father = new Father();
        Class father1 = father.getClass();

        Class father2 = Father.class;

        Class father3 = Class.forName("Father");
    }
}
