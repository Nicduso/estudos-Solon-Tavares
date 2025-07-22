package list;

import java.util.Scanner;
import java.util.ArrayList;

public class Funcoes {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Cliente> list = new ArrayList<Cliente>();
	Cliente cli = new Cliente();
	
	public void menu() {
		
		int op = 1;
		
		while (op == 1) {
			System.out.println("\n1 para inserir paciente.");
			System.out.println("2 para atender paciente.");
			System.out.println("3 para inserir paciente prioritário.");
			System.out.println("4 para imprimir a lista de pacientes.");
			System.out.println("0 para sair do programa.");
			
			System.out.print("\nDigite o número da opção desejada: ");
			op = scan.nextInt();
			
			switch (op) {
				case 1:
					inserir();
					op = 1;
				break;
				case 2:
					atender();
					op = 1;
				break;
				case 3:
					inserirPrioritario();
					op = 1;
				break;
				case 4:
					imprimir();
					op = 1;
				break;
				case 0:
					System.out.println("\nAdeus!");
				break;
				default:
					System.out.println("\nDigite uma opção válida.\n");
					op = 1;
			}
		}
		
	}
	
	public void inserir() {
		
		System.out.print("Entre com o nome: ");
		cli.setNome(scan.next());
		System.out.print("Entre com o endereço: ");
		cli.setEnd(scan.next());
		System.out.print("Entre com o telefone: ");
		cli.setFone(scan.nextInt());
		cli.setStatus("Pendente");
		list.add(cli);
	}
	
	public void atender() {
		if (list.size() == 0) {
			
			System.out.println("\nNão há pacientes na lista.");
			
		} else {
			int i = 1, tel;
			String nome, end;
			
			System.out.println("\nEscolha um paciente para iniciar o atendimento:");
			
			for(Cliente c : list) {
				System.out.println(i+" - "+c.getNome()+c.getStatus());
				i++;
			}
			
			System.out.print("Digite o número que corresponde ao paciente: ");
			int p = scan.nextInt();
				
			nome = cli.getNome();
			end = cli.getEnd();
			tel = cli.getFone();

			cli.setNome(nome);
			cli.setEnd(end);
			cli.setFone(tel);
			cli.setStatus("Atendido");
			list.set((p - 1), cli);
		}
	}
	
	public void inserirPrioritario() {
		System.out.println("/nTeste./n");
	}
	
	public void imprimir() {
		System.out.println("/nTeste./n");
	}

	
}
