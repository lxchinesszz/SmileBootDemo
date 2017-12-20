package org.smileframework;

import org.smileframework.ioc.bean.annotation.SmileBootApplication;
import org.smileframework.ioc.bean.context.BeanDefinition;
import org.smileframework.ioc.bean.context.ExtApplicationContext;
import org.smileframework.ioc.bean.context.SmileApplication;
//import org.smileframework.web.annotation.RestController;
import org.smileframework.ioc.bean.context.ConfigurableApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Package: org.smileframework
 * @Description: smile项目演示
 * @author: liuxin
 * @date: 2017/12/5 下午9:32
 */
@SmileBootApplication
public class SmileApplicationDemo {
    public static void main(String[] args) {
        // get name representing the running Java virtual machine.

        /**
         *
         * 应用默认配置:
         * 1.server.banner=D3Banner
         * 2.server.port=10081
         * 系统调试配置:
         * 1.--server.classLoad=false 系统调试参数
         */
        String[] argss = {"--server.classLoad=false"};
        ConfigurableApplicationContext context = SmileApplication.run(SmileApplicationDemo.class, argss);

//        Map<String, BeanDefinition> beans = context.getBeans();
//        beans.entrySet().stream().forEach(x -> {
//            String s = x.getValue().getClazz().toGenericString();
//            System.out.println("当前已经加载的bean名称:" + s);
//        });
//
//
//        Map<String, ExtApplicationContext> beanByType = context.getBeanByType(ExtApplicationContext.class);
//        beanByType.entrySet().stream().forEach(x -> {
//            String s = x.getValue().getClass().toGenericString();
//            System.out.println(s);
//        });

//        SpringApplication.run()
    }
}
