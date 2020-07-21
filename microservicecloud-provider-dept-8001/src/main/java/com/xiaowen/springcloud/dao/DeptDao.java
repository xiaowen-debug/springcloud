package com.xiaowen.springcloud.dao;

import com.xiaowen.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * @Author wen.he
 * @Date 2020/7/21 10:36
 */
@Mapper
public interface DeptDao {

  public boolean addDept(Dept dept);

  public Dept findById(Long id);

  public List<Dept> findAll();

}
