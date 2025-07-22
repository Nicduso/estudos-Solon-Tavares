package list;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Funcoes {
	
	int[] numOitenta = new int[80];
	int[] numCinquenta = new int[50];
	int[] numVinte = new int[20];
	int menor;
	int op = 1;
	
	Scanner scan = new Scanner(System.in);
	LinkedList<String> list = new LinkedList<String>();
	
	public void menu() {
		
		while (op == 1) {
			System.out.println("ESCOLHA O QUE DESEJA FAZER:");
			System.out.println("Opção 1: Encontrar o menor número em uma lista de 80.");
			System.out.println("Opção 2: Encontrar os números positivos em uma lista de 50.");
			System.out.println("Opção 3: Encontrar os números pares em uma lista de 20.");
			System.out.println("Opção 4: Encerrar programa.");
			System.out.print("Digite o número da opção desejada: ");
			op = scan.nextInt();
		
			switch (op) {
				case 1:
					oitenta();
					op = 1;
				break;
				case 2:
					cinquenta();
					op = 1;
				break;
				case 3:
					vinte();
					op = 1;
				break;
				case 4:
					System.out.println("Adeus!");
				break;
				default:
					System.out.println("Digite uma opção válida!");
					op = 1;
			}
		
		}
		
	}
	
	public void oitenta() {
		
		System.out.println("Informe números inteiros para encontrar o menor:");
		for (int i = 0; i < 80 ; i++) {
			System.out.print((i + 1) + "º Número: ");
			numOitenta[i] = scan.nextInt();
		}
		
		for (int n = 0; n < 80; n++) {
			for (int j = 1; j < 80; j++) {
				if (numOitenta[n] < numOitenta[j]) {
					menor = numOitenta[n];
				}
			}
		}
		
		System.out.println("O menor número digitado foi: "+menor);
	}
	
	public void cinquenta() {
		
		System.out.println("Informe números inteiros para encontrar os positivos:");
		for (int i = 0; i < 50 ; i++) {
			System.out.print((i + 1) + "º Número: ");
			numCinquenta[i] = scan.nextInt();
		}
		
		for (int n = 0; n < 50; n++) {
			if (numCinquenta[n] > 0) {
				list.add(Integer.toString(numCinquenta[n]));
			}
		}
		
		System.out.println("Os números positivos são: "+list);
		
	}
	
	public void vinte() {
		System.out.println("Informe números inteiros para encontrar os pares:");
		for (int i = 0; i < 20 ; i++) {
			System.out.print((i + 1) + "º Número: ");
			numVinte[i] = scan.nextInt();
		}
		
		for (int n = 0; n < 20; n++) {
			if (numVinte[n] % 2 == 0) {
				list.add(Integer.toString(numVinte[n]));
			}
		}
		
		System.out.println("Os números pares são: "+list);
	}

}
