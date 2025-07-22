package list;

import java.util.Scanner;
import java.util.ArrayList;

public class Funcoes {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Cliente> list = new ArrayList<Cliente>();
	
	public void menu() {
		
		int op = 1;
		
		while (op == 1) {
			System.out.println(" *** ATENDIMENTO MÉDICO *** ");
			
			System.out.println("\n1 para inserir paciente.");
			System.out.println("2 para atender paciente.");
			System.out.println("3 para inserir paciente prioritário.");
			System.out.println("4 para imprimir a lista de pacientes.");
			System.out.println("0 para sair do programa.");
			
			System.out.print("Digite o número da opção desejada: ");
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
		Cliente cli = new Cliente();
		
		System.out.print("Entre com o nome: ");
		cli.setNome(scan.next());
		System.out.print("Entre com o endereço: ");
		cli.setEnd(scan.next());
		System.out.print("Entre com o telefone: ");
		cli.setFone(scan.nextInt());
		cli.setTipo("Normal");
		cli.setStatus("Pendente");
		list.add(cli);
	}
	
	public void atender() {
		if (list.size() == 0) {
			
			System.out.println("\nNão há pacientes na lista.\n");
			
		} else {
			int i = 1, tel;
			String nome, end, tipo;
			
			System.out.println("\nEscolha um paciente para iniciar o atendimento:\n");
			
			for(Cliente c : list) {
				System.out.println(i+" - "+c.getNome()+"\n");
				i++;
			}
			
			System.out.print("Digite o número que corresponde ao paciente: ");
			int p = scan.nextInt();
			
			nome = list.get(p - 1).getNome();
			end = list.get(p - 1).getEnd();
			tel = list.get(p - 1).getFone();
			tipo = list.get(p - 1).getTipo();
			
			Cliente cli = new Cliente();

			cli.setNome(nome);
			cli.setEnd(end);
			cli.setFone(tel);
			cli.setTipo(tipo);
			cli.setStatus("Atendido");
			list.set((p - 1), cli);
		}
	}
	
	public void inserirPrioritario() {
		Cliente cli = new Cliente();
		
		System.out.print("Entre com o nome: ");
		cli.setNome(scan.next());
		System.out.print("Entre com o endereço: ");
		cli.setEnd(scan.next());
		System.out.print("Entre com o telefone: ");
		cli.setFone(scan.nextInt());
		cli.setTipo("Prioritário");
		cli.setStatus("Pendente");
		list.add(cli);
	}
	
	public void imprimir() {
		int i = 1;
		System.out.println("\nLISTA DOS PACIENTES:\n");
		for (Cliente c : list) {
			
			System.out.println(i+"º Paciente: "+c.getNome()+"\n   Endereço: "+c.getEnd()+"\n   Telefone: "+c.getFone()+"\n   Tipo Paciente: "+c.getTipo()+"\n   Status do atendimento: "+c.getStatus()+"\n");
			i++;
		}
	}

	
}
