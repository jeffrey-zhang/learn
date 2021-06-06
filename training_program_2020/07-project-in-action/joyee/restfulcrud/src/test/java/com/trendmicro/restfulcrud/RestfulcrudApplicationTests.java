package com.trendmicro.restfulcrud;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.trendmicro.restfulcrud.dao.UserDao;
import com.trendmicro.restfulcrud.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Mapper
@SpringBootTest
public class RestfulcrudApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	public void contextLoads() throws SQLException {
		System.out.println(dataSource.getClass());

		Connection connection = dataSource.getConnection();
		System.out.println(connection);
		connection.close();

	}

	@Autowired
	UserDao userDao;

	@Test
	public void getUserById() {
		User user = userDao.getUser("joyee", "123456");
		System.out.println(user.getUsername());
	}

}
