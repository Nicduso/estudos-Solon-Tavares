package job;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Dados {
	
	private String nome;
	private String cargo;
	private Double carga;
	private Double salarioBruto;
	private Double salarioLiquido;
	private Double horasExtras;
	
	Scanner scan = new Scanner(System.in);
	DecimalFormat form = new DecimalFormat("0.00");
	
	public void cadastro() {
		int op;
		int i = 0;
		horasExtras = 0.0;
		
		System.out.println("CALCULO DO SALARIO LIQUIDO");
		
		System.out.print("Nome do funcionário: ");
		nome = scan.next();
		System.out.print("Cargo do funcionário: ");
		cargo = scan.next();
		System.out.print("Informe sua carga horária semanal em horas: ");
		carga = scan.nextDouble();
		System.out.print("Salário bruto: ");
		salarioBruto = scan.nextDouble();
		
		while (i == 0) {
			System.out.println("Houveram horas extraordinárias este mês?");
			System.out.print("Digite '1' para sim ou '2' para não: ");
			op = scan.nextInt();
			
			if (op == 1) {
				System.out.print("Informe as horas extras: ");
				horasExtras = scan.nextDouble();
				i = 1;
			} else if (op == 2) {
				i = 1;
			} else {
				System.out.println("Informe uma opção válida.");
				i = 0;
			}
		}
	}
		
	public void salario () {
		
		Double fgts = salarioBruto * 0.08;
		horasExtras = (salarioBruto / 4  / carga * 1.5) * horasExtras;
		
		Double inss;
		
		if (salarioBruto < 1517.9) {
			inss = salarioBruto * 0.075;
		} else if (salarioBruto > 1518.0 && salarioBruto < 2793.87){
			inss = salarioBruto * 0.09;
		} else if (salarioBruto > 2793.88 && salarioBruto < 4190.82){
			inss = salarioBruto * 0.12;
		} else if (salarioBruto > 4190.83 && salarioBruto < 8157.40){
			inss = salarioBruto * 0.14;
		} else {
			inss = 908.86;
		}
		
		salarioLiquido = salarioBruto - fgts - inss + horasExtras;
				
		System.out.println ("/n Seu salário líquido é de: R$ "+form.format(salarioLiquido));
		
	}
}
