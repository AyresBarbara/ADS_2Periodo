package com.example.aulasjava;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, f;
		System.out.println("Digite um número: ");
		n = leia.nextInt();
		System.out.println("O valor de n : "+ n);
		f = 1;
		for(int i=1; i<=n; i++) {
			f = f* i;
		}
		System.out.println("Fatorial de "+ n+" = "+ f);

	}

}
