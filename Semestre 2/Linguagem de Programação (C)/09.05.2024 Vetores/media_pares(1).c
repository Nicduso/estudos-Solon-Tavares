/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int var[10];
    int i;
    int condition = 0;
     
    for (i=0; i<10; i++){
        printf ("Adicione um valor inteiro para a variável %d: ",i);
        scanf ("%d",&var[i]);
    }
    
    printf("\n");
    
    for (i=0; i<10; i++){
        
        if (var[i] % 2 == 0) {
        printf ("As variável [%d] é par: ",i);
        printf (". Seu valor é %d.\n",var[i]);
        condition = condition + 1;
        }
        
    }
    
    if (condition == 0) {
        printf ("Não há variáveis pares.");
    }
    
    return 0;
}