CREATE DATABASE seguranca_manha;

USE seguranca_manha;

CREATE TABLE usuario (
	nome VARCHAR(500),
	cpf VARCHAR(15) primary KEY,
	telefone VARCHAR (15)
);

CREATE TABLE nivel (
	id INT auto_increment primary KEY,
	descricao VARCHAR(100)
);

CREATE TABLE login (
	id INT auto_increment primary KEY,
	cpf VARCHAR(15),
	login VARCHAR (15),
	senha VARCHAR (100),
	nivel INT,
	CONSTRAINT fk_usuario FOREIGN KEY (cpf) REFERENCES usuario (cpf),
	CONSTRAINT fk_nivel FOREIGN KEY (nivel) REFERENCES nivel (id)
);

INSERT INTO usuario (nome, cpf, telefone)
VALUES 
('Administrador', '12345678900', '83912345678');

INSERT INTO nivel (descricao)
VALUES
('Administrador'),
('Gerente'),
('Usuário');

INSERT INTO login (cpf, login, senha, nivel)
VALUES
('12345678900', 'admin', 'admin', 1);