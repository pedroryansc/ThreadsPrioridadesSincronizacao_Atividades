package atividade05;

public class DesligarCaldeira extends Thread {
	private Caldeira caldeira;
	
	public DesligarCaldeira(Caldeira caldeira) {
		this.caldeira = caldeira;
	}
	
	public void run() {
		setPriority(Thread.MAX_PRIORITY);
		
		while(true) {
			if(caldeira.getTemperatura() > 1600) {
				System.out.println("[!] Temperatura crítica (" 
						+ caldeira.getTemperatura() +  " °C). Desligando caldeira...");
				
				caldeira.desligar();
			}
			
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}