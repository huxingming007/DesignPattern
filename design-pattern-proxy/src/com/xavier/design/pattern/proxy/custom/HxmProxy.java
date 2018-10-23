package com.xavier.design.pattern.proxy.custom;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author huxingming
 * @date 2018/10/23-下午3:14
 * @Description TODO
 */
public class HxmProxy {


    private final static String ln = "\n\t";


    public static Object newProxyInstance(HxmClassLoader loader,
                                          Class<?>[] interfaces,
                                          MyInvocationHandler h) {


        //1.生成源代码
        String porxySrc = generateSrc(interfaces);
        //2.将生成的源代码输出到磁盘，保存为.java文件
        String filePath = HxmProxy.class.getResource("").getPath();
        File file = new File(filePath + "$Proxy0.java");
        System.out.println(filePath + "$Proxy0.java");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(porxySrc);
            fileWriter.flush();
            fileWriter.close();
            //3.编译源代码，生成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();
            //4.将class文件中的内容，动态加载到JVM中来
            Class proClass = loader.findClass("$Proxy0");
            //5.返回被代理后的对象
            Constructor constructor = proClass.getConstructor(MyInvocationHandler.class);
//            file.delete();
            return constructor.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //将classh
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {


        StringBuffer src = new StringBuffer();
        src.append("package com.xavier.design.pattern.proxy.custom; " + ln);
        src.append("import java.lang.reflect.Method; " + ln);
        src.append("public  class $Proxy0  implements " + interfaces[0].getName() + "{ " + ln);
        //声明变量
        src.append("MyInvocationHandler h; " + ln);
        //写入构造方法
        src.append("public $Proxy0(MyInvocationHandler h)  {");
        src.append("this.h=h;" + ln);
        src.append("}" + ln);
        //迭代方法
        for (Method method : interfaces[0].getMethods()) {
            src.append("public  " + method.getReturnType().getName() + " " + method.getName() + "() {" + ln);
            src.append("try {" + ln);
            src.append("Method m=" + interfaces[0].getName() + ".class.getMethod(\"" + method.getName() + "\",new Class[]{});" + ln);
            src.append("this.h.invoke(this,m,null);" + ln);
            src.append(" } catch (Throwable throwable) {" + ln);
            src.append("  throwable.printStackTrace();" + ln);
            src.append(" }" + ln);
            src.append("}" + ln);
        }

        src.append("}");
        return src.toString();
    }
}
