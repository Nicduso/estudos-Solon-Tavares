package bank;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaBancaria {
	
	public static void main(String[] args) {
		
		Classes c = new Classes();
		Scanner scan = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("0.00");
		
		System.out.println ("CONTA BANCÁRIA");
		System.out.print ("Infome o nome do titular da conta: ");
		c.setTitular(scan.next());
		System.out.print ("Informe o número da conta: ");
		c.setConta(scan.nextInt());
		
		c.menu();
	}

}
