algoritmo "exemplo2"
// Fun��o : N�meros �mpares de 1 � 10
// Autor : Nicole
// Data : 16/04/2024
// Se��o de Declara��es 
var
cont, contI: inteiro
inicio

// Com estrutura de repeti��o condicional com teste no in�cio
contI <- 0
cont <- 1
escreval (" N�meros �mpares de 1 � 10:")
enquanto (cont <= 10) faca
se (cont mod 2 = 1) entao
escreval ("           ",cont)
contI <- contI + 1
fimse
cont <- cont + 1
fimenquanto
escreval
escreval ("Foram impressos ",contI," n�meros �mpares")
escreval

// Com estrutura de repeti��o condicional com teste no final
contI <- 0
cont <- 1
escreval (" N�meros �mpares de 1 � 10:")
repita
escreval ("           ",cont)
cont <- cont +2
contI <- contI + 1
ate (cont = 11)
escreval
escreval ("Foram impressos ",contI," n�meros �mpares")
escreval

// Com estrutura de repeti��o condicional contada
contI <- 0
escreval (" N�meros �mpares de 1 � 10:")
para cont de 1 ate 10 faca
se (cont mod 2 = 1) entao
escreval ("           ",cont)
contI <- contI + 1
fimse
fimpara
escreval
escreval ("Foram impressos ",contI," n�meros �mpares")
escreval

fimalgoritmo
