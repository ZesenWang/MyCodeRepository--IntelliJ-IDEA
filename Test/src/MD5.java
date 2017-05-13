import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by wangz on 2016/11/27.
 */
public class MD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException, CloneNotSupportedException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        MD5 md5 = new MD5();
        md.update("jason".getBytes());
        byte[] toChapter1Digest = md.digest();

        md.update("jason".getBytes());
        byte[] toChapter2Digest = md.digest();
        //这里没有执行，说明length相同
        if(toChapter1Digest.length != toChapter2Digest.length)
            System.out.println("OMG, their length are different!");

        System.out.println("toChapter1Digest: "+md5.byteArrayToHex(toChapter1Digest));
        System.out.println("toChapter2Digest: "+md5.byteArrayToHex(toChapter2Digest));

        for(int i = 0; i < toChapter1Digest.length; i++){
            System.out.print(toChapter1Digest[i]);
//            if(toChapter1Digest[i] != toChapter2Digest[i]){
//                System.out.println("\ndifferent");
//                return;
//            }
        }
        System.out.println("\n"+toChapter1Digest.length);
        for(int i = 0; i < toChapter2Digest.length; i ++){
            System.out.print(toChapter2Digest[i]);
        }
        System.out.println("same");
    }
    public String byteArrayToHex(byte[] byteArray){
        // 首先初始化一个字符数组，用来存放每个16进制字符

        char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9', 'A','B','C','D','E','F' };



        // new一个字符数组，这个就是用来组成结果字符串的（解释一下：一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方））

        char[] resultCharArray =new char[byteArray.length * 2];



        // 遍历字节数组，通过位运算（位运算效率高），转换成字符放到字符数组中去

        int index = 0;

        for (byte b : byteArray) {

            resultCharArray[index++] = hexDigits[b>>> 4 & 0xf];

            resultCharArray[index++] = hexDigits[b& 0xf];

        }



        // 字符数组组合成字符串返回

        return new String(resultCharArray);
    }
}
