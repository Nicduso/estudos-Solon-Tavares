algoritmo "exemplo2"
// Função : Números ímpares de 1 à 10
// Autor : Nicole
// Data : 16/04/2024
// Seção de Declarações 
var
cont, contI: inteiro
inicio

// Com estrutura de repetição condicional com teste no início
contI <- 0
cont <- 1
escreval (" Números ímpares de 1 à 10:")
enquanto (cont <= 10) faca
se (cont mod 2 = 1) entao
escreval ("           ",cont)
contI <- contI + 1
fimse
cont <- cont + 1
fimenquanto
escreval
escreval ("Foram impressos ",contI," números ímpares")
escreval

// Com estrutura de repetição condicional com teste no final
contI <- 0
cont <- 1
escreval (" Números ímpares de 1 à 10:")
repita
escreval ("           ",cont)
cont <- cont +2
contI <- contI + 1
ate (cont = 11)
escreval
escreval ("Foram impressos ",contI," números ímpares")
escreval

// Com estrutura de repetição condicional contada
contI <- 0
escreval (" Números ímpares de 1 à 10:")
para cont de 1 ate 10 faca
se (cont mod 2 = 1) entao
escreval ("           ",cont)
contI <- contI + 1
fimse
fimpara
escreval
escreval ("Foram impressos ",contI," números ímpares")
escreval

fimalgoritmo
