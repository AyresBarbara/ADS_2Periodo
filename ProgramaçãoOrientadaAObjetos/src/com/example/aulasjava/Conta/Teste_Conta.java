package com.example.aulasjava.Conta;

public class Teste_Conta {

	public static void main(String[] args) {

		Conta cc;
		cc = new Conta(123, 500);
		 cc.exibir();
		
		 int a = cc.getNum();
		 System.out.println( a );
		 System.out.println( cc.getSaldo() );
		cc.credite(100);
		cc.exibir();
		cc.debite(300);
		cc.exibir();
		
	}
}
