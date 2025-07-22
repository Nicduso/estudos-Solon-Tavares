algoritmo "problema_10"
// Função : trocando variáveis.
// Autor : Nicole
// Data : 05/03/2024
// Seção de Declarações 
var

a, b, aa: inteiro
condicao: caractere

inicio

a <- 10
aa <- a
b <- 5

escreval ("Esta é atualmente a variável A: ",a)
escreval ("Esta é atualmente a variável B: ",b)
escreval
escreva ("Trocar? ")
leia (condicao)
escreval
se condicao = "sim" entao
a <- b
b <- aa
escreval ("Agora esta é atualmente a varíaval A: ",a)
escreval ("    E esta é atualmente a variável B: ",b)
senao
escreval ("Então nada foi feito.")
fimse


fimalgoritmo
