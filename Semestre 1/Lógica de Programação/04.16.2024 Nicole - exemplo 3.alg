algoritmo "exemplo2"
// Função : Receba 5 números, some-os e depois informe o resultado
// Autor : Nicole
// Data : 16/04/2024
// Seção de Declarações 
var
cont: inteiro
num, acum: real
inicio

// Com estrutura de repetição condicional com teste no início
cont <- 1
acum <- 0
escreval (" Leia 5 números e depois some todos:")
enquanto (cont <= 5) faca
escreva ("      ",cont,"º Número: ")
leia (num)
acum <- acum + num
cont <- cont + 1
fimenquanto
escreval
escreval (" Soma dos 5 números: ",acum)
escreval

// Com estrutura de repetição condicional com teste no final
cont <- 1
acum <- 0
escreval (" Leia 5 números e depois some todos:")
repita
escreva ("      ",cont,"º Número: ")
leia (num)
acum <- acum + num
cont <- cont +1
ate (cont = 6)
escreval
escreval (" Soma dos 5 números: ",acum)
escreval

// Com estrutura de repetição condicional contada
acum <- 0
escreval (" Leia 5 números e depois some todos:")
para cont de 1 ate 5 faca
escreva ("      ",cont,"º Número: ")
leia (num)
acum <- acum + num
fimpara
escreval
escreval (" Soma dos 5 números: ",acum)
escreval

fimalgoritmo
