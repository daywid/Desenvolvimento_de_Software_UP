package atividade_contas_bancarias;
public class Consumidor_contas {
 
public static void main(String[] args) {
 
// Criação das contas
 
Conta cc1 = new Conta(001, "CC", 1000);
 
Conta cp1 = new Conta(002, "CP", 500);
 
// Criação dos clientes
 
Cliente cliente1 = new Cliente("111.111.111-11", "Juliano", "Larissa@teste.com");
 
Cliente cliente2 = new Cliente("222.222.222-22", "Larissa", "Larissa@teste.com");
 
// Adição das contas aos clientes
 
cliente1.adicionarConta(cc1);
 
cliente2.adicionarConta(cp1);
 
// Testes dos métodos das contas
 
cc1.depositar(500);
 
cc1.sacar(200);
 
cc1.consultar();
 
cp1.depositar(1000);
 
cp1.sacar(300);
 
cp1.consultar();
 
// Teste do método de mostrar contas do cliente
 
cliente1.mostrarContas();
 
cliente2.mostrarContas();
 
 
}
 
}
