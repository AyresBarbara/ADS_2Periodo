package atividade;

import java.util.Scanner;

public class PainelCandidato {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nomeCandidato;
		int numCandidato;
		int numVotos = 0;
		Candidato menu;
		
		System.out.println("Nome do Candidato: ");
		nomeCandidato = leia.next();
		System.out.println("Número do Candidato: ");
		numCandidato = leia.nextInt();
		
		menu = new Candidato(nomeCandidato, numCandidato);
		
	}

}
