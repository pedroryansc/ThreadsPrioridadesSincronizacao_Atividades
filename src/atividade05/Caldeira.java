package atividade05;

public class Caldeira {
	private boolean ligada;
	private int temperatura;
	
	public Caldeira() {
		this.ligada = false;
		this.temperatura = 0;
	}
	
	public synchronized void ligar() {
		if(!ligada) {
			ligada = true;
			System.out.println("[*] Caldeira ligada!");
		}
	}
	
	public synchronized void desligar() {
		if(ligada) {
			ligada = false;
			temperatura = 0;
			
			System.out.println("[-] Caldeira desligada!");
		}
	}
	
	public synchronized void alimentar(int aumento) {
		if(ligada) {
			temperatura += aumento;
			
			System.out.println("[+] Caldeira alimentada! Temperatura atual: " + temperatura + " °C");
		}
	}
	
	public synchronized void limpar() {
		if(!ligada) {
			System.out.println("[*] Caldeira limpa.");
		}
	}
	
	public boolean isLigada() {
		return ligada;
	}
	
	public int getTemperatura() {
		return temperatura;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
}
