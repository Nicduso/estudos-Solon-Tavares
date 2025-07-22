#include <stdio.h>
#include <string.h>

struct character{
	char nome[50];
	char arquetipo[50];
	float altura;
	int idade;
};

int menu(int op){
	printf("Escolha o tipo de personagem que deseja cadastrar:\n");
	printf("1 - Cyberpunk\n");
	printf("2 - Faroeste\n");
	printf("3 - Medieval\n");
	printf("4 - Pós Apocalipse\n");
	printf("5 - Encerrar Programa.\n");
	printf("Digite o número da opção: ");
	scanf("%d",&op);
	
	return op;
}




int main() {
	int op;
	
	struct character cyberpunk[10];
	struct character faroeste[10];
	struct character medieval[10];
	struct character apocalipse[10];
	
	switch(menu(op)){
		case 1:
			
			
		break;
		
		case 2:
			
		break;

		case 3:
			
		break;
		
		case 4:
			
		break;

		default:
			printf("Selecione uma opção válida.");
	}
		
	printf("\nCadastro de Personagem:\n");
	printf("Nome do personagem: ");
	fgets(cyberpunk[0].nome, 50, stdin);
	fflush(stdin);
	printf("Arquétipo do personagem: ");
	fgets(cyberpunk[0].arquetipo, 50, stdin);
	fflush(stdin);
	printf("Altura do personagem: ");
	scanf("%f", &cyberpunk[0].altura);
	fflush(stdin);
	printf("Idade do personagem: ");
	scanf("%d", &cyberpunk[0].idade);
	fflush(stdin);
	
	printf("\nAs informações digitadas foram:\n");
	printf("Nome: %s", cyberpunk[0].nome);
	printf("Arquétipo: %s", cyberpunk[0].arquetipo);
	printf("Altura: %f\n", cyberpunk[0].altura);
	printf("Idade: %d", cyberpunk[0].idade);
	
	return 0;
}
