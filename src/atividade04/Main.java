package atividade04;

public class Main {
	public static void main(String[] args) {
		Contador contadorBaixo = new Contador("Baixo", 1);
		Contador contadorAlto = new Contador("Alto", 10);
		
		System.out.println("Iniciando os contadores...\n");
		
		contadorBaixo.start();
		contadorAlto.start();
		
		Thread.currentThread();
		Thread.yield();
		
		try {
			contadorBaixo.join();
			contadorAlto.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nContagens finalizadas.");
	}
}