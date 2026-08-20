package atividade05;

import java.util.Random;

public class AlimentarCaldeira extends Thread {
	private Caldeira caldeira;
	
	public AlimentarCaldeira(Caldeira caldeira) {
		this.caldeira = caldeira;
	}
	
	public void run() {
		setPriority(Thread.MIN_PRIORITY);
		
		Random sorteador = new Random();
		
		while(true) {
			if(caldeira.isLigada()) {
				int aumentoTemp = sorteador.nextInt(300) + 1;
				
				caldeira.alimentar(aumentoTemp);
			}
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}