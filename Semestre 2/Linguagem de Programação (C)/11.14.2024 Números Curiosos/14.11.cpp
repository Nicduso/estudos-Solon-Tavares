/*A tomada de decisão, obrigatoriamente, deve ser feita dentro de uma função. 
O programa deve funcionar em loop até o momento que o usuário quiser sair. 
O programa deve armazenar os dez últimos números inseridos pelo usuário em um vetor.
O usuário deve poder ver os dez últimos números digitados se quiser.*/

#include<stdio.h>

void numeros() {
	
	int num[10];
	int n, i;
	int teste = 0;
	
	
	printf ("\nDigite abaixo 10 números inteiros para testar se é perfeito, defectivo ou excessivo.");
		for (i = 0; i < 10; i++) {
			printf("\n%dº Número: ",i+1);
			scanf("%d",&num[i]);
		}	
	
	for (n = 0; n < 10; n++){
		
		for (i = 1; i < num[n]; i++) {
			
			if (num[n] % i == 0){
				teste = teste + i;
			}
			
		}
		
		if (teste == num[n]){
			
			printf("\n - O número %d é Perfeito.",num[n]);
			
		} else {
			
			if (teste > num[n]){
				printf("\n - O número %d é Excessivo.",num[n]);
			} else {
				printf("\n - O número %d é Defectivo.",num[n]);
			}
			
		}
		teste = 0;
	}
	
}

int menu() {
	int op;
	printf("\n\nEscolha uma das opções abaixo:\n 1 - Testar números \n 2 - Sair do Programa");
	printf("\nDigite o número da opção escolhida: ");
	scanf("%d",&op);
	
	return op;
}

int main() {
	
	int m;
	
	while (m = menu() == 1){
		
		if (m == 1) {
			
			numeros();
			
		}
		
	}
	
	return 0;
}
