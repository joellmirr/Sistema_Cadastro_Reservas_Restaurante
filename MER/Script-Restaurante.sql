CREATE TABLE Funcionario (
    idfuncionario INTEGER PRIMARY KEY AUTO_INCREMENT,
    cpf VARCHAR(11) NOT NULL,
    senha VARCHAR(50) NOT NULL,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefone VARCHAR(11) NOT NULL,
    endereco VARCHAR(200) NOT NULL
);

CREATE TABLE Cliente (
    idcliente INTEGER PRIMARY key AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    email VARCHAR(100),
    telefone VARCHAR(9),
    endereco VARCHAR(200)
);

CREATE TABLE Reservas (
    idreserva INTEGER PRIMARY key AUTO_INCREMENT,
    mesa INTEGER NOT NULL,
    datareserva DATE NOT NULL,
    periodo VARCHAR(50) NOT NULL, 
    qtdpessoas INTEGER NOT NULL,
    cliente INTEGER  NOT NULL REFERENCES  Cliente (idcliente)
);

