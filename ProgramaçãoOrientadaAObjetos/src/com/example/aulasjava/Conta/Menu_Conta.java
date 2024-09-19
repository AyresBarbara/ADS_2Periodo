package aulasJava;

import java.util.Scanner;

public class Menu_Conta {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opc = 0, n;
		double si;
		Conta cc ;
		
		System.out.println("Digite o número da conta: ");
		n = leia.nextInt();
		System.out.println("Digite o saldo inicial: ");
		si = leia.nextDouble();
		
		cc = new Conta(n, si);
		
		do {
			System.out.println("\n\n\n MENU:");
			System.out.println("1 - Exibir\r\n"
					+"2 - Creditar\r\n"
					+ "3 - Debitar\r\n"
					+"4 - sair \n");
			
			System.out.println("Digite sua opção: ");
			opc = leia.nextInt();
			
			switch(opc) {
				case 1: cc.exibir();
					leia.nextLine();
					System.out.println("<Enter>");
					leia.nextLine();
					break;
				case 2: cc.credite(si);
					break;
				case 3: cc.debite(si);
					break;
			}
		} while (opc != 4);
		System.out.println("Fim do Programa!");

	}

}
