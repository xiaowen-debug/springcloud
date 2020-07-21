package com.xiaowen.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wen.he
 * @Date 2020/7/21 16:47
 */
@Configuration
public class MySelfRule {

  /*
  @Bean
  public IRule myRule() {
    //Ribbon默认是轮询，我自定义为随机
    return new RandomRule();
  }
  */
  @Bean
  public IRule myRule() {
    //Ribbon默认是轮询，我自定义为随机
    return new RandomRule5();
  }
}