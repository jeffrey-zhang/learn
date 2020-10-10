package com.trendmicro.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/***
 * 处理文件接口
 */
public interface IHandlerFileService {

    void handlerMultiFile() throws IOException;

    void handlerFile(Integer thread, String filepath) throws IOException, SQLException;
}
