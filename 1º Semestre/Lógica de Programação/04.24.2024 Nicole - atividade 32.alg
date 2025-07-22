algoritmo "problema32"
// Função :  Leia 5 números e some pares e ímpares.
// Autor : Nicole
// Data : 24/04/2024
// Seção de Declarações 
var
cont, num, par, imp: inteiro
inicio

// Com estrutura de repetição condicional com teste no início
cont <- 1
par <- 0
imp <- 0
escreval (" Leia 5 números e some pares e ímpares:")
enquanto (cont <= 5) faca

escreva ("      ",cont,"º Número: ")
leia (num)
escreval
se (num mod 2 = 0) entao
par <- par + num
senao
imp <- imp + num
fimse

cont <- cont + 1
fimenquanto
escreval
escreval (" A soma dos números pares resultou em ",par,".")
escreval (" A soma dos números ímpares resultou em ",imp,".")
escreval

// Com estrutura de repetição condicional com teste no final
cont <- 1
par <- 0
imp <- 0
escreval ("  Leia 5 números e some pares e ímpares:")
repita
escreva ("      ",cont,"º Número: ")
leia (num)
escreval
se (num mod 2 = 0) entao
par <- par + num
senao
imp <- imp + num
fimse
cont <- cont + 1
ate (cont = 6)
escreval
escreval (" A soma dos números pares resultou em ",par,".")
escreval (" A soma dos números ímpares resultou em ",imp,".")
escreval

// Com estrutura de repetição condicional contada
par <- 0
imp <- 0
escreval ("  Leia 5 números e some pares e ímpares:")
para cont de 1 ate 5 faca
escreva ("      ",cont,"º Número: ")
leia (num)
escreval
se (num mod 2 = 0) entao
par <- par + num
senao
imp <- imp + num
fimse
fimpara
escreval
escreval (" A soma dos números pares resultou em ",par,".")
escreval (" A soma dos números ímpares resultou em ",imp,".")
escreval
fimalgoritmo
