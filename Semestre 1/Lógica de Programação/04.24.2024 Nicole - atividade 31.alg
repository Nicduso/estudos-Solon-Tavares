algoritmo "problema31"
// Fun��o : Algoritmo para ler 5 n�meros e classificar cada n�mero lido como par ou �mpar.
// Autor : Nicole
// Data : 24/04/2024
// Se��o de Declara��es 
var
cont, num: inteiro
inicio

// Com estrutura de repeti��o condicional com teste no in�cio
cont <- 1
escreval (" Leia 5 n�meros para descobrir se � �mpar ou par:")
enquanto (cont <= 5) faca
escreva ("      ",cont,"� N�mero: ")
leia (num)
escreval
se (num mod 2) = 0 entao

escreval ("O n�mero ",num," � par.")
escreval
senao
escreval ("O n�mero ",num," � �mpar.")
escreval
fimse
cont <- cont + 1
fimenquanto
escreval

// Com estrutura de repeti��o condicional com teste no final
cont <- 1
escreval (" Leia 5 n�meros para descobrir se � �mpar ou par:")
repita
escreva ("      ",cont,"� N�mero: ")
leia (num)
escreval
se (num mod 2) = 0 entao

escreval ("O n�mero ",num," � par.")
escreval
senao
escreval ("O n�mero ",num," � �mpar.")
escreval
fimse
cont <- cont + 1
ate (cont = 6)
escreval

// Com estrutura de repeti��o condicional contada

escreval (" Leia 5 n�meros para descobrir se � �mpar ou par:")
para cont de 1 ate 5 faca
escreva ("      ",cont,"� N�mero: ")
leia (num)
escreval
se (num mod 2) = 0 entao

escreval ("O n�mero ",num," � par.")
escreval
senao
escreval ("O n�mero ",num," � �mpar.")
escreval
fimse
fimpara
escreval

fimalgoritmo
