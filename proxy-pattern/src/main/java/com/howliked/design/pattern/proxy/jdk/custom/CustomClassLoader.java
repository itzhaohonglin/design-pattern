package com.howliked.design.pattern.proxy.jdk.custom;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class CustomClassLoader extends ClassLoader {
    private File classPathFile;

    public CustomClassLoader() {
        String classPath = this.getClass().getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = CustomClassLoader.class.getPackage().getName() + "." + name;
        if (classPathFile != null) {
            File classFile = new File(classPathFile, name.replaceAll("\\.", "/") + ".class");
            if (classFile.exists()) {
                FileInputStream fis = null;
                ByteArrayOutputStream bos = null;
                try {
                    fis = new FileInputStream(classFile);
                    bos = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while ((len = fis.read(buff)) != -1) {
                        bos.write(buff, 0, len);
                    }
                    return defineClass(className, bos.toByteArray(), 0, bos.size());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
