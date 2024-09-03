package com.example.aulasjava;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Entrada de Dados
		Scanner n = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.print("Informe sua nota 1:");
		nota1 = n.nextDouble();
		System.out.print("Informe sua nota 2:");
		nota2 = n.nextDouble();
		//Processamento
		media = (nota1+nota2)/2;
		//Saída
		System.out.print(media);

	}

}
