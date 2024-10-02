package atividade;

import java.util.Scanner;

public class PainelCandidato {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nomeCandidato;
		int numCandidato;
		int numVotos = 0;
		Candidato candidato;
		
		//Criar o candidato e o número
		System.out.println("Nome do Candidato: ");
		nomeCandidato = leia.next();
		System.out.println("Número do Candidato: ");
		numCandidato = leia.nextInt();

		//Chamar o meu objeto
		candidato = new Candidato(nomeCandidato, numCandidato);;
		
		//Exibir os votos
		System.out.println("Número de votos iniciais: "+ candidato.getNumVotos());
		System.out.println();
		
		//Incrementei +1
		candidato.incrementarNumVotos();
		
		//Exibir
		System.out.println("Nome do candidato: "+ candidato.getNomeCandidato());
		System.out.println("Número do Candidato: "+ candidato.getNumCandidato());
		System.out.println("Número total de votos: "+ candidato.getNumVotos());
		
	}

	

}
