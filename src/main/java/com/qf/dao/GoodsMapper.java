package com.qf.dao;

import com.qf.pojo.Goods;
import com.qf.pojo.Order;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {
    List<Goods> findByLike(@Param("name") String name);
}
