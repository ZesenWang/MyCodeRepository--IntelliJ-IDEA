import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Created by wangz on 2017/8/29.
 */
public class BulkOperations {
    //It doesn't work because Arrays.asList doesn't have a remove or add method
//    static Collection originalList = Arrays.asList("Jason", "Lannister", "Stark");
//    static Collection retainList = Arrays.asList("Jason", "Lannister");
    //use conversion method
    static Collection originalTemp = Arrays.asList("Jason", "Lannister", "Stark");
    static Collection retainTemp = Arrays.asList("Jason", "Lannister");
    static Collection originalList = new HashSet(originalTemp);
    static Collection retainList = new HashSet(retainTemp);

    public static void main(String[] args) {
        convertToArray();
        retain();
    }
    public static void convertToArray(){
        Object[] a = originalList.toArray();
        System.out.println(a);
        //String[] b = retainList.toArray(new String[0]);
    }
    public static void retain() {
        originalList.retainAll(retainList);
        for (Object name : originalList) {
            System.out.println(name);
        }
    }
}
