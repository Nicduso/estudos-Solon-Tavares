package bank;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaBancaria {
	
	static Double saldo, transacao = 0.0;
	static int conta;
	static String titular;
	
	public static void deposito() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print ("Digite o valor para depósito: ");
		transacao = scan.nextDouble;
		saldo = saldo + transacao;
		
		System.out.println ("Seu saldo atual é de: "+saldo);
		menu ();
	}
	
	public static void saque() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print ("Digite o valor para saque: ");
		transacao = scan.nextDouble;
		saldo = saldo - transacao;
		
		System.out.println ("Seu saldo atual é de: "+saldo);
		menu ();
	}
	
	public static void menu() {
		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
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
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("0.00");
		
		System.out.println ("CONTA BANCÁRIA");
		System.out.print ("Infome o nome do titular da conta: ");
		titular = scan.next();
		System.out.print ("Informe o número da conta: ");
		conta = scan.nextInt();
		
		menu();
		
	}

}
