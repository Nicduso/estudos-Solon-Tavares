#include "nomedabiblioteca.h" //por estar na mesma pasta, usa aspas, se estiver na mesma pasta, necess�rio colocar o caminho todo das pastas.
#include <stdio.h> //usa os "jacar�s" quando a biblioteca j� � padr�o da linguagem, como o caso do stdio.

int main() {
	
	int x = 3;
	int y = 2;
	int z = multiplicacao(x,y);
	
	printf("%d",z);
	
	return 0;
}
