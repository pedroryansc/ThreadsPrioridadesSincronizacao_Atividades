package atividade05;

public class LigarCaldeira extends Thread {
	private Caldeira caldeira;
	
	public LigarCaldeira(Caldeira caldeira) {
		this.caldeira = caldeira;
	}
	
	public void run() {
		setPriority(Thread.MIN_PRIORITY);
		
		while(true) {
			if(!caldeira.isLigada())
				caldeira.ligar();
			
			try {
				Thread.sleep(3000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
