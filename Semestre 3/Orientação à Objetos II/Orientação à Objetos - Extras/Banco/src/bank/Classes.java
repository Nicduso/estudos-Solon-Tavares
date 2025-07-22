package bank;
import java.util.Scanner;

public class Classes {

	private Double saldo;
	private Double transacao;
	private int conta;
	private String titular;
	
	Scanner scan = new Scanner(System.in);
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public Double getTransacao() {
		return transacao;
	}

	public void setTransacao(Double transacao) {
		this.transacao = transacao;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void saque() {
		
		System.out.print ("Digite o valor para saque: ");
		setTransacao(scan.nextDouble());
		setSaldo(getSaldo() - getTransacao());
		
		System.out.println ("Seu saldo atual é de: "+getSaldo());

	}
	
	public void deposito() {
		System.out.print ("Digite o valor para depósito: ");
		setTransacao(scan.nextDouble());
		setSaldo(getSaldo() + getTransacao());
		
		System.out.println ("Seu saldo atual é de: "+getSaldo());
	}
	
	public void menu() {
				
		int menu = 0;
		this.saldo = 0.0;
		
		while (menu == 0) {
			System.out.print ("Digite 1 se deseja realizar um depósito, 2 para sacar ou 3 para sair: ");
			menu = scan.nextInt();
			
			if (menu == 1) {
				deposito();
				menu = 0;
			} else if (menu == 2) {
				saque();
				menu = 0;
			} else if (menu == 3) {
				System.out.println ("Obrigado. Volte sempre!");
			} else {
				System.out.println ("Por favor, selecione uma opção válida.");
				menu = 0;
			}
		}
	}
	
}
