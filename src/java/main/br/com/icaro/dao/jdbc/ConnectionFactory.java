package br.com.icaro.dao.jdbc;

import java.sql.*;

public class ConnectionFactory {
	
	private static Connection connection;
	
	private ConnectionFactory (Connection connection) {
		
	}
	
	// Abrindo a conexão com o banco de dados
	
	public static Connection getConnection() throws SQLException {
		if(connection == null ) {
			connection = initConnection();
			return connection;
		} else if (connection .isClosed()) {
			connection = initConnection();
			return connection;
		} else {
			return connection;
		}
	}
	
	// Local aonde o banco de dados se encontra, com o login e a senha.
	
	private static Connection initConnection() {
		try {
			return DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/vendas_online_2", "postgres", "123456");
		} catch (SQLException e) {
			throw new RuntimeException(e);		}
	}
}
