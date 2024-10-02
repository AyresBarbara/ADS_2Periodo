package atividade;

public class Candidato {
	
	private String nomeCandidato;
	private int numCandidato;
	private int numVotos;
	
	public Candidato(String nomeCandidato, int numCandidato) {
		super();
		this.nomeCandidato = nomeCandidato;
		this.numCandidato = numCandidato;
		this.numVotos = 0;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public int getNumCandidato() {
		return numCandidato;
	}

	public int getNumVotos() {
		return numVotos;
	}

	public void incrementarNumVotos() {
		numVotos += 1;
	}
	public void exibirVotos() {
		System.out.println("O número de votos do candidato "+ getNomeCandidato() +" é: "+ getNumVotos());
	}
}
