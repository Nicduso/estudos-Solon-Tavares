algoritmo "problema34"
// Função : Fazer uma tabuada de 1 a 10
// Autor : Nicole
// Data : 24/04/2024
// Seção de Declarações 
var

cont, n: inteiro

inicio
// Repetição com teste no início
cont <- 1

escreval ("                      - TABOADA -")
escreval
escreva ("Digite um número inteiro para ver a taboada de 1 à 10: ")
leia (n)

enquanto (cont <= 10) faca
escreval
escreval ("   ",n," x ",cont," = ",n*cont)

cont <- cont+1
fimenquanto

// Repetição com teste no final
cont <- 1
escreval
escreval ("                      - TABOADA -")
escreval
escreva ("Digite um número inteiro para ver a taboada de 1 à 10: ")
leia (n)
repita
escreval
escreval ("   ",n," x ",cont," = ",n*cont)

cont <- cont + 1
ate (cont = 11)

//Repetição com estrutura contada
escreval
escreval ("                      - TABOADA -")
escreval
escreva ("Digite um número inteiro para ver a taboada de 1 à 10: ")
leia (n)

para cont de 1 ate 10 faca
escreval
escreval ("   ",n," x ",cont," = ",n*cont)
fimpara

fimalgoritmo
