algoritmo "exemplo2"
// Fun��o : Receba 5 n�meros, some-os e depois informe o resultado
// Autor : Nicole
// Data : 16/04/2024
// Se��o de Declara��es 
var
cont: inteiro
num, acum: real
inicio

// Com estrutura de repeti��o condicional com teste no in�cio
cont <- 1
acum <- 0
escreval (" Leia 5 n�meros e depois some todos:")
enquanto (cont <= 5) faca
escreva ("      ",cont,"� N�mero: ")
leia (num)
acum <- acum + num
cont <- cont + 1
fimenquanto
escreval
escreval (" Soma dos 5 n�meros: ",acum)
escreval

// Com estrutura de repeti��o condicional com teste no final
cont <- 1
acum <- 0
escreval (" Leia 5 n�meros e depois some todos:")
repita
escreva ("      ",cont,"� N�mero: ")
leia (num)
acum <- acum + num
cont <- cont +1
ate (cont = 6)
escreval
escreval (" Soma dos 5 n�meros: ",acum)
escreval

// Com estrutura de repeti��o condicional contada
acum <- 0
escreval (" Leia 5 n�meros e depois some todos:")
para cont de 1 ate 5 faca
escreva ("      ",cont,"� N�mero: ")
leia (num)
acum <- acum + num
fimpara
escreval
escreval (" Soma dos 5 n�meros: ",acum)
escreval

fimalgoritmo
