import sun.misc.Launcher;

import java.net.URL;
import java.security.Provider;

public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("***************引导类加载器**************");
        //获取引导类类加载器Bootstrap能够加载的api路径
        URL[] urls = Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urls) {
            System.out.println(url);
        }
        //从其中的url拿出来一个类 Provide.class
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader);//null，验证成功，因为无法获取到引导类类加载器Bootstrap


        System.out.println("***************扩展类加载器***************");
        String extDirs = System.getProperty("java.ext.dirs");
        System.out.println(extDirs);
        for (String path : extDirs.split(":")) {
            System.out.println(path);
        }
    }


}
