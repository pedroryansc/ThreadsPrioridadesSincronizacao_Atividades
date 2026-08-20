package atividade05;

public class Main {
	public static void main(String[] args) {
		Caldeira caldeira = new Caldeira();
		
		LigarCaldeira ligar = new LigarCaldeira(caldeira);
		AlimentarCaldeira alimentar = new AlimentarCaldeira(caldeira);
		LimparCaldeira limpar = new LimparCaldeira(caldeira);
		DesligarCaldeira desligar = new DesligarCaldeira(caldeira);
		
		ligar.start();
		alimentar.start();
		limpar.start();
		desligar.start();
	}
}