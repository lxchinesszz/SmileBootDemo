package org.smileframework;

import org.smileframework.ioc.bean.annotation.InsertBean;
import org.smileframework.ioc.bean.annotation.SmileComponent;
import org.smileframework.tool.proxy.SmileProxyAspect;
import org.smileframework.web.annotation.*;

import java.util.Map;

/**
 * @Package: org.smileframework
 * @Description: 演示控制器
 * @author: liuxin
 * @date: 2017/12/6 下午12:36
 */
@SmileComponent
@RestController
@SmileProxyAspect(proxyAspect = ControllerProxyAspectDemo.class, methods = {"testRequestBody", "testRequestParam"})
public class RestControllerDemo {
    public volatile Long i=0L;
    @InsertBean
    SmileServiceDemo smileServiceDemo;

    @GetMapping(value = "smile/test/ioc")
    public String testIoc(String danceName) {
        System.out.println(Thread.currentThread().getName()+"write:"+(i++));
        return smileServiceDemo.dance(danceName);
    }

    @GetMapping(value = "smile/test/ioc2",produces = "text/plain")
    public String testIoc() {
        return smileServiceDemo.say();
    }


    /**
     * 测试将POST请求体中数据,反序列化为User
     *
     * @param user
     * @ret
     */
    @PostMapping(value = "/smile/test/requestBody", consumes = "application/json", produces = "text/plain")
    public String testRequestBody(@RequestBoby UserDto user) {
        return user.getName() + "--" + user.getAge();
    }

    /**
     * 测试将id,映射为orderId
     *
     * @param orderId
     * @param userId
     * @return
     */
    @GetMapping(value = "/smile/test/requestParam", produces = "text/plain")
    public String testRequestParam(@RequestParam(value = "id") String orderId, Integer userId) {
        return orderId + "---" + userId;
    }

    /**
     * 会根据produces 输出格式
     * get请求不校验consumes: consumes是指定的解析方式,但是只对POST PUT ...方式起作用,不包括GET
     * produces: 输出的格式
     *
     * @param orderId
     * @param userId
     * @return
     */
    @GetMapping(value = "/smile/get", produces = "text/plain")
    public String get(String orderId, String userId) {

        return orderId + "---" + userId;
    }


    /**
     * 测试@RequestHeader注解
     *
     * @param orderId
     * @param userId
     * @param header
     * @return
     */
    @GetMapping(value = "/smile/header", produces = "text/plain")
    public String header(String orderId, String userId, @RequestHeader Map<String, String> header) {
        header.entrySet().stream().forEach(entry -> {
            System.out.println("请求头:" + entry.getKey() + "=" + entry.getValue());
        });
        return orderId + "---" + userId;
    }

    /**
     * 测试使用post请求
     *
     * @param userId
     * @return
     */
    @PostMapping(value = "/smile/post", produces = "application/json")
    public String post(String userId) {
        return userId;
    }

}
