package org.smileframework;

import org.smileframework.ioc.bean.annotation.SmileService;

/**
 * @Package: org.smileframework
 * @Description: 接口层
 * @author: liuxin
 * @date: 2017/12/14 下午3:41
 */
@SmileService
public interface SmileServiceDemo {

    String say();

    String dance(String dance);

    public static void main(String[] args) {
        SmileService declaredAnnotation = SmileServiceDemo.class.getDeclaredAnnotation(SmileService.class);
        System.out.println(declaredAnnotation);
        System.out.println(SmileServiceDemo.class);
    }
}
