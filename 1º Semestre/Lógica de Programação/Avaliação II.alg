algoritmo "avaliacao2"
// Função : Gerar 4 programas
// Autor : Nicole
// Data : 24/06/2024
// Seção de Declarações

var
    numInicial, numFinal, contador, somaPares, somaImpares, idadePadrao, idade, contagemIdadeX, menu, opc, cont, tab, n, num, i, cont0_25, cont25_50, cont50_75, cont75_100: inteiro

inicio

repita
    limpatela
    escreval ("                          - MENU DE OPÇÕES -")
    escreval
    escreval ("1 - Gerar a tabuada do 1 ao 10.")
    escreval ("2 - Contagem dos intervalos de valores.")
    escreval ("3 - Contagem de pessoas com idade igual a idade padrão.")
    escreval ("4 - Gerar os números de um intervalo de valores classificando-os como par ou ímpar.")
    escreval ("5 - Finalizar Programa.")
    escreval
    escreva ("Qual opção deseja executar (1, 2, 3, 4 ou 5)? ")
    leia (opc)
    escreval

    escolha (opc)
        caso 1
            escreval ("                       - TABOADAS DE 1 À 10 -")
            escreval
            cont <- 1
            n <- 1
            enquanto (cont <= 10) faca
                escreval ("Taboada do ",cont,":")
                escreval
                tab <- 1
                enquanto (tab <= 10) faca
                    escreval ("   ",n," x ",cont," = ",n*cont)
                    tab <- tab + 1
                    n <- n + 1
                fimenquanto
                escreval
                cont <- cont + 1
                n <- 1
            fimenquanto

        caso 2
            escreval ("Digite 20 números para calcularmos quantos estão em cada intervalo de 25:")
            escreval

            cont0_25 <- 0
            cont25_50 <- 0
            cont50_75 <- 0
            cont75_100 <- 0

            para i de 1 ate 20 faca
                repita
                    escreva ("Digite o ", i, "º número entre 0 e 100: ")
                    leia (num)
                    se (num < 0) ou (num > 100) entao
                        escreval ("Número inválido! Digite um número entre 0 e 100.")
                    fimse
                ate (num >= 0) e (num <= 100)

                se (num >= 0) e (num <= 25) entao
                    cont0_25 <- cont0_25 + 1
                senao
                    se (num > 25) e (num <= 50) entao
                        cont25_50 <- cont25_50 + 1
                    senao
                        se (num > 50) e (num <= 75) entao
                            cont50_75 <- cont50_75 + 1
                        senao
                            se (num > 75) e (num <= 100) entao
                                cont75_100 <- cont75_100 + 1
                            fimse
                        fimse
                    fimse
                fimse
            fimpara

            escreval
            escreval ("                            - RESULTADOS -")
            escreval
            escreval ("Quantidade de números no intervalo [0..25]: ", cont0_25)
            escreval ("Quantidade de números no intervalo [25..50]: ", cont25_50)
            escreval ("Quantidade de números no intervalo [50..75]: ", cont50_75)
            escreval ("Quantidade de números no intervalo [75..100]: ", cont75_100)

        caso 3
            escreval ("                 - QUANTOS POSSUEM A IDADE PADRÃO? -")
            escreval
            escreva ("Digite a idade padrão desejada: ")
            leia (idadePadrao)
            escreval
            contagemIdadeX <- 0

            enquanto verdadeiro faca
                escreva ("Digite uma idade (ou 0 para parar): ")
                leia (idade)

                se idade = 0 entao
                    interrompa
                fimse

                se idade = idadePadrao entao
                    contagemIdadeX <- contagemIdadeX + 1
                fimse
            fimenquanto

            escreval
            escreval ("Número de pessoas com idade igual a ", idadePadrao, ": ", contagemIdadeX)

        caso 4
            escreval ("                            - PAR OU ÍMPAR -")
            escreval
            escreval ("Digite dois números inteiros para definir o intervalo: ")
            escreval
            escreva ("1º Número: ")
            leia (numInicial)
            escreva ("2º Número: ")
            leia (numFinal)
            escreval

            se numInicial > numFinal entao
                aux: inteiro
                aux <- numInicial
                numInicial <- numFinal
                numFinal <- aux
            fimse

            contador <- numInicial
            somaPares <- 0
            somaImpares <- 0

            repita
                se contador % 2 = 0 entao
                    escreval (contador, " É PAR!")
                    somaPares <- somaPares + contador
                senao
                    escreval (contador, " É ÍMPAR!")
                    somaImpares <- somaImpares + contador
                fimse

                contador <- contador + 1
            ate contador > numFinal

            escreval
            escreval ("Soma dos números pares: ", somaPares)
            escreval ("Soma dos números ímpares: ", somaImpares)

        caso 5
            escreval ("Programa encerrado.")
            menu <- 2

    fimescolha

    se opc <> 5 entao
        escreval
        escreval ("Deseja retornar ao menu inicial?")
        escreval
        escreva ("1 - SIM; 2 - NÃO: ")
        leia (menu)
    fimse

ate menu = 2

fimalgoritmo

