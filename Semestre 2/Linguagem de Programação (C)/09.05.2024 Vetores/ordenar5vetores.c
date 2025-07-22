/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main() {
    int var[5];
    int arm[5];
    int i, j, menor, maior, pos;

    for (i = 0; i < 5; i++) {
        printf("Adicione um valor inteiro para a variável %d: ", i);
        scanf("%d", &var[i]);
    }

    for (i=0; i<5; i++) {
        menor = var[0];
        maior = var[0];
        pos = 0;
        
        for (j=1; j<5; j++) {
            if (var[j] < menor) {
                menor = var[j];
                pos = j;
            }
            
            if (var[i] > maior) {
                maior = var[i];
            }
            
        }

        arm[i] = menor;
        var[pos] = maior + 1;
    }

    printf("\nValores em ordem crescente:\n");
    for (i = 0; i < 5; i++) {
        printf("%d\n", arm[i]);
    }

    return 0;
}