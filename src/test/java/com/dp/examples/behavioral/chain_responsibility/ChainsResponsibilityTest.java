package com.dp.examples.behavioral.chain_responsibility;

import org.junit.jupiter.api.Test;

import com.dp.examples.behavioral.chain_responsibility.dto.ServerInfoDTO;
import com.dp.examples.behavioral.chain_responsibility.impl.Server;

public class ChainsResponsibilityTest {

	@Test
	public void chainResponsibilityTest() {

		// server one
		ServerInfoDTO serverInfo01 = new ServerInfoDTO();

		serverInfo01.setCapacity(1);
		serverInfo01.setIp("127.10.0.1");
		serverInfo01.setName("Servidor Unix");
		serverInfo01.setPort(8081);

		Server server01 = new Server(serverInfo01);

		// server two
		ServerInfoDTO serverInfo02 = new ServerInfoDTO();

		serverInfo02.setCapacity(2);
		serverInfo02.setIp("127.10.0.2");
		serverInfo02.setName("Servidor Windows");
		serverInfo02.setPort(8082);

		Server server02 = new Server(serverInfo02);

		// server three
		ServerInfoDTO serverInfo03 = new ServerInfoDTO();

		serverInfo03.setCapacity(3);
		serverInfo03.setIp("127.10.0.3");
		serverInfo03.setName("Servidor Linux");
		serverInfo03.setPort(8083);

		Server server03 = new Server(serverInfo03);

		ServerInfoDTO serverInfo04 = new ServerInfoDTO();

		serverInfo04.setCapacity(3);
		serverInfo04.setIp("127.10.0.4");
		serverInfo04.setName("Servidor Ubuntu");
		serverInfo04.setPort(8084);

		Server server04 = new Server(serverInfo04);

		AbstractServer abstractServer = new Server();

		/**
		 * chain servers creation
		 */
		server01.setNextServer(server02);
		server02.setNextServer(server03);
		server03.setNextServer(server04);

		abstractServer.setNextServer(server01);

		abstractServer.checkAvailability();

	}

}