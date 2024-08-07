package edu.fabricio.contabanco.app;

public class App{
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		
		minhaConta.criarConta();
		minhaConta.exibirConta();
	}
}