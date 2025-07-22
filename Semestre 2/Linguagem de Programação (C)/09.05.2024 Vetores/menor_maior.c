/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int var[10];
    int i, menor, maior;
    
     
    for (i=0; i<10; i++){
        printf ("Adicione um valor inteiro para a variável %d: ",i);
        scanf ("%d",&var[i]);
    }
    
    printf("\n");
    
    for (i=0; i<10; i++){
        
        maior = var[0];
        if (var[i] > maior) {
            maior = var[i];
        }
        
        menor = var[0];
        if (var[i] < menor){
            menor = var[i];
        }
        
    }
    
    printf("O maior valor é %d.\n",maior);
    printf("O menor valor é %d.",menor);
    
    return 0;
}