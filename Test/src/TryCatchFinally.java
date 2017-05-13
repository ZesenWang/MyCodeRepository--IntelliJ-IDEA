import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.MessageDigest;

/**
 * Created by wangz on 2016/11/19.
 */
public class TryCatchFinally {
    public static void main(String []args){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\wangz\\IdeaProjects\\JavaProject\\Calendar\\src\\a.txt");
            System.out.println("statement below fis");
        }catch (FileNotFoundException e){
            System.out.println("catch");
            e.printStackTrace();
        }finally {
            System.out.println("It seems I must be excecuted");
        }
        BufferedInputStream bis = new BufferedInputStream(fis);

        //System.out.println(bis.read());
        System.out.println("I want to be excecuted too");
    }
}
