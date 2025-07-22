#include <stdio.h>
#include <string.h>

struct character{
	char nome[50];
	char arquetipo[50];
	int idade;
};

int main() {
	struct character cyberpunk[100] = {"Helton","Mecânico",35
										};
										
	printf("Atribuição inicial:\n");
	printf("Personagem: %s\n",cyberpunk[0].nome);
	printf("Arquétipo: %s\n",cyberpunk[0].arquetipo);
	printf("Idade: %d\n",cyberpunk[0].idade);
	
	//Nova atribuição
	
	strcpy(cyberpunk[0].nome, "Fábio");
	strcpy(cyberpunk[0].arquetipo, "Médico");
	cyberpunk[0].idade = 46;
	
	printf("\nAlteração do Cadastro:\n");
	printf("Personagem: %s\n",cyberpunk[0].nome);
	printf("Arquétipo: %s\n",cyberpunk[0].arquetipo);
	printf("Idade: %d\n",cyberpunk[0].idade);
	
	
	printf("\nAtribuição pelo teclado:\n");
	printf("Nome do personagem: ");
	fgets(cyberpunk[1].nome, 50, stdin);
	fflush(stdin);
	printf("Arquétipo do personagem: ");
	fgets(cyberpunk[1].arquetipo, 50, stdin);
	fflush(stdin);
	printf("Idade do personagem: ");
	scanf("%d", &cyberpunk[1].idade);
	fflush(stdin);
	
	printf("\nAs informações digitadas foram:\n");
	printf("Nome: %s", cyberpunk[1].nome);
	printf("Arquétipo: %s", cyberpunk[1].arquetipo);
	printf("Idade: %d", cyberpunk[1].idade);
}
