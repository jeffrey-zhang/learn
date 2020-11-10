### 创建数据表 ssm
create database ssm;

### 创建数据表loginfo
CREATE TABLE IF NOT EXISTS `loginfo`( `id` INT UNSIGNED AUTO_INCREMENT, `username` VARCHAR(100) NOT NULL, `password` VARCHAR(40) NOT NULL, PRIMARY KEY ( `id` ) )ENGINE=InnoDB DEFAULT CHARSET=utf8;
### 插入数据
INSERT INTO `loginfo` (`username` , `password` ) VALUES ( "admin", "123456");
INSERT INTO `loginfo` (`username` , `password` ) VALUES ( "joyee", "111111");
INSERT INTO `loginfo` (`username` , `password` ) VALUES ( "naomi", "000000");

### 创建数据表 userinfo
CREATE TABLE IF NOT EXISTS `userinfo`( `id` INT UNSIGNED AUTO_INCREMENT, `accountname` VARCHAR(100) NOT NULL, `sex` VARCHAR(40) NOT NULL, `score` INT(40) NOT NULL, PRIMARY KEY ( `id` ) )ENGINE=InnoDB DEFAULT CHARSET=utf8;
#### 插入数据
INSERT INTO `userinfo` (`accountname` , `sex`, `score` ) VALUES ( "admin", "male", 98 );
INSERT INTO `userinfo` (`accountname` , `sex`, `score` ) VALUES ( "joyee", "female", 88 );
INSERT INTO `userinfo` (`accountname` , `sex`, `score` ) VALUES ( "naomi", "female", 74 );
INSERT INTO `userinfo` (`accountname` , `sex`, `score` ) VALUES ( "feifei", "female", 83 );
INSERT INTO `userinfo` (`accountname` , `sex`, `score` ) VALUES ( "xiaobai", "male", 30 );
INSERT INTO `userinfo` (`accountname` , `sex`, `score` ) VALUES ( "lili", "female", 80 );
INSERT INTO `userinfo` (`accountname` , `sex`, `score` ) VALUES ( "xiaoming", "male", 90 );


### 创建数据表 reportsum
CREATE TABLE IF NOT EXISTS `reportsum`( `id` INT UNSIGNED AUTO_INCREMENT, `projectname` VARCHAR(400) NOT NULL, `testcasenum` INT(40) NOT NULL, `reportnum` INT(40) NOT NULL, `createdate` VARCHAR(500) NOT NULL, PRIMARY KEY ( `id` ) )ENGINE=InnoDB DEFAULT CHARSET=utf8;
#### 插入数据
INSERT INTO `reportsum` (`projectname` , `testcasenum`, `reportnum`, `createdate` ) VALUES ( "Test1", 18, 10, "2020/10/10" );
INSERT INTO `reportsum` (`projectname` , `testcasenum`, `reportnum`, `createdate` ) VALUES ( "Test2", 1, 0, "2019/09/10" );
INSERT INTO `reportsum` (`projectname` , `testcasenum`, `reportnum`, `createdate` ) VALUES ( "Test3", 30, 5, "2019/04/10" );
INSERT INTO `reportsum` (`projectname` , `testcasenum`, `reportnum`, `createdate` ) VALUES ( "Test4", 50, 7, "2020/04/10" );
INSERT INTO `reportsum` (`projectname` , `testcasenum`, `reportnum`, `createdate` ) VALUES ( "Test5", 20, 2, "2019/10/21" );


### 创建数据表 reportdetail
CREATE TABLE IF NOT EXISTS `reportdetail`( `id` INT UNSIGNED AUTO_INCREMENT, `projectname` VARCHAR(400) NOT NULL, `owner` VARCHAR(40) NOT NULL, `reportnum` INT(40) NOT NULL, `createdate` VARCHAR(500) NOT NULL, PRIMARY KEY ( `id` ) )ENGINE=InnoDB DEFAULT CHARSET=utf8;
#### 插入数据
INSERT INTO `reportdetail` (`projectname` , `owner`, `reportnum`, `createdate` ) VALUES ( "Test1", "joyee", 10, "2020/10/10" );
INSERT INTO `reportdetail` (`projectname` , `owner`, `reportnum`, `createdate` ) VALUES ( "Test2", "lili", 0, "2019/09/10" );
INSERT INTO `reportdetail` (`projectname` , `owner`, `reportnum`, `createdate` ) VALUES ( "Test3", "xiaobai", 5, "2019/04/10" );
INSERT INTO `reportdetail` (`projectname` , `owner`, `reportnum`, `createdate` ) VALUES ( "Test4", "xiaoming", 7, "2020/04/10" );
INSERT INTO `reportdetail` (`projectname` , `owner`, `reportnum`, `createdate` ) VALUES ( "Test5", "naomi", 2, "2019/10/21" );


### 运行link
http://localhost:8080/html/login.html