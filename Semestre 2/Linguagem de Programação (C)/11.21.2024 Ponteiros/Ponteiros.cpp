#include<stdio.h>

int main() {
	int var = 3;
	int *ptr;
	ptr = &var;

	printf("\nValor da Variável:					%d",var);
	printf("\nEndereço da Variável:					%p",&var);
	
	printf("\nEndereço da Variável com ponteiro:			%X",ptr);
	printf("\nEndereço DO ponteiro: 					%x",&ptr);
	
	return 0;
}
