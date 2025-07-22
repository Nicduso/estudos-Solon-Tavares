algoritmo "atividade17"
// Função : Escolher que tipo de operação deseja calcular a partir de 2 operandos.
// Autor : Nicole
// Data : 26/03/2024
// Seção de Declarações 
var

op1, op2: real
op: inteiro

inicio

escreval ("----------------- CALCULANDO OPERAÇÕES -----------------")
escreval
escreval ("         Informe os números que deseja operar:")
escreval
escreva ("  1º Número: ")
leia (op1)
escreva ("  2º Número: ")
leia (op2)
escreval
escreval ("----------------- SELECIONE A OPERAÇÃO -----------------")
escreval
escreval ("|  1 = Adição         |")
escreval ("|  2 = Subtração      |")
escreval ("|  3 = Multiplicação  |")
escreval ("|  4 = Divisão        |")
escreval
escreva ("Digite o operação desejada: ")
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
             escreval ("A operação não foi informada corretamente.")
fimescolha



fimalgoritmo
