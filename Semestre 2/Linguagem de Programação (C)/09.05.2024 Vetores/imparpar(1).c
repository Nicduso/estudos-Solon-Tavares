/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main() {
    int var[5];
    int par[5];
    int impar[5];
    int i, contp=0, conti=0, somap=0, somai=0;

    for (i = 0; i < 5; i++) {
        printf("Adicione um valor inteiro para a variável %d: ", i);
        scanf("%d", &var[i]);
        
        if (var[i]%2 == 0) {
            par[contp] = var[i];
            contp = contp + 1;
            somap = somap + var[i];
        } else {
            impar[conti] = var[i];
            conti = conti + 1;
            somai = somai + var[i];
        }
        
    }

    printf ("\nValores Pares (%d):\n",contp);
    for (i = 0; i < contp; i++) {
        printf("%d\n", par[i]);
    }
    printf("\nValores Ímpares (%d):\n",conti);
    for (i = 0; i < conti; i++) {
        printf("%d\n", impar[i]);
    }
    
    printf("\nA soma dos números pares é: %d",somap);
    printf("\nA soma dos números ímpares é: %d",somai);
    
    return 0;
}