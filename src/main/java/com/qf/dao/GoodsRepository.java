package com.qf.dao;

import com.qf.pojo.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsRepository  extends JpaRepository<Goods,Integer> {
    List<Goods> findByType(String type);
}
