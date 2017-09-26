/**
 * Created by wangz on 2017/8/26.
 */
public class InteractWithSecurityManager {
    public static void main(String[] args) {
        SecurityManager appsm  = System.getSecurityManager();
        if (appsm != null) {
            System.out.println("Cool, I've got a sm");
        }
    }
}
