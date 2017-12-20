package org.smileframework;

/**
 * @Package: org.smileframework
 * @Description: 重写安全管理器
 * @author: liuxin
 * @date: 2017/12/18 上午9:35
 */
public class MySecurityManager extends SecurityManager {
    @Override
    public void checkRead(String file) {
        throw new SecurityException("你没有读的权限");
    }
}
