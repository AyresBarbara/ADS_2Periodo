package com.example.aulasjava;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int latas, g600, pet, n, f;
		double total;
		System.out.println("Digite o número de latas: ");
		latas = leia.nextInt();
		System.out.println("Digite o número de garrafa de 600ml: ");
		g600 = leia.nextInt();
		System.out.println("Digite o número de garrafa pet: ");
		pet = leia.nextInt();
		
		
				
		System.out.println("Qtd de litros em latas: "+ litros_latas(latas));
		System.out.println("Qtd de litros em g600: "+ litros_g600(g600));
		System.out.println("Qtd de litros em pet: "+ litros_pet(pet));
		
		total = litros_latas(latas)+ litros_g600(g600)+ litros_pet(pet);
		
		System.out.println("Qtd de litros total "+ total);
	}
	public static double litros_latas(int n) {
		double res;
		res = n * 0.350;
		return res;
		
	}
	public static double litros_g600(int n) {
		return (n * 0.600);
		
	}
	public static double litros_pet(int n) {
		return (n*2);
		
	}

}
