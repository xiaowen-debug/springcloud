package com.xiaowen.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author wen.he
 * @Date 2020/7/21 11:09
 */
@Configuration
public class ConfigBean {

  /**
   * 注入RestTemplate
   * @return
   */
  @Bean
  @LoadBalanced
  public RestTemplate getRestTemplate()
  {
    return new RestTemplate();
  }

  /**
   * 配置负载均衡算法-随机策略
   * 默认为轮询算法
   * @return
   */
  @Bean
  public IRule myRule() {
    //return new RandomRule();

    /**
     * 一定时限内循环重试。默认继承RoundRobinRule，
     * 也支持自定义注入，RetryRule会在每次选取之后，对选举的server进行判断，是否为null，是否alive，
     * 并且在500ms内会不停的选取判断。而RoundRobinRule失效的策略是超过10次，
     * RandomRule是没有失效时间的概念，只要serverList没都挂。
     */
    return new RetryRule();
  }

}
