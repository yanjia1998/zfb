package com.qf.dao;

import com.qf.pojo.Express;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpressRepsitory extends JpaRepository<Express,Integer> {
    Express findByExpressid(String expressid);

    List<Express> findByType(String type);
}
