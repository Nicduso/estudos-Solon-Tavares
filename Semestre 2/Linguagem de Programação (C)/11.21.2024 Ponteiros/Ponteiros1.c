#include <stdio.h>

int main() {
	int var1, var2;
	int *ptr1, ptr2;
	ptr1 = &var1;
	ptr2 = &var2;
	
	if (ptr1 > ptr2) {
		printf("Endereço maior (1): %d",ptr1);
	} else {
		printf("Endereço maior (2): %d",ptr2);
	}
	
	return 0;
	
}
