package com.howliked.design.pattern.proxy.jdk.custom;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;

/**
 * 用来生成源码的工具类 {@link java.lang.reflect.Proxy}
 */
public class CustomProxy {
    public static final String ln = "\r\n";

    public static Object newProxyInstance(String className, CustomClassLoader classLoader, Class<?>[] interfaces, CustomInvocationHandler handler) {
        try {
            //1.动态生成源码.java文件
            String src = generateSrc(interfaces, className);
            //2.Java文件输出
            String filePath = CustomProxy.class.getResource("").getPath();
            File file = new File(filePath+className+".class");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(src);
            fileWriter.flush();
            fileWriter.close();
            //3.把生成的.java文件编译成.class文件
            JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager standardFileManager = javaCompiler.getStandardFileManager(null, null, null);
            Iterable iterable = standardFileManager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = javaCompiler.getTask(null, standardFileManager, null, null, null, iterable);
            task.call();
            standardFileManager.close();
            //4.编译生成的.class文件加载到JVM中
            Class proxyClass = classLoader.findClass(className);
            Constructor constructor = proxyClass.getConstructor(CustomInvocationHandler.class);
            file.delete();
            //5.返回字节码重组以后的新的代理对象
            return constructor.newInstance(handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces, String className) {
        StringBuffer sb = new StringBuffer();
        sb.append(CustomProxy.class.getPackage()).append(";").append(ln);
        sb.append("import java.lang.reflect.*").append(";").append(ln);
        if (interfaces != null && interfaces.length > 0) {
            for (Class<?> i : interfaces) {
                sb.append("import ").append(i.getPackage()).append(";").append(ln);
            }
        }
        sb.append("public final class ").append(className).append(" implements ");
        if (interfaces != null && interfaces.length > 0) {
            sb.append(interfaces[0].getName());
            if (interfaces.length > 1) {
                for (int i = 1; i < interfaces.length; i++) {
                    sb.append(",").append(interfaces[i].getName());
                }
            }
        }
        sb.append(" {").append(ln);
        //生成private CustomInvocationHandler h;
        sb.append("private CustomInvocationHandler h").append(ln);
        sb.append("private Method m0").append(";").append(ln);
        sb.append("private Method m1").append(";").append(ln);
        sb.append("private Method m2").append(";").append(ln);
        //生成组合方法
        if (interfaces != null && interfaces.length > 0) {
            int m = 3;
            for (int i = 0; i < interfaces.length; i++) {
                sb.append("private Method m").append(m++).append(";").append(ln);
            }
        }
        //生成构造函数
        /**
         * public $Proxy0(CustomInvocationHandler h) throws  {
         *    this.h = h;
         * }
         */
        sb.append("public ").append(className).append("(CustomInvocationHandler h){").append(ln);
        sb.append("this.h = h;").append(ln);
        sb.append("}").append(ln);
        //生成所有接口的方法
        if (interfaces != null && interfaces.length > 0) {
            for (Class<?> i : interfaces) {
                sb.append("public final ").append("").append("").append(ln);
            }
        }
        sb.append("").append(ln);
        sb.append("").append(ln);
        sb.append("").append(ln);
        sb.append("").append(ln);
        sb.append("").append(ln);
        sb.append("").append(ln);
        sb.append("}");
        return sb.toString();
    }
}
