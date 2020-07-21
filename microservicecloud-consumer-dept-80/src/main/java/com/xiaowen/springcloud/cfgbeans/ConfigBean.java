package com.xiaowen.springcloud.cfgbeans;

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
  public RestTemplate getRestTemplate()
  {
    return new RestTemplate();
  }

}
