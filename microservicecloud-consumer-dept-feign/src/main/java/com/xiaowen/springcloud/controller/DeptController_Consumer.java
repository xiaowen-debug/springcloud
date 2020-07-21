package com.xiaowen.springcloud.controller;

import com.xiaowen.springcloud.entities.Dept;
import com.xiaowen.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author wen.he
 * @Date 2020/7/21 11:14
 */
@RestController
public class DeptController_Consumer {

  @Autowired
  protected DeptClientService deptClientService;

  /**
   * 添加
   * @param dept
   * @return
   */
  @RequestMapping(value="/consumer/dept/add")
  public boolean add(Dept dept) {

    return this.deptClientService.add(dept);
  }

  /**
   * ID单个查询
   * @param id
   * @return
   */
  @RequestMapping(value="/consumer/dept/get/{id}")
  public Dept get(@PathVariable("id") Long id) {

    return this.deptClientService.get(id);
  }

  /**
   * 查询所有
   * @return
   */
  @SuppressWarnings("unchecked")
  @RequestMapping(value="/consumer/dept/list")
  public List<Dept> list() {

    return this.deptClientService.list();
  }

}
