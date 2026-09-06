package br.com.locadora.dao;

import br.com.locadora.model.Pagamento;
import br.com.locadora.util.Conexao;
import java.sql.*;
import java.util.*;

public class PagamentoDAO {
    Connection c = null;
    PreparedStatement p = null;
    
  public void pagar(Pagamento pagamento) throws SQLException {

    try {
      c = Conexao.abrir();
      p = c.prepareStatement(
        "INSERT INTO pagamento " +
        "(nome_prop, num_cartao, cvc, data_validade) " +
        "VALUES (?, ?, ?, ?)"
      );

      p.setString(1, pagamento.getNomeProp());
      p.setString(2, pagamento.getNumCartao());
      p.setString(3, pagamento.getCvc());
      p.setDate(4, java.sql.Date.valueOf(pagamento.getDataValidade()));

      p.executeUpdate();

    } finally {
      Conexao.fechar(c, p, null);
    }
  }

  public List<Pagamento> listarTodos() throws SQLException {
    List<Pagamento> lista = new ArrayList<Pagamento>();

    ResultSet r = null;

    try {
      c = Conexao.abrir();
      p = c.prepareStatement("SELECT * FROM pagamento ORDER BY nome_prop");
      r = p.executeQuery();

      while (r.next()) {
        Pagamento pagamento = new Pagamento();

        pagamento.setNomeProp(r.getString("nome_prop"));
        pagamento.setNumCartao(r.getString("num_cartao"));
        pagamento.setCvc(r.getString("cvc"));

        java.sql.Date data = r.getDate("data_validade");

        if (data != null) {
          pagamento.setDataValidade(data.toLocalDate());
        }

        lista.add(pagamento);
      }

      return lista;

    } finally {
      Conexao.fechar(c, p, r);
    }
  }
}