package com.xiaowen.springcloud.service.impl;

import com.xiaowen.springcloud.dao.DeptDao;
import com.xiaowen.springcloud.entities.Dept;
import com.xiaowen.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wen.he
 * @Date 2020/7/21 10:41
 */
@Service
public class DeptServiceImpl implements DeptService {

  @Autowired
  protected DeptDao deptDao;

  @Override
  public boolean add(Dept dept)
  {
    return deptDao.addDept(dept);
  }

  @Override
  public Dept get(Long id)
  {
    return deptDao.findById(id);
  }

  @Override
  public List<Dept> list()
  {
    return deptDao.findAll();
  }

}
