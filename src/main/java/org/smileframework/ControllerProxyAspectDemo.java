package org.smileframework;

import org.smileframework.tool.proxy.DefaultProxyAspect;

/**
 * @Package: org.smileframework
 * @Description: 实现一个代理
 * @author: liuxin
 * @date: 2017/12/14 下午1:49
 */
public class ControllerProxyAspectDemo extends DefaultProxyAspect {
    @Override
    public void before() {
        System.out.println("实现一个前置通知");
    }
}
