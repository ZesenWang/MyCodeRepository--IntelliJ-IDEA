import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.util.ArrayList;

/**
 * Created by wangz on 2016/11/19.
 */
public class TryCatchFinally {
    public static void main(String []args){
        FileInputStream fis = null;
        //IndexOutOfBoundary异常属于Unchecked异常
        ArrayList arrayList = new ArrayList();
        arrayList.get(5);

        try {
            fis = new FileInputStream("C:\\Users\\wangz\\IdeaProjects\\JavaProject\\Calendar\\src\\a.txt");
            System.out.println("statement below fis");
        } catch (FileNotFoundException e){
            System.out.println("catch");
            e.printStackTrace();
        }finally {
            System.out.println("It seems I will definately be excecuted");
        }
        BufferedInputStream bis = new BufferedInputStream(fis);

        //这个语句会执行
        System.out.println("I want to be excecuted too");
    }
}
