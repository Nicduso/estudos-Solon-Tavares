/*A tomada de decis�o, obrigatoriamente, deve ser feita dentro de uma fun��o. 
O programa deve funcionar em loop at� o momento que o usu�rio quiser sair. 
O programa deve armazenar os dez �ltimos n�meros inseridos pelo usu�rio em um vetor.
O usu�rio deve poder ver os dez �ltimos n�meros digitados se quiser.*/

#include<stdio.h>

void numeros() {
	
	int num[10];
	int n, i;
	int teste = 0;
	
	
	printf ("\nDigite abaixo 10 n�meros inteiros para testar se � perfeito, defectivo ou excessivo.");
		for (i = 0; i < 10; i++) {
			printf("\n%d� N�mero: ",i+1);
			scanf("%d",&num[i]);
		}	
	
	for (n = 0; n < 10; n++){
		
		for (i = 1; i < num[n]; i++) {
			
			if (num[n] % i == 0){
				teste = teste + i;
			}
			
		}
		
		if (teste == num[n]){
			
			printf("\n - O n�mero %d � Perfeito.",num[n]);
			
		} else {
			
			if (teste > num[n]){
				printf("\n - O n�mero %d � Excessivo.",num[n]);
			} else {
				printf("\n - O n�mero %d � Defectivo.",num[n]);
			}
			
		}
		teste = 0;
	}
	
}

int menu() {
	int op;
	printf("\n\nEscolha uma das op��es abaixo:\n 1 - Testar n�meros \n 2 - Sair do Programa");
	printf("\nDigite o n�mero da op��o escolhida: ");
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
