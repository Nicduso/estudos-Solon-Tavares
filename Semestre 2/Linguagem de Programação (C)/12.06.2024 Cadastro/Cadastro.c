#include <stdio.h>
#include <stdlib.h>

typedef struct {
    char modelo[50];
    char marca[50];
    int ano;
    float preco;
} Carro;

void cadastrarCarro() {
    Carro carro;
    char nomeArquivo[60];

    printf("Digite o modelo do carro: ");
    scanf(" %[^\n]", carro.modelo);

    printf("Digite a marca do carro: ");
    scanf(" %[^\n]", carro.marca);

    printf("Digite o ano do carro: ");
    scanf("%d", &carro.ano);

    printf("Digite o preço do carro: ");
    scanf("%f", &carro.preco);

    snprintf(nomeArquivo, sizeof(nomeArquivo), "%s.txt", carro.modelo);

    FILE *arquivo = fopen(nomeArquivo, "w");
    if (arquivo == NULL) {
        printf("Erro ao criar o arquivo!\n");
        return;
    }

    fprintf(arquivo, "Modelo: %s\n", carro.modelo);
    fprintf(arquivo, "Marca: %s\n", carro.marca);
    fprintf(arquivo, "Ano: %d\n", carro.ano);
    fprintf(arquivo, "Preço: %.2f\n", carro.preco);

    fclose(arquivo);
    printf("Carro cadastrado com sucesso! Dados salvos em '%s'.\n\n", nomeArquivo);
}

int main() {
    int opcao;

    do {
        printf("1. Cadastrar carro\n");
        printf("2. Sair\n");
        printf("Escolha uma opção: ");
        scanf("%d", &opcao);

        switch (opcao) {
            case 1:
                cadastrarCarro();
                break;
            case 2:
                printf("Encerrando o programa...\n");
                break;
            default:
                printf("Opção inválida. Tente novamente.\n");
        }
    } while (opcao != 2);

    return 0;
}

