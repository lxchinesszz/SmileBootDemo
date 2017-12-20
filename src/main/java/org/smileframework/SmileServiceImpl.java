package org.smileframework;

import org.smileframework.ioc.bean.annotation.SmileService;

/**
 * @Package: org.smileframework
 * @Description:
 * @author: liuxin
 * @date: 2017/12/14 下午3:42
 */
@SmileService
public class SmileServiceImpl implements SmileServiceDemo {
    @Override
    public String say() {
        System.out.println("说一句话");
        return "说一句话";
    }

    @Override
    public String dance(String dance) {
        return "跳一个:"+dance;
    }
}
