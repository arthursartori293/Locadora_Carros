package br.com.locadora.dao;

import java.sql.*;

import br.com.locadora.model.Reserva;
import br.com.locadora.util.Conexao;

public class ReservaDAO {
	Connection c = null;
	PreparedStatement p = null;
	    
	public void cadastrar(Reserva reserva) throws SQLException {
		
		try {
		  c = Conexao.abrir();
		  p = c.prepareStatement(
		    "INSERT INTO reserva " +
		    "(nome_cli, cpf, gp_veiculos, cnh, data_ent, data_dev, data_res, telefone, endereco, local_ret, local_dev)" +
		    "VALUES (?,?,?,?,?,?,?,?,?,?,?)"
		  );
		  
		  p.setString(1, reserva.getNome_cli());
		  p.setString(2,  reserva.getCpf());
		  p.setString(3, reserva.getGp_veiculos());
		  p.setString(4, reserva.getCnh());
	      p.setDate(5, java.sql.Date.valueOf(reserva.getData_ent()));
	      p.setDate(6, java.sql.Date.valueOf(reserva.getData_dev()));
	      p.setDate(7, java.sql.Date.valueOf(reserva.getData_res()));
		  p.setString(8, reserva.getTelefone());
		  p.setString(9, reserva.getEndereco());
		  p.setString(10, reserva.getLocal_ret());
		  p.setString(11, reserva.getLocal_dev());
		  
		  p.executeUpdate();
		  
	} finally {
		Conexao.fechar(c, p, null);
	}
  }
	
	public boolean verificar(int id, String cpf) throws SQLException {
	    ResultSet rs = null;

	    try {
	        c = Conexao.abrir();
	        p = c.prepareStatement("SELECT * FROM reserva WHERE id = ? AND cpf = ?");

	        p.setInt(1, id);
	        p.setString(2, cpf);

	        rs = p.executeQuery();

	        return rs.next();

	    } finally {
	        Conexao.fechar(c, p, rs);
	    }
	}
}