package br.com.devmedia.jdbc.dao;

import java.util.Calendar;

import br.com.devmedia.jdbc.entity.Pessoa;
import junit.framework.TestCase;

public class TestPessoaDAO extends TestCase{
	
	PessoaDAO dao;
	
	@Override
	protected void setUp() throws Exception {
		dao = new PessoaDAO();
	}
	
	public void save() {
		
		Calendar nascimento = Calendar.getInstance();
		nascimento.set(Calendar.DATE, 21);
		nascimento.set(Calendar.MONTH, Calendar.AUGUST);
		nascimento.set(Calendar.YEAR, 1987);
		
		Pessoa p = new Pessoa("ANDRE", "ANALISTA", nascimento.getTime());
		
		int id = dao.save(p);
		
		System.out.println("id "+id);
		
	}

}
