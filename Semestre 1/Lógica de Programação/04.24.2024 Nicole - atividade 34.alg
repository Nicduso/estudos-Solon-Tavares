algoritmo "problema34"
// Fun��o : Fazer uma tabuada de 1 a 10
// Autor : Nicole
// Data : 24/04/2024
// Se��o de Declara��es 
var

cont, n: inteiro

inicio
// Repeti��o com teste no in�cio
cont <- 1

escreval ("                      - TABOADA -")
escreval
escreva ("Digite um n�mero inteiro para ver a taboada de 1 � 10: ")
leia (n)

enquanto (cont <= 10) faca
escreval
escreval ("   ",n," x ",cont," = ",n*cont)

cont <- cont+1
fimenquanto

// Repeti��o com teste no final
cont <- 1
escreval
escreval ("                      - TABOADA -")
escreval
escreva ("Digite um n�mero inteiro para ver a taboada de 1 � 10: ")
leia (n)
repita
escreval
escreval ("   ",n," x ",cont," = ",n*cont)

cont <- cont + 1
ate (cont = 11)

//Repeti��o com estrutura contada
escreval
escreval ("                      - TABOADA -")
escreval
escreva ("Digite um n�mero inteiro para ver a taboada de 1 � 10: ")
leia (n)

para cont de 1 ate 10 faca
escreval
escreval ("   ",n," x ",cont," = ",n*cont)
fimpara

fimalgoritmo
