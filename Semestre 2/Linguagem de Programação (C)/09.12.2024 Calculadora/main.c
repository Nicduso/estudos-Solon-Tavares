#include <stdio.h>

float soma(float a, float b){
	return (a + b);
}

float sub(float a, float b){
	return (a - b);
}

float mult(float a, float b){
	return (a * b);
}

float divi(float a, float b){
	return (a / b);
}

int menu () {
	int opc;
	printf("Escolha uma das opções abaixo: \n");
    printf("(1 - Calculadora, 2- Sair do Programa): ");
    scanf("%d",&opc);
    return opc;
}

int main() {
    float x, y, s;
    int op;
    
    while (menu() == 1) {
    
        printf("CALCULADORA! \n");
        printf("Qual o primeiro número? ");
        scanf("%f",&x);
        printf("Qual o segundo número? ");
        scanf("%f",&y);
        printf("Escolha o operador matemático. ");
        printf("1=soma(+), 2=subtração(-), 3=multiplicação(*), 4=divisão(/): ");
        scanf("%d",&op);
    
        switch(op){
            case 1: 
            s = soma (x, y);
            break;
            case 2: 
            s = sub (x, y);
            break;
            case 3: 
            s = mult (x, y);
            break;
            case 4: 
            s = divi (x, y);
            break;
            default:
            printf(" Nenhuma opção válida selecionada.");
        }
        
        printf(" O resultado da sua operação é %f \n",s);
        
    }
    
    printf("Volte sempre!");
    
    return 0;
}
