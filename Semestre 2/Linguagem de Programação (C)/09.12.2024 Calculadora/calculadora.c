/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
int main() {
    float num1, num2, s;
    int opc, op;


    printf("Escolha uma das opções abaixo: \n");
    printf("1 - Calculadora, 2- Sair do Programa: ");
    scanf("%d",&opc);
    
    while (opc == 1) {
    
        printf("CALCULADORA! ");
        printf("Qual o primeiro número? ");
        scanf("%f",&num1);
        printf("Qual o segundo número? ");
        scanf("%f",&num2);
        printf("Escolha o operador matemático. ");
        printf("1=soma(+), 2=subtração(-), 3=multiplicação(*), 4=divisão(/): ");
        scanf("%d",&op);
    
        switch(op){
            case 1: 
            s = num1 + num2;
            printf(" O resultado da sua operação é %f",s);
            break;
            case 2: 
            s = num1 - num2;
            printf(" O resultado da sua operação é %f",s);
            break;
            case 3: 
            s = num1 * num2;
            printf(" O resultado da sua operação é %f",s);
            break;
            case 4: 
            s = num1 / num2;
            printf(" O resultado da sua operação é %f",s);
            break;
            default:
            printf(" Nenhuma opção válida selecionada.");
        }
    
        printf("Escolha uma das opções abaixo: \n");
        printf("(1 - Calculadora, 2- Sair do Programa): ");
        scanf("%d",&opc);

        
    }
    
    return 0;
}