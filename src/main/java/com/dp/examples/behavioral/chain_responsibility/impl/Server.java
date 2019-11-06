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
	 * Constructor que recibe la información del DTO.
	 * 
	 * @param serverInfo   - Información sobre el servidor
	 * @param availability - Disponibilidad del servidor
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
	 * Metodo sobre escrito para realizar la conexión.
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
		return random.nextInt(this.serverInfo.getCapacity() + 1);

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
