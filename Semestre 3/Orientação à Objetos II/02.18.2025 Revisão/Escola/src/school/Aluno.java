package school;

import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		
		Admin adm = new Admin();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CONSULTE A SITUAÇÃO DO ALUNO");
		System.out.print("Informe o nome do aluno: ");
		adm.setNome(scan.next());
		System.out.print("Informe a matrícula do aluno: ");
		adm.setMatricula(scan.nextInt());
		System.out.println("Informe as notas do aluno de cada bimestre: ");
		System.out.print("Nota 1: ");
		adm.setN1(scan.nextDouble());
		System.out.print("Nota 2: ");
		adm.setN2(scan.nextDouble());
		System.out.print("Nota 3: ");
		adm.setN3(scan.nextDouble());
		System.out.print("Nota 4: ");
		adm.setN4(scan.nextDouble());
		
		adm.media();
		
	}

}
