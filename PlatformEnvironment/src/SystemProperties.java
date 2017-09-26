import java.util.Properties;
import java.util.Set;

/**
 * Created by wangz on 2017/8/26.
 */
public class SystemProperties {
    public static void main(String[] args) {
        writeSystemProperties();
        printSystemProperties();
    }
    public static void printSystemProperties(){
        //first way
        String fileSeparator = System.getProperty("MyName");
        System.out.println(fileSeparator);
        //second way
        Properties systemProperties = System.getProperties();
        for (Object key : systemProperties.keySet()) {
            System.out.format("%s = %s%n", key.toString(), systemProperties.get(key));
        }
    }
    public static void writeSystemProperties(){
        //This change is not persistent
        //It's only working in current running application
        Properties systemProperties = System.getProperties();
        systemProperties.put("MyName", "Jason");
        System.setProperties(systemProperties);
    }
}
