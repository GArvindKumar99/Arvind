package com.te.collections;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {
private static final Logger LOGGER=Logger.getLogger(LoggerTest.class.getName());

public static void main(String[] args) throws SecurityException, IOException{
	
	ConsoleHandler obj=new ConsoleHandler();
	obj.setLevel(Level.ALL);
	
	LOGGER.addHandler(obj);
	
	LOGGER.setLevel(Level.ALL);
	LOGGER.severe("severe msg");
	LOGGER.warning("warning msg");
	LOGGER.info("info msg");
	
	LOGGER.config("config msg");
	LOGGER.fine("fine msg");
	LOGGER.finer("finer msg");
	
	
	
}
	
	
}
