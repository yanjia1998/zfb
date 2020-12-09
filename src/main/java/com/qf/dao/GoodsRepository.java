package com.qf.dao;

import com.qf.pojo.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import java.utils.Date;

public interface GoodsRepository  extends JpaRepository<Goods,Integer> {
}
