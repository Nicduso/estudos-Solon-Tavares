algoritmo "problema33"
// Fun��o :  Somar os n�meros at� que sejam igual a 0.
// Autor : Nicole
// Data : 24/04/2024
// Se��o de Declara��es 
var
n1, n2, soma: real
inicio

// Com estrutura de repeti��o condicional com teste no in�cio
soma <- 1
enquanto (soma <> 0) faca
escreval ("Somar 2 n�meros at� encontrar 0:")
escreval
escreva (" Informe o 1� N�mero: ")
leia (n1)
escreval
escreva (" Informe o 1� N�mero: ")
leia (n2)
soma <- n1 + n2
escreval
se (soma <> 0) entao
escreval (" O resultado da soma de ",n1," e ",n2," � ",soma,".")
fimse
escreval
fimenquanto
escreval (" Finalmente o resultado da soma de ",n1," e ",n2," � ",soma,".")
escreval

// Com estrutura de repeti��o condicional com teste no final
soma <- 1
escreval ("Somar 2 n�meros")
repita

escreval ("Somar 2 n�meros at� encontrar 0:")
escreval
escreva (" Informe o 1� N�mero: ")
leia (n1)
escreval
escreva (" Informe o 1� N�mero: ")
leia (n2)
soma <- n1 + n2
escreval
se (soma <> 0) entao
escreval (" O resultado da soma de ",n1," e ",n2," � ",soma,".")
fimse
ate (soma = 0)
escreval
escreval (" Finalmente o resultado da soma de ",n1," e ",n2," � ",soma,".")
escreval
fimalgoritmo
