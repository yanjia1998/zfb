package com.qf.dao;

import com.qf.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<Order> findByUid(@Param("uid") Integer uid);

    Integer updateAdd(@Param("uid") Integer uid,@Param("gid") Integer gid,@Param("number")Integer number);

    Integer updateDown(Order order);
}
