package com.xiaowen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author wen.he
 * @Date 2020/7/21 10:46
 */
//本服务启动后会自动注册进eureka服务中
@EnableEurekaClient
//服务发现
@EnableDiscoveryClient
@SpringBootApplication
public class DeptProvider8002_App {

  public static void main(String[] args) {

    SpringApplication.run(DeptProvider8002_App.class, args);
  }
}
