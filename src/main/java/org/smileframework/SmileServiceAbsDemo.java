package org.smileframework;

import java.lang.reflect.Modifier;

/**
 * @Package: org.smileframework
 * @Description: ${todo}
 * @author: liuxin
 * @date: 2017/12/14 下午4:46
 */
public abstract class SmileServiceAbsDemo {
   abstract String say();

    public static void main(String[] args) throws Exception{
        Class<SmileServiceAbsDemo> smileServiceAbsDemoClass = SmileServiceAbsDemo.class;
        boolean isAbs = Modifier.isAbstract(smileServiceAbsDemoClass.getModifiers()) ;
        System.out.println(isAbs);
    }
}
