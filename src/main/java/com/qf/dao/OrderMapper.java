package com.qf.dao;

import com.qf.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<Order> findByUid(@Param("uid") Integer uid);

}
