public class ClassLoaderTest {
    public static void main(String[] args) {
        //获取系统类加载器（应用程序类加载器）
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取其上层:扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//sun.misc.Launcher$ExtClassLoader@75b84c92

        //获取其上层：引导类加载器
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);//null

        //获取当前类的类加载器（应用程序类加载器）
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取java核心类库的类加载器(引导类加载器)
        ClassLoader strClassLoader = String.class.getClassLoader();
        System.out.println(strClassLoader);//null
    }
}
