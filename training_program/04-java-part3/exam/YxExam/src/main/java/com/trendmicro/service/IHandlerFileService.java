package com.trendmicro.service;

import java.io.IOException;
import java.sql.SQLException;

public interface IHandlerFileService {

    void handlerMultiFile() throws IOException, SQLException;
    void handlerFile(int thread,String filepath) throws IOException, SQLException;
}
