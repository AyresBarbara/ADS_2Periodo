package com.example.aulasjava;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sabor, qtd_bolas =0;
		
		System.out.println("Digite o sbaor: (1 - chocolate e 2 - morango)");
		sabor = s.nextInt();
		
		System.out.println("Digite quantas bolas");
		qtd_bolas = s.nextInt();
		
		if(sabor == 1) {
			if(qtd_bolas > 3) {
				 System.out.println("Desconto 10%. ");
			}else {
				 System.out.println("Desconto 5%. ");
			}
		}
		else {
			 System.out.println("Sabor sem desconto");
		}

	}

}
