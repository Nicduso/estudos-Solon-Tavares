algoritmo "atividade17"
// Fun��o : Fa�a um algoritmo para ler tr�s n�meros inteiros e encontrar o menor entre eles.
// Autor : Nicole
// Data : 20/03/2024
// Se��o de Declara��es 
var
n1, n2, n3: inteiro

inicio

escreval ("Digite tr�s n�meros inteiros para descobrir qual � o menor:")
escreval
escreva ("        1� N�mero: ")
leia (n1)
escreval
escreva ("        2� N�mero: ")
leia (n2)
escreval
escreva ("        3� N�mero: ")
leia (n3)
escreval
escreval (" --------------------------------------------------------- ")
escreval
se (n1=n2) e (n2=n3) entao
     escreval ("ERRO! Digite n�meros diferentes.")
     senao
se (n1<n2) e (n1<n3) entao
      escreval ("O menor n�mero � ",n1,".")
      senao
           se (n2<n3) entao
           escreval ("O menor n�mero � ",n2,".")
           senao
           escreval ("O menor n�mero � ",n3,".")
           fimse
      fimse
fimse

fimalgoritmo
