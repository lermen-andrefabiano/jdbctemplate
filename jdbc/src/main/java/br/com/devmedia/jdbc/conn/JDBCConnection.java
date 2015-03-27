package br.com.devmedia.jdbc.conn;

import java.sql.Connection;

public class JDBCConnection {
	
	private static final String JDBC_URL = "jdbc:postgresql://${jdbc.host}:${jdbc.port}/${jdbc.bd}";
	private static final String JDBC_USER = "postgres";
	private static final String JDBC_PASS = "postgres";
	private static final String JDBC_DRIVER = "org.postgresql.Driver";
	
	public static Connection getConnection(){
		return null;
	}
	

}
