package atividade04;

import java.util.concurrent.ThreadLocalRandom;

public class Contador extends Thread {
	private int id;
	private int prioridade;
	
	public Contador(int id, int prioridade) {
		this.id = id;
		this.prioridade = prioridade;
	}
	
	public void run() {
		setPriority(prioridade);
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Contador " + id + " - Contagem: " + i);
			
			int valorSorteio = ThreadLocalRandom.current().nextInt(1, 11);
			
			if(valorSorteio == 5) {
				System.out.println("\nPausa de 3 segundos no Contador " + id + "\n");
				
				try {
					sleep(3000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
