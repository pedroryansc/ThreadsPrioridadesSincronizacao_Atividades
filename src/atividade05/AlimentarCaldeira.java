package atividade05;

public class AlimentarCaldeira extends Thread {
	public void run() {
		setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Alimentando caldeira...");
		
		try {
			sleep(3000);
			
			System.out.println("Caldeira alimentada!");
		} catch(InterruptedException e) {
			System.out.println("[!] Houve algo de errado ao alimentar a caldeira");
			e.printStackTrace();
		}
	}
}