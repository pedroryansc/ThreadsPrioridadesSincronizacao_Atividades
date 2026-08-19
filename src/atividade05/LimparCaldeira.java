package atividade05;

public class LimparCaldeira extends Thread {
	public void run() {
		setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Limpando caldeira");
		
		try {
			sleep(3000);
			
			System.out.println("Caldeira limpa!");
		} catch(InterruptedException e) {
			System.out.println("[!] Houve algo de errado ao limpar a caldeira");
			e.printStackTrace();
		}
	}
}