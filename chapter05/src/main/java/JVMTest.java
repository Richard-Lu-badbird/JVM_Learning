/*
    测试栈溢出的情况。
 */
public class JVMTest {
    private static int count = 1;
    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
