algoritmo "problema_6"
// Função : Faça um algoritmo para receber (ler) dois números inteiros, calcular as quatro operações básicas e ao final mostrar os quatro resultados obtido.
// Autor : Nicole
// Data : 28/02/2024
// Seção de Declarações 
var
   n1, n2, soma, subtracao, multiplicacao: inteiro
   divisao: real
inicio
      escreval (" - ALGORITMO PARA CALCULAR AS QUATRO OPERAÇÕES DE MATEMÁTICA (+ - * /) - ")
      escreval
      escreval ("Informe dois números para aplicar as operações:")
      escreval
      escreva ("1º Número: ")
      leia (n1)
      escreva ("2º Número: ")
      leia (n2)
      soma <- n1+n2
      subtracao <- n1-n2
      multiplicacao <- n1*n2
      divisao <- n1/n2
      escreval
      escreval ("             ********            ")
      escreval ("Você informou os números ",n1," e ",n2,".")
      escreval
      escreval ("Seguem as operações:")
      escreval
      escreval ("Soma: ",n1," + ",n2," = ",soma,".")
      escreval ("Subtração: ",n1," - ",n2," = ",subtracao,".")
      escreval ("Multiplicação: ",n1," * ",n2," = ",multiplicacao,".")
      escreval ("Divisão: ",n1," / ",n2," = ",divisao,".")
      
// Seção de Comandos 
fimalgoritmo
