algoritmo "problema32"
// Fun��o :  Leia 5 n�meros e some pares e �mpares.
// Autor : Nicole
// Data : 24/04/2024
// Se��o de Declara��es 
var
cont, num, par, imp: inteiro
inicio

// Com estrutura de repeti��o condicional com teste no in�cio
cont <- 1
par <- 0
imp <- 0
escreval (" Leia 5 n�meros e some pares e �mpares:")
enquanto (cont <= 5) faca

escreva ("      ",cont,"� N�mero: ")
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
escreval (" A soma dos n�meros pares resultou em ",par,".")
escreval (" A soma dos n�meros �mpares resultou em ",imp,".")
escreval

// Com estrutura de repeti��o condicional com teste no final
cont <- 1
par <- 0
imp <- 0
escreval ("  Leia 5 n�meros e some pares e �mpares:")
repita
escreva ("      ",cont,"� N�mero: ")
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
escreval (" A soma dos n�meros pares resultou em ",par,".")
escreval (" A soma dos n�meros �mpares resultou em ",imp,".")
escreval

// Com estrutura de repeti��o condicional contada
par <- 0
imp <- 0
escreval ("  Leia 5 n�meros e some pares e �mpares:")
para cont de 1 ate 5 faca
escreva ("      ",cont,"� N�mero: ")
leia (num)
escreval
se (num mod 2 = 0) entao
par <- par + num
senao
imp <- imp + num
fimse
fimpara
escreval
escreval (" A soma dos n�meros pares resultou em ",par,".")
escreval (" A soma dos n�meros �mpares resultou em ",imp,".")
escreval
fimalgoritmo
