package atividade05;

public class LigarCaldeira extends Thread {
	public void run() {
		setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Caldeira ligada!");
	}
}
