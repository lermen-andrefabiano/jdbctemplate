package br.com.devmedia.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.devmedia.jdbc.conn.JDBCConnection;
import br.com.devmedia.jdbc.entity.Pessoa;

public class PessoaDAO {

	public int save(Pessoa p) {
		Connection conn = JDBCConnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null; 

		StringBuilder sql = new StringBuilder("insert into acesso.pessoas ");
		sql.append("(nome, nascimento, profissao) ");
		sql.append("values(?, ?, ?)");

		try {
			ps = conn.prepareStatement(sql.toString(), ps.RETURN_GENERATED_KEYS);
			ps.setString(1, p.getNome());
			ps.setDate(2, new java.sql.Date(p.getNascimento().getTime()));
			ps.setString(3, p.getProfissao());
			ps.execute();
			
			rs = ps.getGeneratedKeys();
			
			while(rs.next()){
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCConnection.close(conn, ps, rs);
		}
		
		return 0;

	}

}
