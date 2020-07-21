package com.xiaowen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author wen.he
 * @Date 2020/7/21 13:13
 */
@SpringBootApplication
//EurekaServer服务器端启动类,接受其它微服务注册进来
@EnableEurekaServer
public class EurekaServer7002_App {

  public static void main(String[] args) {
    SpringApplication.run(EurekaServer7002_App.class, args);
  }

}
