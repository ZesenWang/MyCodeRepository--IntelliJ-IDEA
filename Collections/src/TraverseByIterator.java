import java.util.*;

/**
 * Created by wangz on 2017/8/29.
 */
public class TraverseByIterator {
    public static void main(String[] args) {
        //either way works
        List collection = new LinkedList();
        collection.add("Jamie");
        collection.add("Jason");
        collection.add("Lannister");
//        List temp = Arrays.asList("Jamie", "Jason", "Lannister");
//        List collection = new ArrayList(temp);

        for(Iterator it = collection.iterator(); it.hasNext();) {
            String name = (String) it.next();
            if (name.equals("Jamie")) {
                it.remove();
            }
        }
        for(Iterator it = collection.iterator(); it.hasNext();)
            System.out.println(it.next());
    }
}
