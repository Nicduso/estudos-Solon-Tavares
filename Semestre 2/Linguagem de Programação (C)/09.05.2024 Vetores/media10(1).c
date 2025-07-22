/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int var[10];
    int i, soma;
    int condition = 0;
    float media;
     
    for (i=0; i<10; i++){
        printf ("Adicione um valor inteiro para a variável %d: ",i);
        scanf ("%d",&var[i]);
        soma = soma + var[i];
    }
    
    media = soma / 10;
    printf("\n");
    
    for (i=0; i<10; i++){
        printf ("As variáveis são [%d]: ",i);
        printf ("%d\n",var[i]);
    }
    
    printf("\n");
    printf("A soma dos valores é %d.\n",soma);
    printf("A média destes valores é %f.\n",media);
    
    for (i=0; i<10; i++){
        
        if (var[i] == media){
            printf ("A variável [%d] é igual à média.\n",i);
            condition = condition + 1;
        }
        
    } 
    
    if (condition == 0) {
        printf ("Não há variáveis igual à média.");
    }
    
    return 0;
}