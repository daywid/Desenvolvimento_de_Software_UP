-- Cria a tabela "veiculos" no banco de dados "veiculos"
CREATE TABLE veiculos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(255),
    modelo VARCHAR(255),
    ano_fabricacao INT,
    preco DECIMAL(10, 2)
);
