package com.howliked.design.pattern.proxy.jdk;

import com.howliked.design.pattern.proxy.IPerson;
import com.howliked.design.pattern.proxy.ITest;
import com.howliked.design.pattern.proxy.impl.ZhangSanPerson;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 通过反编译工具查看源码
 * ProxyGenerator.generateProxyClass(String className, Class<?>[] interfaces); //className:生成的代理类名, interfaces:要代理的抽象接口，可是多个
 * 1.className 继承了Proxy 并且实现了interfaces,并且重写了所有方法  当前示例: public final class $Proxy0 extends Proxy implements IPerson{....}
 * 2.在静态代码块中使用反射查找到了目标对象的所有方法,而且保存了所有方法的引用，重写的方法用反射调用了目标对象的方法。(JDK自动生成的。)
 *  2.1其中,m0,m1,m2分别为Object的hashCode()、equals()、toString()
 *  2.2具体调用方式为proxy.h.invoke(this, m2, (Object[])null);
 */

/**
 * 在静态代码块中使用反射查找到了目标对象的所有方法:
         static {
             try {
                 m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
                 m2 = Class.forName("java.lang.Object").getMethod("toString");
                 m4 = Class.forName("com.howliked.design.pattern.proxy.ITest").getMethod("test1");
                 m3 = Class.forName("com.howliked.design.pattern.proxy.IPerson").getMethod("request");
                 m0 = Class.forName("java.lang.Object").getMethod("hashCode");
             } catch (NoSuchMethodException var2) {
                throw new NoSuchMethodError(var2.getMessage());
             } catch (ClassNotFoundException var3) {
                throw new NoClassDefFoundError(var3.getMessage());
             }
         }
 */
public class JdkProxySource {
    public static void main(String[] args) throws FileNotFoundException {
        IPerson instance = new JdkProxy().getInstance(new ZhangSanPerson());
        instance.request();


        byte[] $Proxy0s = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IPerson.class, ITest.class});
        FileOutputStream os = new FileOutputStream(JdkProxySource.class.getResource("").getPath() + "/$Proxy0.class");
        try {
            os.write($Proxy0s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
