package org.smileframework;

import org.smileframework.tool.json.JsonUtils;
import org.smileframework.tool.string.StringTools;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @Package: org.smileframework
 * @Description: 模拟requestBody注解
 * @author: liuxin
 * @date: 2017/12/13 下午5:02
 */
public class UserDto {
    public String name;

    public Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public UserDto() {
    }


    public UserDto(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * file.encoding:UTF-8
     * user.home:/Users/liuxin
     * os.name:Mac OS X
     * user.name:liuxin
     * @param args
     */
    public static void main(String[] args)throws Exception {
        System.out.println(System.currentTimeMillis());
        /**
         * 系统环境变量
         */
        Properties properties = System.getProperties();
        properties.stringPropertyNames().stream().forEach(key->{
            System.out.println(key+":"+properties.getProperty(key));
        });
        StringTools.drawLine(true,"*",49);
        /**
         * 用户配置的环境变量
         */
        Map<String, String> getenv = System.getenv();
        getenv.keySet().stream().forEach(envKey->{
            System.out.println(envKey+":"+getenv.get(envKey));
        });


//        System.setSecurityManager(new MySecurityManager());
//        FileInputStream fis = new FileInputStream("test");
//        System.out.println(fis.read());

        System.out.println(NetUtil.getLocalAddress());

        System.out.println();
        JvmTools.jStack().stream().forEach(e->{
            System.out.println(e);
        });


        JvmTools.memoryUsage().stream().forEach(e->{
            System.out.println(e);
        });


        System.out.println(JvmTools.memoryUsed());

    }

    }


