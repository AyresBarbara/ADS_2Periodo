package atividadePOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import atividadePOO.Candidato;

public class PainelCandidato {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		List<Candidato> listCandidatos = new ArrayList<>();
		String nomeCandidato;
		int numCandidato=0, numVotos = 0;
		Candidato candidato;
		
		//Cadastrar o candidato e o número
		System.out.println("Cadastramento dos candidatos, siga as instruções a abaixo: ");
		
		for (int i =1; i <= 2; i++) {
		System.out.println("Nome do Candidato: ");
		nomeCandidato = leia.next();
		System.out.println("Número do Candidato: ");
		numCandidato = leia.nextInt();
		
		System.out.println("-----------------------------");
		
		boolean verificador = false;
		for (Candidato c : listCandidatos) {
			if(c.getNumCandidato() == numCandidato) {
				verificador =true;
			}
		}
		if(verificador) {
			System.out.println("Número eleitoral já cadastrado!");
			i--;
			continue;
		}
		leia.nextLine();
		
		listCandidatos.add(new Candidato(nomeCandidato, numCandidato));
		}
		System.out.println("Quantas vezes deseja vota: ");
		numVotos = leia.nextInt();
		
		// Sistema de votos
		for(int i =0; i < numVotos; i ++) {
			System.out.println("Insira o número do candidato: ");
			int voto = leia.nextInt();
			boolean encontrou = false;
			
		for (Candidato c : listCandidatos) {
			if(c.getNumCandidato() == voto) {
				c.incrementarNumVotos();
				encontrou = true;
			}
		}
		if(!encontrou) {
			System.out.println("O número inserido - "+ voto + " - é inválido.");
			numVotos++;
		}
		}
	
		//Exibir
		System.out.println("Lista dos candidatos: ");
		for(Candidato e : listCandidatos) {
			e.exibirCandidatos();
		}
		

	}

}
