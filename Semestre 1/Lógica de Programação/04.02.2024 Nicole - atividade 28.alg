algoritmo "problema_28"
// Fun��o : Verificar um n�mero inteiro
// Autor : Nicole
// Data : 02/04/2024
// Se��o de Declara��es 
var
n, op: inteiro
inicio

escreval ("             - MENU DE VERIFICA��O -             ")
escreval
escreval ("    1 - Verifica se o n�mero � multiplo de 3")
escreval ("    2 - Verifica se o n�mero � divis�vel por 5")
escreval ("    3 - Verifica se o n�mero � par ou �mpar")
escreval ("    4 - Verifica se o n�mero � negativo ou positivo")
escreval ("    5 - Verifica se o n�mero est� no intervalo de 10 � 60")
escreval
escreva ("Qual sua op��o entre 1, 2, 3, 4 e 5? ")
leia (op)
escreval
escreva ("Digite o n�mero inteiro que deseja verificar: ")
leia (n)
limpatela
escreval ("             - RESULTADO DA VERIFICA��O -             ")
escreval
escolha (op)
caso 1
se (n mod 3 = 0) entao
escreval ("O n�mero ",n," � m�ltiplo de 3.")
senao
escreval ("O n�mero ",n," N�O � m�ltiplo de 3.")
fimse
caso 2
se (n mod 5 = 0) entao
escreval ("O n�mero ",n," � divis�vel por 5.")
senao
escreval ("O n�mero ",n," N�O � divis�vel por 5.")
fimse
caso 3
se (n mod 2 = 0) entao
escreval ("O n�mero ",n," � par.")
senao
escreval ("O n�mero ",n," � �mpar.")
fimse
caso 4
se (n>0) entao
escreval ("O n�mero ",n," � positivo.")
senao
se (n=0) entao
escreval ("O n�mero ",n," � neutro")
senao
escreval ("O n�mero ",n," � negativo.")
fimse
fimse
caso 5
se (n>=10) e (n<=60) entao
escreval ("O n�mero ",n," EST� no intervalo de 10 � 60.")
senao
escreval ("O n�mero ",n," N�O EST� no intervalo de 10 � 60.")
fimse
outrocaso
escreval ("N�o foi informada uma op��o v�lida. Por favor, tente novamente.")
escreval
fimescolha
fimalgoritmo
