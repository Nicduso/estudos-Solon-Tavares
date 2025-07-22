algoritmo "problema33"
// Função :  Somar os números até que sejam igual a 0.
// Autor : Nicole
// Data : 24/04/2024
// Seção de Declarações 
var
n1, n2, soma: real
inicio

// Com estrutura de repetição condicional com teste no início
soma <- 1
enquanto (soma <> 0) faca
escreval ("Somar 2 números até encontrar 0:")
escreval
escreva (" Informe o 1º Número: ")
leia (n1)
escreval
escreva (" Informe o 1º Número: ")
leia (n2)
soma <- n1 + n2
escreval
se (soma <> 0) entao
escreval (" O resultado da soma de ",n1," e ",n2," é ",soma,".")
fimse
escreval
fimenquanto
escreval (" Finalmente o resultado da soma de ",n1," e ",n2," é ",soma,".")
escreval

// Com estrutura de repetição condicional com teste no final
soma <- 1
escreval ("Somar 2 números")
repita

escreval ("Somar 2 números até encontrar 0:")
escreval
escreva (" Informe o 1º Número: ")
leia (n1)
escreval
escreva (" Informe o 1º Número: ")
leia (n2)
soma <- n1 + n2
escreval
se (soma <> 0) entao
escreval (" O resultado da soma de ",n1," e ",n2," é ",soma,".")
fimse
ate (soma = 0)
escreval
escreval (" Finalmente o resultado da soma de ",n1," e ",n2," é ",soma,".")
escreval
fimalgoritmo
