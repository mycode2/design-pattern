package com.zc.study.singleton.first;

/**
 * Hello world!
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    /**
     * @return com.zc.study.singleton.Singleton
     * @Author zhouchao
     * @Description 静态工程方法，创建实例
     * @Param []
     * @Version v1.0
     **/
    public static Singleton getInstance() {
        if (instance  == null) {
            instance  = new Singleton();
        }
        return instance ;
    }
    /**
     * @Author zhouchao
     * @Description 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     * @Param []
     * @return java.lang.Object
     * @Version  v1.0
     **/
    public Object readResolve() {
        return instance;
    }
}
