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
	printf("Escolha uma das op��es abaixo: \n");
    printf("(1 - Calculadora, 2- Sair do Programa): ");
    scanf("%d",&opc);
    return opc;
}

int main() {
    float x, y, s;
    int op;
    
    while (menu() == 1) {
    
        printf("CALCULADORA! \n");
        printf("Qual o primeiro n�mero? ");
        scanf("%f",&x);
        printf("Qual o segundo n�mero? ");
        scanf("%f",&y);
        printf("Escolha o operador matem�tico. ");
        printf("1=soma(+), 2=subtra��o(-), 3=multiplica��o(*), 4=divis�o(/): ");
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
            printf(" Nenhuma op��o v�lida selecionada.");
        }
        
        printf(" O resultado da sua opera��o � %f \n",s);
        
    }
    
    printf("Volte sempre!");
    
    return 0;
}
