package atividade04;

import java.util.concurrent.ThreadLocalRandom;

public class Contador extends Thread {
	private String nome;
	private int prioridade;
	
	public Contador(String nome, int prioridade) {
		this.nome = nome;
		this.prioridade = prioridade;
	}
	
	public void run() {
		setPriority(prioridade);
		
		int tempoPausa = 3;
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Contador " + nome + " - Contagem: " + i);
			
			double valorSorteio = ThreadLocalRandom.current().nextDouble();
			
			if(valorSorteio < 0.1) {
				System.out.println("\nPausa de " + tempoPausa + " segundos no Contador " + nome + "\n");
				try {
					sleep(tempoPausa * 1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
