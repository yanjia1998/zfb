package com.qf.dao;

import com.qf.pojo.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Wang on 2020/12/9 20:50
 */
public interface MessageRepository extends JpaRepository<Message,Integer> {
}
