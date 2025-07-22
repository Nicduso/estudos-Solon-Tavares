#include "nomedabiblioteca.h" //por estar na mesma pasta, usa aspas, se estiver na mesma pasta, necessário colocar o caminho todo das pastas.
#include <stdio.h> //usa os "jacarés" quando a biblioteca já é padrão da linguagem, como o caso do stdio.

int main() {
	
	int x = 3;
	int y = 2;
	int z = multiplicacao(x,y);
	
	printf("%d",z);
	
	return 0;
}
