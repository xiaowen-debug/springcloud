package com.xiaowen.springcloud.service;

import com.xiaowen.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author wen.he
 * @Date 2020/7/21 17:54
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface DeptClientService {

  @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
  public Dept get(@PathVariable("id") long id);

  @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
  public List<Dept> list();

  @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
  public boolean add(Dept dept);

}
