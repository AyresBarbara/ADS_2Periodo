package com.example.aulasjava;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int num;
		
		System.out.println("Informe um número: ");
		num = n.nextInt();
		
		if(num%2==0) {
			System.out.println(num+ " é par!");
		}
		else {
			System.out.println(num+ " é impar!");
		}

	}


}
