package br.com.locadora.model;

import java.time.LocalDate;

public class Pagamento {

    private String nomeProp;
    private String numCartao;
    private String cvc;
    private LocalDate dataValidade;

    public Pagamento() {}

    public Pagamento(String nomeProp, String numCartao, String cvc, LocalDate dataValidade) {
        this.nomeProp = nomeProp;
        this.numCartao = numCartao;
        this.cvc = cvc;
        this.dataValidade = dataValidade;
    }


    public String getNomeProp() {
        return nomeProp;
    }

    public void setNomeProp(String nomeProp) {
        this.nomeProp = nomeProp;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}
