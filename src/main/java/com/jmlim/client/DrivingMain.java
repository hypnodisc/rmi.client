package com.jmlim.client;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jmlim.client.rmi.RmiClient;

public class DrivingMain {

	/**
	 * 메인 메소드
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:app-context.xml");

		RmiClient rmiClient = (RmiClient) context.getBean("rmiClient");
		rmiClient.invokeRmi("임정묵묵");
		rmiClient.invokeRmi("RMI test");
	}
}
