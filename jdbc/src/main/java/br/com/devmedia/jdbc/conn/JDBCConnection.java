package br.com.devmedia.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnection {

//	private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/dbspringtemplate";
//	private static final String JDBC_USER = "postgres";
//	private static final String JDBC_PASS = "postgres";
//	private static final String JDBC_DRIVER = "org.postgresql.Driver";
	
	private static final String JDBC_URL = "jdbc:mysql://localhost/bdspringtemplate";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "root";
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

	public static Connection getConnection() {

		Connection conn = null;

		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		try {
			if (conn != null) {
				conn.close();
			}
			
			if(ps!=null){
				ps.close();
			}
			
			if(rs!=null){
				rs.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
