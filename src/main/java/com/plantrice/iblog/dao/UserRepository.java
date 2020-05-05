package com.plantrice.iblog.dao;

import com.plantrice.iblog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User 操作对象  ，Long 主键类型
 * 接着UserRepository的方法就可以直接使用了
 */

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username,String password);
}
