package com.project.dao;

import com.project.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 大哲哥 on 2018/4/25.
 */
@Repository(value = "userDao")
public interface UserEntityMapper {
    List<UserEntity> selectByName(String userName);
}