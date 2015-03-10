package com.marxmart.persistence;

public class Test {
	/**
	 * Main function for demonstrating connecting to Cassandra with host and
	 * port.
	 * 
	 * @param args
	 *            Command-line arguments; first argument, if provided, is the
	 *            host and second argument, if provided, is the port.
	 */
	public static void main(final String[] args) {
		final CassandraConnector client = new CassandraConnector();
		final String ipAddress = "54.165.43.110";
		final int port = 9042;
		System.out.println("Connecting to IP Address " + ipAddress + ":" + port
				+ "...");
		client.connect(ipAddress, port);
		client.close();
	}
}
	