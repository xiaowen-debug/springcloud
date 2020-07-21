package com.xiaowen.springcloud.service;

import com.xiaowen.springcloud.entities.Dept;

import java.util.List;

/**
 * @Author wen.he
 * @Date 2020/7/21 10:40
 */
public interface DeptService {

  public boolean add(Dept dept);

  public Dept get(Long id);

  public List<Dept> list();
}
