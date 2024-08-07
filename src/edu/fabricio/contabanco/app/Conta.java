package edu.fabricio.contabanco.app;
import java.util.Scanner;

class Conta{
	private String nomeCliente;
	private int numeroDaConta;
	private String agencia;
	private double saldo;
	
	private void setNomeCliente(String nome) {
		this.nomeCliente = nome;
	}
	
	private void setNumero(int numero) {
		this.numeroDaConta = numero;
	}
	
	private void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	void criarConta() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o seu nome:");
		setNomeCliente(scanner.nextLine());
		
		System.out.println("Por favor, digite o número da conta:");
		setNumero(scanner.nextInt());
		
		System.out.println("Por favor, digite o número da agência:");
		setAgencia(scanner.next());
		
		System.out.println("Por favor, digite o saldo da conta:");
		setSaldo(scanner.nextDouble());
		
		scanner.close();
	}
	
	void exibirConta() {
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!"); 
		System.out.println("Agência: "+ agencia + ", \nConta: "+ numeroDaConta + " \nSeu saldo de R$: " + saldo + " já está disponível para saque.");
	}
}