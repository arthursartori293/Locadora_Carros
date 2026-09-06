package br.com.locadora.model;

import java.time.LocalDate;

public class Reserva {
	
	private int id;
	private String nome_cli;
	private String cpf;
	private String gp_veiculos;
	private String cnh;
	private LocalDate data_ent;
	private LocalDate data_dev;
	private LocalDate data_res;
	private String telefone;
	private String endereco; 
	private String local_ret;
	private String local_dev;
	
	public Reserva() {}

	  public Reserva(int id, 
		String nome_cli, 
		String cpf, 
		String gp_veiculos,
		String cnh,
		LocalDate data_ent,
		LocalDate data_dev,
		LocalDate data_res,
		String telefone,
		String endereco,
		String local_ret,
		String local_dev) {
		  
	    this.nome_cli = nome_cli;
	    this.cpf = cpf;
	    this.gp_veiculos = gp_veiculos;
	    this.cnh = cnh;
	    this.data_ent = data_ent;
	    this.data_dev = data_dev;
	    this.data_res = data_res;
	    this.telefone = telefone;
	    this.endereco = endereco;
	    this.local_ret = local_ret;
	    this.local_dev = local_dev;
	  }


public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome_cli() {
    return nome_cli;
  }

  public void setNome_cli(String nome_cli) {
    this.nome_cli = nome_cli;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  
  public String getGp_veiculos() {
	    return gp_veiculos;
	  }

  public void setGp_veiculos(String gp_veiculos) {
	    this.gp_veiculos = gp_veiculos;
	  }
  
  public String getCnh() {
	    return cnh;
	  }

  public void setCnh(String cnh) {
	    this.cnh = cnh;
	  }
  
  public LocalDate getData_ent() {
	    return data_ent;
	  }

  public void setData_ent(LocalDate data_ent) {
	    this.data_ent = data_ent;
	  }
  
  public LocalDate getData_dev() {
	    return data_dev;
	  }

  public void setData_dev(LocalDate data_dev) {
	    this.data_dev = data_dev;
	  }
  
  public LocalDate getData_res() {
	    return data_res;
	  }

  public void setData_res(LocalDate data_res) {
	    this.data_res = data_res;
	  }
  
  public String getTelefone() {
	    return telefone;
	  }

  public void setTelefone(String telefone) {
	    this.telefone = telefone;
	  }
  
  public String getEndereco() {
	    return endereco;
	  }

  public void setEndereco(String endereco) {
	    this.endereco = endereco;
	  }
  
  public String getLocal_ret() {
	    return local_ret;
	  }

  public void getLocal_ret(String local_ret) {
	    this.local_ret = local_ret;
	  }
  
  public String getLocal_dev() {
	    return local_dev;
	  }

  public void setLocal_dev(String local_dev) {
	    this.local_dev = local_dev;
	  }
}