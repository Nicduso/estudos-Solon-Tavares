algoritmo "problema_6"
// Fun��o : Fa�a um algoritmo para receber (ler) dois n�meros inteiros, calcular as quatro opera��es b�sicas e ao final mostrar os quatro resultados obtido.
// Autor : Nicole
// Data : 28/02/2024
// Se��o de Declara��es 
var
   n1, n2, soma, subtracao, multiplicacao: inteiro
   divisao: real
inicio
      escreval (" - ALGORITMO PARA CALCULAR AS QUATRO OPERA��ES DE MATEM�TICA (+ - * /) - ")
      escreval
      escreval ("Informe dois n�meros para aplicar as opera��es:")
      escreval
      escreva ("1� N�mero: ")
      leia (n1)
      escreva ("2� N�mero: ")
      leia (n2)
      soma <- n1+n2
      subtracao <- n1-n2
      multiplicacao <- n1*n2
      divisao <- n1/n2
      escreval
      escreval ("             ********            ")
      escreval ("Voc� informou os n�meros ",n1," e ",n2,".")
      escreval
      escreval ("Seguem as opera��es:")
      escreval
      escreval ("Soma: ",n1," + ",n2," = ",soma,".")
      escreval ("Subtra��o: ",n1," - ",n2," = ",subtracao,".")
      escreval ("Multiplica��o: ",n1," * ",n2," = ",multiplicacao,".")
      escreval ("Divis�o: ",n1," / ",n2," = ",divisao,".")
      
// Se��o de Comandos 
fimalgoritmo
