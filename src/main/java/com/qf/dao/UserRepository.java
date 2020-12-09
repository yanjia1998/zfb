package com.qf.dao;

import com.qf.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {


    User findByNameAndPassword(String name ,String password);
}
