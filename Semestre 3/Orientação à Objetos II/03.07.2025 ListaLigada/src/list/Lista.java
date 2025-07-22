package list;

import java.util.Scanner;
import java.util.LinkedList;

public class Lista {

	public static void main(String[] args) {
		
		int e, op;
		String fruta;
		
		LinkedList<String> list = new LinkedList<String>();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos elemento deseja pôr na lista? ");
		e = scan.nextInt();
		
		System.out.println("\nInsira elementos na lista:");
		
		for (int i = 0; i < e; i++) {
			System.out.print((i + 1)+": ");
			list.add(scan.next());
		}

		System.out.println(list);

		int i = 1;
		while (i == 1) {
		System.out.println("\nEscolha o que deseja fazer:");
		System.out.println("1 - Buscar um nome.");
		System.out.println("2 - Inserir novo item à lista.");
		System.out.println("3 - Remover elemento da lista.");
		System.out.println("4 - Imprimir lista.");
		System.out.println("0 - Encerrar programa.");
		
		System.out.print("Digite o número da opção desejada: ");
		op = scan.nextInt();

			switch (op) {
			case 1:
				System.out.print("Digite o elemento que está buscando: ");
				fruta = scan.next();
				
				int posicao = list.indexOf(fruta);
				
				if (posicao != -1) {
					System.out.println("O item "+fruta+" está na posição: "+posicao);
				} else {
					System.out.println("Item não encontrado.");
				}
				
				break;
			case 2:
				System.out.print("Digite o nome do novo elemento: ");
				list.add(scan.next());
				System.out.println("Novo item adicionado com sucesso!");
				
				break;
			case 3:				
				System.out.print("\nDigite o elemento que deseja remover da lista: ");
				fruta = scan.next();
				
				if (list.remove(fruta)) {
					System.out.println(fruta+" foi removido da lista.");
				} else {
					System.out.println("Elemento não encontrado.");
				}
				
				break;
			case 4:
				for (String frutas : list) {
					System.out.println(frutas);
				}
				
				break;
			case 0:
				System.out.println("Adeus!");
				i = 0;
				
				break;
			default:
				System.out.println("Favor, inserir uma opção válida.");
			}
		}
		
	}

}
