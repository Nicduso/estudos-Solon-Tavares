/*A tomada de decisão, obrigatoriamente, deve ser feita dentro de uma função. 
O programa deve funcionar em loop até o momento que o usuário quiser sair. 
O programa deve armazenar os dez últimos números inseridos pelo usuário em um vetor.
O usuário deve poder ver os dez últimos números digitados se quiser.*/

#include<stdio.h>

float numeros(float num[10]) {
	
	int i;
	char tipo;
	
	for (i = 0; i < 10; i++){
		
		do {
			
		} while (x < num[i])
		
		if (num[i] == x){
			tipo = "perfeito."
		}
		
		
		printf("O número: %.2f é %c.\n",num[i]);
		
		
	}
	

}

int menu() {
	int op;
	printf("Escolha uma das opções abaixo:\n 1 - Testar números \n 2 - Sair do Programa\n");
	printf("Digite o número da opção escolhida: ");
	scanf("%d",&op);
	
	return op;
}

int main() {
		
	while (int m = menu() == 1){
		
		int i;
		float num[10];
		
		if (m == 1) {
			printf ("Digite abaixo 10 números para testar se é perfeito, defectivo ou excessivo.");
			for (i = 0; i < 10; i++) {
				printf("\n%dº Número: ",i+1);
				scanf("%f",&num[i]);
				
			}
				numeros(num);
			
		}
		
	}
	 	
	
	return 0;
}
