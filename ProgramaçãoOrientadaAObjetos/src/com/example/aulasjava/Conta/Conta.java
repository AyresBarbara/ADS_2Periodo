package aulasJava;

public class Conta {
	private int num;
	private double saldo;
	
	public Conta(int n, double si) {
		num = n;
		saldo = si;
	}

	public int getNum() {
		return num;
	}

	public double getSaldo() {
		return saldo;
	}
		
	public void exibir() {
		System.out.println("---===<<< CONTA >>>===---");
		System.out.println("Número : " + num);
		System.out.println("Saldo  : " + getSaldo() );
		System.out.println("---===================---");
	}
	
	public void credite(double valor){
	saldo += valor; // saldo = saldo + valor	
	}


	public void debite(double valor){
	saldo -= valor;
	}
}


