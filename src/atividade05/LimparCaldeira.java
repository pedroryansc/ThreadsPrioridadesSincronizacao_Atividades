package atividade05;

public class LimparCaldeira extends Thread {
	private Caldeira caldeira;
	
	public LimparCaldeira(Caldeira caldeira) {
		this.caldeira = caldeira;
	}
	
	public void run() {
		setPriority(Thread.MIN_PRIORITY);
		
		while(true) {
			if(!caldeira.isLigada()) {
				caldeira.limpar();
			}
			
			try {
				Thread.sleep(5000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}