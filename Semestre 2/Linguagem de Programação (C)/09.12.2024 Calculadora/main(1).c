#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAX_PALAVRAS 5

int main() {
    int sorteio = 1;
    int op = 1;
    int pontos = 0;
    char palpite[20];

    printf("Vamos começar um jogo de adivinhar!\n");

    while (op == 1 && sorteio <= MAX_PALAVRAS) {
        printf("Abaixo está sua próxima dica:\n");
        switch (sorteio) {
            case 1:
                printf("Abro portas sem mãos: ");
                scanf(" %[^\n]", palpite);
                if (strcmp(palpite, "chave") == 0) {
                    printf("Parabéns! Você acertou!\n");
                    pontos++;
                } else {
                    printf("Ainda não... 2ª dica: Tenho dentes, mas não mordo.\n");
                    scanf(" %[^\n]", palpite);
                    if (strcmp(palpite, "chave") == 0) {
                        printf("Parabéns! Você acertou!\n");
                        pontos++;
                    } else {
                        printf("Ainda não... 3ª e última dica: Sou essencial para o segredo, mas apenas quando estou no lugar certo.\n");
                        scanf(" %[^\n]", palpite);
                        if (strcmp(palpite, "chave") == 0) {
                            printf("Parabéns! Você acertou!\n");
                            pontos++;
                        } else {
                            printf("A palavra era 'chave' :(, não foi desta vez!\n");
                        }
                    }
                }
                break;

            case 2:
                printf("Respondo à sua voz, mas sou apenas uma repetição: ");
                scanf(" %[^\n]", palpite);
                if (strcmp(palpite, "eco") == 0) {
                    printf("Parabéns! Você acertou!\n");
                    pontos++;
                } else {
                    printf("Ainda não... 2ª dica: Só existo em lugares onde o vazio me devolve.\n");
                    scanf(" %[^\n]", palpite);
                    if (strcmp(palpite, "eco") == 0) {
                        printf("Parabéns! Você acertou!\n");
                        pontos++;
                    } else {
                        printf("Ainda não... 3ª e última dica: Embora você me ouça, eu sou apenas uma ilusão do som.\n");
                        scanf(" %[^\n]", palpite);
                        if (strcmp(palpite, "eco") == 0) {
                            printf("Parabéns! Você acertou!\n");
                            pontos++;
                        } else {
                            printf("A palavra era 'eco' :(, não foi desta vez!\n");
                        }
                    }
                }
                break;

            case 3:
                printf("Dispositivo eletrônico que processa dados: ");
                scanf(" %[^\n]", palpite);
                if (strcmp(palpite, "computador") == 0) {
                    printf("Parabéns! Você acertou!\n");
                    pontos++;
                } else {
                    printf("Ainda não... 2ª dica: Pode ser portátil ou de mesa.\n");
                    scanf(" %[^\n]", palpite);
                    if (strcmp(palpite, "computador") == 0) {
                        printf("Parabéns! Você acertou!\n");
                        pontos++;
                    } else {
                        printf("Ainda não... 3ª e última dica: Essencial para programadores e usuários de tecnologia.\n");
                        scanf(" %[^\n]", palpite);
                        if (strcmp(palpite, "computador") == 0) {
                            printf("Parabéns! Você acertou!\n");
                            pontos++;
                        } else {
                            printf("A palavra era 'computador' :(, não foi desta vez!\n");
                        }
                    }
                }
                break;

            case 4:
                printf("Sou invisível, mas posso ser sentido em cada batida do coração: ");
                scanf(" %[^\n]", palpite);
                if (strcmp(palpite, "tempo") == 0) {
                    printf("Parabéns! Você acertou!\n");
                    pontos++;
                } else {
                    printf("Ainda não... 2ª dica: Ninguém me escapa, mesmo que tentem me segurar, eu sempre passo.\n");
                    scanf(" %[^\n]", palpite);
                    if (strcmp(palpite, "tempo") == 0) {
                        printf("Parabéns! Você acertou!\n");
                        pontos++;
                    } else {
                        printf("Ainda não... 3ª e última dica: Posso curar feridas ou destruí-las, e meu rastro é marcado por rugas e memórias.\n");
                        scanf(" %[^\n]", palpite);
                        if (strcmp(palpite, "tempo") == 0) {
                            printf("Parabéns! Você acertou!\n");
                            pontos++;
                        } else {
                            printf("A palavra era 'tempo' :(, não foi desta vez!\n");
                        }
                    }
                }
                break;

            case 5:
                printf("Sou fruto da luz: ");
                scanf(" %[^\n]", palpite);
                if (strcmp(palpite, "sombra") == 0) {
                    printf("Parabéns! Você acertou!\n");
                    pontos++;
                } else {
                    printf("Ainda não... 2ª dica: Nunca tenho forma própria, apenas a que você me der.\n");
                    scanf(" %[^\n]", palpite);
                    if (strcmp(palpite, "sombra") == 0) {
                        printf("Parabéns! Você acertou!\n");
                        pontos++;
                    } else {
                        printf("Ainda não... 3ª e última dica: Sempre te acompanho, menos quando está no escuro.\n");
                        scanf(" %[^\n]", palpite);
                        if (strcmp(palpite, "sombra") == 0) {
                            printf("Parabéns! Você acertou!\n");
                            pontos++;
                        } else {
                            printf("A palavra era 'sombra' :(, não foi desta vez!\n");
                        }
                    }
                }
                break;
        }

        printf("Sua pontuação atual é %d de %d!\n", pontos, sorteio); 
        sorteio++; 

        if (sorteio <= MAX_PALAVRAS) {
            printf("Deseja jogar mais uma rodada?\n");
            printf("1- Sim. 2- Não: ");
            scanf("%d", &op);
        }
    }

    printf("Obrigado por jogar.\n");

    return 0;
}
