import java.util.*;

public class FindDups {
    public static void main(String[] args) {
        //The implementation type of the Set in
        // the preceding example is HashSet, which makes no
        // guarantees as to the order of the elements in the Set.
        // If you want the program to print the word list in alphabetical
        // order, merely change the Set's implementation type
        // from HashSet to TreeSet.
        Set<String> s = new HashSet<String>();
        for (String a : args)
            s.add(a);
        System.out.println(s.size() + " distinct words: " + s);
    }
}