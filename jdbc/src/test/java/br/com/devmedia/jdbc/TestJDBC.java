package br.com.devmedia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.devmedia.jdbc.conn.JDBCConnection;
import junit.framework.TestCase;

public class TestJDBC extends TestCase {

	public void testConn() {
		Connection conn = JDBCConnection.getConnection();

		PreparedStatement ps = null;

		try {
			ps = conn.prepareStatement("select * from acesso.pessoas");
			ps.execute();
			System.out.println("conexão ok");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCConnection.close(conn, ps, null);
		}

	}

}
