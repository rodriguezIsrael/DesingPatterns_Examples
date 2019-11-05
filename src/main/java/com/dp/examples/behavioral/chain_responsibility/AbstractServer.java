package com.dp.examples.behavioral.chain_responsibility;

/**
 * Clase abstracta que tiene la funcionalidad basica para conectarse a un
 * servidor
 * 
 * @since 05/11/2019
 * @author isivroes
 *
 */
public abstract class AbstractServer {

	/**
	 * Siguiente servidor en el que se realiza la prueba de conexion
	 */
	private AbstractServer nextServer;

	/**
	 * Realizando conexion en caso de que el servidor tenga capacidad
	 */
	abstract protected void doConnection();

	/**
	 * Obtener capacidad del servidor
	 * 
	 * @return int - Capacidad del servidor
	 */
	abstract protected int getServerCapacity();

	/**
	 * Obtener la cantidad de gente conectada
	 * 
	 * @return int - Numero de usuarios conectados
	 */
	abstract protected int getUsersConnected();

	/**
	 * Retorna el nombre del servidor
	 * 
	 * @return String - Nombre del servidor
	 */
	abstract protected String getServerName();

	/**
	 * Verificar la disponibilidad de conexion
	 */
	public void checkAvailability() {

		System.out.println("Analizando la disponibilidad del servidor " + nextServer.getServerName());

		if (nextServer == null) {
			System.out.println("Todos los servidores estan ocupados, Intenta mas tarde.");
		} else {
			int peopleConected = nextServer.getUsersConnected();
			int serverCapacity = nextServer.getServerCapacity();
			System.out.println("Gente conectada: " + peopleConected);
			System.out.println("Capacidad del servidor: " + serverCapacity);

			if (peopleConected < serverCapacity) {
				System.out.println("Servidor disponible, realizando conexión.");
				doConnection();
			} else {
				System.out.println("Buscando otra conexión.");
				nextServer.checkAvailability();
			}
		}

	}

	/**
	 * Seteando el siguiente servidor a ser analizado
	 * 
	 * @param nextServer - Servidor que es asignado para analizarse
	 */
	public void setNextServer(AbstractServer nextServer) {

		this.nextServer = nextServer;
	}
}
