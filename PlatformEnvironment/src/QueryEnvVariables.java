import java.util.Map;

/**
 * Created by wangz on 2017/8/25.
 */
public class QueryEnvVariables {
    public static void main(String[] args) {
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",envName, env.get(envName));
        }
    }
}
