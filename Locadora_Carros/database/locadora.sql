CREATE  DATABASE IF NOT EXISTS Locadora_Carros;
USE Locadora_Carros;

CREATE TABLE reserva (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome_cli VARCHAR (100) NOT NULL ,
    cpf  VARCHAR(11) NOT NULL,
    gp_veiculos VARCHAR(2) NOT NULL,
    cnh VARCHAR (9) NOT NULL,
    data_ent DATE NOT NULL,
    data_dev DATE NOT NULL,
    data_res DATE NOT NULL,
    telefone VARCHAR(11) NOT NULL,
    endereco VARCHAR(100) NOT NULL,
    local_ret VARCHAR(100) NOT NULL,
    local_dev VARCHAR(100) NOT NULL
);

CREATE TABLE pagamento (
	nome_prop VARCHAR(100) NOT NULL,
    num_cartao VARCHAR(12) NOT NULL,
    cvc VARCHAR(3) NOT NULL,
    data_validade DATE NOT NULL
);