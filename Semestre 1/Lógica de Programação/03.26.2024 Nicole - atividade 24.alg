algoritmo "atividade17"
// Fun��o : Escolher que tipo de opera��o deseja calcular a partir de 2 operandos.
// Autor : Nicole
// Data : 26/03/2024
// Se��o de Declara��es 
var

op1, op2: real
op: inteiro

inicio

escreval ("----------------- CALCULANDO OPERA��ES -----------------")
escreval
escreval ("         Informe os n�meros que deseja operar:")
escreval
escreva ("  1� N�mero: ")
leia (op1)
escreva ("  2� N�mero: ")
leia (op2)
escreval
escreval ("----------------- SELECIONE A OPERA��O -----------------")
escreval
escreval ("|  1 = Adi��o         |")
escreval ("|  2 = Subtra��o      |")
escreval ("|  3 = Multiplica��o  |")
escreval ("|  4 = Divis�o        |")
escreval
escreva ("Digite o opera��o desejada: ")
leia (op)
escreval
escreval ("---------------------- RESULTADOS ----------------------")
escreval
escolha (op)
        caso 1
             escreval ("Resultado: ",op1, " + ", op2, " = ",op1 + op2)
        caso 2
             escreval ("Resultado: ",op1, " - ", op2, " = ",op1 - op2)
        caso 3
             escreval ("Resultado: ",op1, " * ", op2, " = ",op1 * op2)
        caso 4
             escreval ("Resultado: ",op1, " / ", op2, " = ",op1 / op2)
        outrocaso
             escreval ("A opera��o n�o foi informada corretamente.")
fimescolha



fimalgoritmo
