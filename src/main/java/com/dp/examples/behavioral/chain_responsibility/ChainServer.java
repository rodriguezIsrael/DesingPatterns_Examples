package com.dp.examples.behavioral.chain_responsibility;

import com.dp.examples.behavioral.chain_responsibility.dto.ServerInfoDTO;
import com.dp.examples.behavioral.chain_responsibility.impl.Server;

/**
 * Clase de prueba patron de diseño, Cadena de responsabilidad
 * 
 * @since 05/11/2019
 * @author isivroes
 *
 */
public class ChainServer {

	public AbstractServer doChainServers() {

		/**
		 * Creacion de la informacion del servidor uno
		 */
		ServerInfoDTO serverInfo01 = new ServerInfoDTO();

		serverInfo01.setCapacity(10);
		serverInfo01.setIp("127.10.0.1");
		serverInfo01.setName("Servidor Uno");
		serverInfo01.setPort(8081);

		AbstractServer server01 = new Server(serverInfo01);

		/**
		 * Creacion de la informacion del servidor Dos
		 */
		ServerInfoDTO serverInfo02 = new ServerInfoDTO();

		serverInfo02.setCapacity(5);
		serverInfo02.setIp("127.10.0.2");
		serverInfo02.setName("Servidor Dos");
		serverInfo02.setPort(8082);

		AbstractServer server02 = new Server(serverInfo02);

		/**
		 * Creacion de la informacion del servidor Tres
		 */
		ServerInfoDTO serverInfo03 = new ServerInfoDTO();

		serverInfo03.setCapacity(15);
		serverInfo03.setIp("127.10.0.3");
		serverInfo03.setName("Servidor Tres");
		serverInfo03.setPort(8083);

		AbstractServer server03 = new Server(serverInfo03);

		/**
		 * Se crea cadena de responsabilidades
		 */
		server01.setNextServer(server02);
		server02.setNextServer(server03);

		return server01;
	}

}
