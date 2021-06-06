package com.trendmicro.dao;

import com.trendmicro.dto.AvgDTO;
import com.trendmicro.dto.StudentAndScoreDTO;
import com.trendmicro.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    List<User> findAllUser();

    User findUserByNameAndPassword(String username, String password);

    AvgDTO showAvg();

    List<User> selectUserByName(String username);
}
