import java.io.IOException;

/**
 * Created by wangz on 2017/8/22.
 */
public class ThrowException {

    boolean isThrow = true;

    public static void main(String[] args) {
        ThrowException throwException = new ThrowException();

        try {
            throwException.throwException();
        } catch (LinkedListException e) {
            //自己打印stack trace
//            StackTraceElement elements[] = e.getStackTrace();
//            for (int i = 0, n = elements.length; i < n; i++) {
//                System.err.println(elements[i].getFileName()
//                        + ":" + elements[i].getLineNumber()
//                        + ">> "
//                        + elements[i].getMethodName() + "()");
//            }
            //let the default method print stack trace
            e.printStackTrace();
        }
        //RuntimeException doesn't need to be surrounded by try, catch clauses
        throwException.throwRuntimeException();
    }

    public void throwException() throws LinkedListException {
        if(isThrow)
            throw new LinkedListException();
    }

    public void throwRuntimeException() throws ARuntimeException {
        throw new ARuntimeException();
    }
}
