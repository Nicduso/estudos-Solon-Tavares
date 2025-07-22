algoritmo "problema31"
// Função : Algoritmo para ler 5 números e classificar cada número lido como par ou ímpar.
// Autor : Nicole
// Data : 24/04/2024
// Seção de Declarações 
var
cont, num: inteiro
inicio

// Com estrutura de repetição condicional com teste no início
cont <- 1
escreval (" Leia 5 números para descobrir se é ímpar ou par:")
enquanto (cont <= 5) faca
escreva ("      ",cont,"º Número: ")
leia (num)
escreval
se (num mod 2) = 0 entao

escreval ("O número ",num," é par.")
escreval
senao
escreval ("O número ",num," é ímpar.")
escreval
fimse
cont <- cont + 1
fimenquanto
escreval

// Com estrutura de repetição condicional com teste no final
cont <- 1
escreval (" Leia 5 números para descobrir se é ímpar ou par:")
repita
escreva ("      ",cont,"º Número: ")
leia (num)
escreval
se (num mod 2) = 0 entao

escreval ("O número ",num," é par.")
escreval
senao
escreval ("O número ",num," é ímpar.")
escreval
fimse
cont <- cont + 1
ate (cont = 6)
escreval

// Com estrutura de repetição condicional contada

escreval (" Leia 5 números para descobrir se é ímpar ou par:")
para cont de 1 ate 5 faca
escreva ("      ",cont,"º Número: ")
leia (num)
escreval
se (num mod 2) = 0 entao

escreval ("O número ",num," é par.")
escreval
senao
escreval ("O número ",num," é ímpar.")
escreval
fimse
fimpara
escreval

fimalgoritmo
