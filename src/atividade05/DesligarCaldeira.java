package atividade05;

public class DesligarCaldeira extends Thread {
	public void run() {
		setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Caldeira desligada!");
	}
}