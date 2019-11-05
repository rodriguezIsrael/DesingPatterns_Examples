package com.dp.examples.behavioral.chain_responsibility.impl;

import java.util.Random;

import com.dp.examples.behavioral.chain_responsibility.AbstractServer;
import com.dp.examples.behavioral.chain_responsibility.dto.ServerInfoDTO;

/**
 * Clase concreta del servidor
 * 
 * @since 05/11/2019
 * @author isivroes
 *
 */
public class Server extends AbstractServer {

	/**
	 * Instancia del dto con información del servidor
	 */
	private ServerInfoDTO serverInfo;

	/**
	 * Constructor that has to recive server info and the availability
	 * 
	 * @param serverInfo   - Info about the server
	 * @param availability - availability of the server
	 */
	public Server(ServerInfoDTO serverInfo) {
		this.serverInfo = serverInfo;
	}

	/**
	 * Constructor default
	 */
	public Server() {

	}

	/**
	 * Method overrided for do connection
	 */
	@Override
	protected void doConnection() {
		System.out.println("Realizando conexión...");

		System.out.println("---------------------------");
		System.out.println("-- name: " + this.serverInfo.getName());
		System.out.println("-- port: " + this.serverInfo.getPort());
		System.out.println("-- ip: " + this.serverInfo.getIp());
		System.out.println("---------------------------");

	}

	/**
	 * Se obtienen los usuarios conectados
	 */
	@Override
	protected int getUsersConnected() {
		Random random = new Random();
		int capacity = random.nextInt(this.serverInfo.getCapacity() + 1);
		return capacity;
	}

	/**
	 * Se retorna la capacidad del servidor
	 */
	@Override
	protected int getServerCapacity() {
		return this.serverInfo.getCapacity();
	}

	/**
	 * Se obtiene el nombre del servidor
	 */
	@Override
	protected String getServerName() {

		return this.serverInfo.getName();
	}

}
