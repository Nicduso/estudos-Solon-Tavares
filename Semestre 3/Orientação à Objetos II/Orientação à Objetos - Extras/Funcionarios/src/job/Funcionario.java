package job;

import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Dados dados = new Dados();
		
		dados.cadastro();
		dados.salario();
		
	}

}
