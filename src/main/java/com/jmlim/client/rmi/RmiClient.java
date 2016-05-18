package com.jmlim.client.rmi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RmiClient {

	@Autowired
	Service rmiServiceClient;

	public void invokeRmi(String name) {
		String result = rmiServiceClient.getMessage(name);

		System.out.println(result);
	}
}
