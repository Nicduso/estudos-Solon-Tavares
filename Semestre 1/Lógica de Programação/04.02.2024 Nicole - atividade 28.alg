algoritmo "problema_28"
// Função : Verificar um número inteiro
// Autor : Nicole
// Data : 02/04/2024
// Seção de Declarações 
var
n, op: inteiro
inicio

escreval ("             - MENU DE VERIFICAÇÃO -             ")
escreval
escreval ("    1 - Verifica se o número é multiplo de 3")
escreval ("    2 - Verifica se o número é divisível por 5")
escreval ("    3 - Verifica se o número é par ou ímpar")
escreval ("    4 - Verifica se o número é negativo ou positivo")
escreval ("    5 - Verifica se o número está no intervalo de 10 à 60")
escreval
escreva ("Qual sua opção entre 1, 2, 3, 4 e 5? ")
leia (op)
escreval
escreva ("Digite o número inteiro que deseja verificar: ")
leia (n)
limpatela
escreval ("             - RESULTADO DA VERIFICAÇÃO -             ")
escreval
escolha (op)
caso 1
se (n mod 3 = 0) entao
escreval ("O número ",n," É múltiplo de 3.")
senao
escreval ("O número ",n," NÃO É múltiplo de 3.")
fimse
caso 2
se (n mod 5 = 0) entao
escreval ("O número ",n," É divisível por 5.")
senao
escreval ("O número ",n," NÃO É divisível por 5.")
fimse
caso 3
se (n mod 2 = 0) entao
escreval ("O número ",n," é par.")
senao
escreval ("O número ",n," é ímpar.")
fimse
caso 4
se (n>0) entao
escreval ("O número ",n," é positivo.")
senao
se (n=0) entao
escreval ("O número ",n," é neutro")
senao
escreval ("O número ",n," é negativo.")
fimse
fimse
caso 5
se (n>=10) e (n<=60) entao
escreval ("O número ",n," ESTÁ no intervalo de 10 à 60.")
senao
escreval ("O número ",n," NÃO ESTÁ no intervalo de 10 à 60.")
fimse
outrocaso
escreval ("Não foi informada uma opção válida. Por favor, tente novamente.")
escreval
fimescolha
fimalgoritmo
