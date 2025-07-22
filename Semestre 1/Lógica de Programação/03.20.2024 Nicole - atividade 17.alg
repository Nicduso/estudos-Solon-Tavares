algoritmo "atividade17"
// Função : Faça um algoritmo para ler três números inteiros e encontrar o menor entre eles.
// Autor : Nicole
// Data : 20/03/2024
// Seção de Declarações 
var
n1, n2, n3: inteiro

inicio

escreval ("Digite três números inteiros para descobrir qual é o menor:")
escreval
escreva ("        1º Número: ")
leia (n1)
escreval
escreva ("        2º Número: ")
leia (n2)
escreval
escreva ("        3º Número: ")
leia (n3)
escreval
escreval (" --------------------------------------------------------- ")
escreval
se (n1=n2) e (n2=n3) entao
     escreval ("ERRO! Digite números diferentes.")
     senao
se (n1<n2) e (n1<n3) entao
      escreval ("O menor número é ",n1,".")
      senao
           se (n2<n3) entao
           escreval ("O menor número é ",n2,".")
           senao
           escreval ("O menor número é ",n3,".")
           fimse
      fimse
fimse

fimalgoritmo
