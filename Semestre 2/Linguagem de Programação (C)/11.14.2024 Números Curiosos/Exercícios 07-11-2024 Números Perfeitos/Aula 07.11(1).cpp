/*A tomada de decis�o, obrigatoriamente, deve ser feita dentro de uma fun��o. 
O programa deve funcionar em loop at� o momento que o usu�rio quiser sair. 
O programa deve armazenar os dez �ltimos n�meros inseridos pelo usu�rio em um vetor.
O usu�rio deve poder ver os dez �ltimos n�meros digitados se quiser.*/

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
		
		
		printf("O n�mero: %.2f � %c.\n",num[i]);
		
		
	}
	

}

int menu() {
	int op;
	printf("Escolha uma das op��es abaixo:\n 1 - Testar n�meros \n 2 - Sair do Programa\n");
	printf("Digite o n�mero da op��o escolhida: ");
	scanf("%d",&op);
	
	return op;
}

int main() {
		
	while (int m = menu() == 1){
		
		int i;
		float num[10];
		
		if (m == 1) {
			printf ("Digite abaixo 10 n�meros para testar se � perfeito, defectivo ou excessivo.");
			for (i = 0; i < 10; i++) {
				printf("\n%d� N�mero: ",i+1);
				scanf("%f",&num[i]);
				
			}
				numeros(num);
			
		}
		
	}
	 	
	
	return 0;
}
