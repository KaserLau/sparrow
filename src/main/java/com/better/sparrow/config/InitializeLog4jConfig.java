package com.better.sparrow.config;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;

public class InitializeLog4jConfig {
    //静态代码块，在运行项目的时候会初始化
    static {
        try{
            //初始化log4j
            //getPath,获取的是log4j.properties文件所在的绝对路径或者相对路径。
            String log4jPropertiesPath = "../resources/log4j.properties";
//            String log4jPropertiesPath = "/Users/kaser.lau/IdeaProjects/sparrow/src/main/resources/log4j.properties";
            String log4jPath = InitializeLog4jConfig.class.getClassLoader().getResource("").getPath()+log4jPropertiesPath;
//            System.out.println("Initialize Log4j...");
//            System.out.println("The path is "+ log4jPath);
            PropertyConfigurator.configure(log4jPath);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        SpringApplication.run(InitializeLog4jConfig.class, args);
    }
}
