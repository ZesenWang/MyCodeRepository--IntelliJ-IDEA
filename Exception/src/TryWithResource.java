import java.io.*;

/**
 * Created by wangz on 2017/8/21.
 */
public class TryWithResource {
    public static void main(String[] args) throws IOException{

        //可以声明多个参数
        try(OutputStream out = new FileOutputStream("a.txt");
            BufferedReader reader = new BufferedReader(new FileReader("non.exist"))){

        }
        //try后面的圆括号可以声明集成了autoclosable的类，系统自动关闭，防止资源泄露，不需要在finally块里处理
//         finally {
//            if(reader != null){
//                reader.close();
//            }
//        }
    }

}
