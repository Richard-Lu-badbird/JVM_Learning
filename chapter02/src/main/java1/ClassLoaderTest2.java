public class ClassLoaderTest2 {
    public static void main(String[] args) {

        try {
            //1. 使用Class.forName()
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);

            //2. 使用当前线程来获取
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            System.out.println(contextClassLoader);

            //3. 使ClassLoader.getSystemClassLoader()得到AppClassLoader
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(systemClassLoader);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
