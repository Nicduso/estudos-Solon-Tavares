#include<stdio.h>

int main() {
	int var = 3;
	int *ptr;
	ptr = &var;

	printf("\nValor da Vari�vel:					%d",var);
	printf("\nEndere�o da Vari�vel:					%p",&var);
	
	printf("\nEndere�o da Vari�vel com ponteiro:			%X",ptr);
	printf("\nEndere�o DO ponteiro: 					%x",&ptr);
	
	return 0;
}
