import java.io.*;

/**
 * Created by wangz on 2017/8/27.
 */
public class IOFromCommandLine {
    public static void main(String[] args) throws IOException {
        //IOFromConsole();
        IOFromStandardStreams();
    }
    public static void IOFromConsole(){
        Console console = System.console();
        /*
        If System.console returns NULL, then Console operations are
         not permitted, either because the OS doesn't support them or
         because the program was launched in a noninteractive environment.
        * */
        if (console != null) {
            String username = console.readLine("Enter your name ");
            char[] pwd = console.readPassword("Enter your password ");
            console.format("Login successfully");
        } else {
            System.err.println("No console");
            System.exit(1);
        }

    }
    public static void IOFromStandardStreams() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        PrintStream out = System.out;
        PrintStream err = System.err;
        out.print("Enter your name: ");
        char[] name = new char[50];
        in.read(name);
        out.print(name);
        err.format("%nlogin failed");
        System.exit(1);
    }
}
