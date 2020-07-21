package com.xiaowen.springcloud;

import com.xiaowen.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author wen.he
 * @Date 2020/7/21 11:22
 */

/**
 * 在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
 * 这个自定义配置类不能放在@ComponentScan所扫描的当前包下以及子包下，
 * 否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享，也就是说
 * 我们达不到特殊化定制的目的了。
 * @SpringBootApplication注解包含@ComponentScan
 */
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80_App {

  public static void main(String[] args)
  {
    SpringApplication.run(DeptConsumer80_App.class, args);
  }
}
