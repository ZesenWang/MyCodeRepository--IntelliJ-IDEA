/**
 * Created by wangz on 2017/9/24.
 */
public class Uninitialized {
    //field have default value
    static int field;

    public static void main(String[] args) {
        int localVariable;
        System.out.println(field);
        //localVariable won't be initialized automatically
        //System.out.println(localVariable);
    }
}
