package atividadePOO;

public class Candidato {
		//Minhas variaveis
		private String nomeCandidato;
		private int numCandidato;
		private int numVotos;
		
		//Construtor da minha Classe
		public Candidato(String nomeCandidato, int numCandidato) {
			super();
			this.nomeCandidato = nomeCandidato;
			this.numCandidato = numCandidato;
			this.numVotos = 0;
		}
		//Metodos de acesso
		public String getNomeCandidato() {
			return nomeCandidato;
		}

		public int getNumCandidato() {
			return numCandidato;
		}

		public int getNumVotos() {
			return numVotos;
		}
		//Meus metodos 
		public void incrementarNumVotos() {
			this.numVotos += 1;
		}
		public void exibirCandidatos() {
			System.out.println("Nome do candidato: "+ getNomeCandidato());
			System.out.println("Número do Candidato: "+ getNumCandidato());
			System.out.println("Número total de votos: "+ getNumVotos());
			System.out.println("----------------------------------------");
		}
		
	}
