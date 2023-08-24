public class DoubleTest {
    //用来测试Double类型之间的比较方法
    public static void main(String[] args) {
        Double a = 0.1 + 0.2;
        Double b = 0.3;

        System.out.println(a.equals(b));//false
        //如果想要判断两个Double类型的值想不想得等。我们应该设置一个阈值。
        double epsilon = 1e-10;

        if (a - b < epsilon) {
            System.out.println("这两个数值其实是一样的啦");
        }else {
            System.out.println("这两个数值其实一点也不一样");
        }
    }
}
