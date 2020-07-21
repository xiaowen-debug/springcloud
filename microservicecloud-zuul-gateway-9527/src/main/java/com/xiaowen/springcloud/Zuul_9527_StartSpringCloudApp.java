package com.xiaowen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author wen.he
 * @Date 2020/7/21 22:44
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartSpringCloudApp {

  public static void main(String[] args) {

    SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
  }
}
