algoritmo "problema_10"
// Fun��o : trocando vari�veis.
// Autor : Nicole
// Data : 05/03/2024
// Se��o de Declara��es 
var

a, b, aa: inteiro
condicao: caractere

inicio

a <- 10
aa <- a
b <- 5

escreval ("Esta � atualmente a vari�vel A: ",a)
escreval ("Esta � atualmente a vari�vel B: ",b)
escreval
escreva ("Trocar? ")
leia (condicao)
escreval
se condicao = "sim" entao
a <- b
b <- aa
escreval ("Agora esta � atualmente a var�aval A: ",a)
escreval ("    E esta � atualmente a vari�vel B: ",b)
senao
escreval ("Ent�o nada foi feito.")
fimse


fimalgoritmo
