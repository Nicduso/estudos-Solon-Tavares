#include <stdio.h>
#include <string.h>

struct character{
	char nome[50];
	char arquetipo[50];
	int idade;
};

int main() {
	struct character cyberpunk[100] = {"Helton","Mec�nico",35
										};
										
	printf("Atribui��o inicial:\n");
	printf("Personagem: %s\n",cyberpunk[0].nome);
	printf("Arqu�tipo: %s\n",cyberpunk[0].arquetipo);
	printf("Idade: %d\n",cyberpunk[0].idade);
	
	//Nova atribui��o
	
	strcpy(cyberpunk[0].nome, "F�bio");
	strcpy(cyberpunk[0].arquetipo, "M�dico");
	cyberpunk[0].idade = 46;
	
	printf("\nAltera��o do Cadastro:\n");
	printf("Personagem: %s\n",cyberpunk[0].nome);
	printf("Arqu�tipo: %s\n",cyberpunk[0].arquetipo);
	printf("Idade: %d\n",cyberpunk[0].idade);
	
	
	printf("\nAtribui��o pelo teclado:\n");
	printf("Nome do personagem: ");
	fgets(cyberpunk[1].nome, 50, stdin);
	fflush(stdin);
	printf("Arqu�tipo do personagem: ");
	fgets(cyberpunk[1].arquetipo, 50, stdin);
	fflush(stdin);
	printf("Idade do personagem: ");
	scanf("%d", &cyberpunk[1].idade);
	fflush(stdin);
	
	printf("\nAs informa��es digitadas foram:\n");
	printf("Nome: %s", cyberpunk[1].nome);
	printf("Arqu�tipo: %s", cyberpunk[1].arquetipo);
	printf("Idade: %d", cyberpunk[1].idade);
}
