package com.trendmicro;

import com.trendmicro.service.IHandlerFileService;
import com.trendmicro.service.impl.HandlerFileServiceImpl;

import java.io.IOException;
import java.sql.SQLException;

public class HandlerMain {

    public static void main(String[] args) throws IOException, SQLException {

        IHandlerFileService handleFileService= new HandlerFileServiceImpl();
        handleFileService.handlerMultiFile();


    }


}
