algoritmo "problema_7"
// Fun��o :  algoritmo para receber o nome e as duas notas de um aluno e calcular a m�dia aritm�tica.
// Autor : Nicole
// Data : 05/03/2024
// Se��o de Declara��es 
var
aluno: caractere
nt1, nt2, media: real
inicio
escreval (" - M�DIA DA NOTA DO ALUNO - ")
escreval
escreva ("Informe o nome do aluno: ")
leia (aluno)
escreval
escreva ("Informe a 1� nota: ")
leia (nt1)
escreva ("Informe a 2� nota: ")
leia (nt2)
media <- (nt1+nt2)/2
escreval
escreval ("            #########################")
escreval
escreval ("Nome do Aluno: ",aluno)
escreval ("Notas:")
escreval ("       NOTA 1       NOTA 2")
escreval ("         ",nt1,"          ",nt2)
escreval
escreval ("       M�DIA: ",media)

fimalgoritmo
