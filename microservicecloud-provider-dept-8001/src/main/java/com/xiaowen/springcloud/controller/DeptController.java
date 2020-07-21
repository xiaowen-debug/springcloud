package com.xiaowen.springcloud.controller;

import com.xiaowen.springcloud.entities.Dept;
import com.xiaowen.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
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

  @RequestMapping(value="/dept/add",method= RequestMethod.POST)
  public boolean add(@RequestBody Dept dept)
  {
    return deptService.add(dept);
  }

  @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
  public Dept get(@PathVariable("id") Long id)
  {
    return deptService.get(id);
  }

  @RequestMapping(value="/dept/list",method=RequestMethod.GET)
  public List<Dept> list()
  {
    return deptService.list();
  }


}
