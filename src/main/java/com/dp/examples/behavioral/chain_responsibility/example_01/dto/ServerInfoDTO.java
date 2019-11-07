package com.dp.examples.behavioral.chain_responsibility.example_01.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * DTO con informacion sobre el servidor
 * 
 * @since 05/11/2019
 * @author isivroes
 *
 */
@Setter
@Getter
public class ServerInfoDTO {

	/**
	 * Nombre del servidor
	 */
	private String name;

	/**
	 * Puerto del servidor
	 */
	private int port;

	/**
	 * Ip del servidor
	 */
	private String ip;

	/**
	 * Capacidad de usuarios soportados
	 */
	private int capacity;

}
