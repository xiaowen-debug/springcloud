package com.xiaowen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author wen.he
 * @Date 2020/7/21 11:22
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80_App {

  public static void main(String[] args)
  {
    SpringApplication.run(DeptConsumer80_App.class, args);
  }
}
