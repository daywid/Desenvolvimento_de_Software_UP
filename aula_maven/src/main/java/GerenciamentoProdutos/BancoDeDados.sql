create database GerenciamentoProdutos;

CREATE TABLE Produto (
    codigo INT PRIMARY KEY,
    nome VARCHAR(255),
    preco DOUBLE,
    quantidadeEstoque INT
);

CREATE TABLE Estoque (
    id INT AUTO_INCREMENT PRIMARY KEY,
    produto_codigo INT,
    FOREIGN KEY (produto_codigo) REFERENCES Produto(codigo)
);

CREATE TABLE Venda (
    id INT AUTO_INCREMENT PRIMARY KEY,
    valorTotal DOUBLE
);

CREATE TABLE ProdutoVenda (
    venda_id INT,
    produto_codigo INT,
    PRIMARY KEY (venda_id, produto_codigo),
    FOREIGN KEY (venda_id) REFERENCES Venda(id),
    FOREIGN KEY (produto_codigo) REFERENCES Produto(codigo)
);
