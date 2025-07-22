/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int var[5];
    int i, soma;
    float media;
     
    for (i=0; i<5; i++){
        printf ("Adicione um valor inteiro para a variável %d: ",i+1);
        scanf ("%d",&var[i]);
        soma = soma + var[i];
    }
    
    media = soma / 5;
    printf("\n");
    
    for (i=0; i<3; i++){
        printf ("As variáveis são [%d]: ",i);
        printf ("%d\n",var[i]);
    }
    printf("\n");
    printf("A soma dos valores é %d.\n",soma);
    printf("A média destes valores é %f.",media);
    return 0;
}