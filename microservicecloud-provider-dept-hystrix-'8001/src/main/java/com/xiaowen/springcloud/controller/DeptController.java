package com.xiaowen.springcloud.controller;

import com.xiaowen.springcloud.entities.Dept;
import com.xiaowen.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author wen.he
 * @Date 2020/7/21 10:44
 */
@RestController
public class DeptController {

  @Autowired
  private DeptService deptService;

  @Autowired
  private DiscoveryClient discoveryClient;

  @RequestMapping(value="/dept/add",method= RequestMethod.POST)
  public boolean add(@RequestBody Dept dept) {

    return deptService.add(dept);
  }

  @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
  public Dept get(@PathVariable("id") Long id) {

    return deptService.get(id);
  }

  @RequestMapping(value="/dept/list",method=RequestMethod.GET)
  public List<Dept> list() {

    return deptService.list();
  }

  /**
   * 服务发现
   * @return
   */
  @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
  public Object discovery() {

    //获取所有注册的微服务
    List<String> list = discoveryClient.getServices();
    System.out.println("**********" + list);

    //获取指定的微服务实列
    List<ServiceInstance> srvList = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
    //详细信息
    for (ServiceInstance element : srvList) {
      System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
          + element.getUri());
    }
    return this.discoveryClient;
  }

}
