#include <stdio.h>

int main() {
	
	float n[3][3];
	
	int *ptr[3][3];
	
	int i , j;
	
	for (i=0; i < 3; i++) {
		for (j=0; j< 3; j++) {
			
			ptr[i][j] = &n[i][j];
			
			printf("Endereço da Matriz da linha %d e coluna %d: %d\n",i+1,j+1,ptr[i][j]);
		}
	}
	
	return 0;
}
