####
CREATE DATABASE `springboot`;

USE `springboot`;

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(10) DEFAULT NULL COMMENT '姓名',
  `password` varchar(10) DEFAULT NULL COMMENT 'pwd',
  `age` int(2) DEFAULT NULL COMMENT '年龄',
  `score` int(2) DEFAULT NULL COMMENT '成绩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;




####
insert into 
  springboot.t_user (
    id, 
    username, 
    password, 
    age, 
    score
  )
values
  (
    1, 
    'xy_yan', 
    '123456', 
    23, 
    100
  );
  
  insert into 
  springboot.t_user (
    id, 
    username, 
    password, 
    age, 
    score
  )
values
  (
    2, 
    'bobo_ren', 
    '123456', 
    23, 
    95
  );
  
    insert into 
  springboot.t_user (
    id, 
    username, 
    password, 
    age, 
    score
  )
values
  (
    3, 
    'hua_sun', 
    '123456', 
    25, 
    85
  );
  
    insert into 
  springboot.t_user (
    id, 
    username, 
    password, 
    age, 
    score
  )
values
  (
    4, 
    'amanda', 
    '123456', 
    18, 
    95
  );
  
    insert into 
  springboot.t_user (
    id, 
    username, 
    password, 
    age, 
    score
  )
values
  (
    2, 
    'joyee', 
    '123456', 
    18, 
    98
  );
  
  
