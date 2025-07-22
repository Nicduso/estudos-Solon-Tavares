algoritmo "problema_7"
// Função :  algoritmo para receber o nome e as duas notas de um aluno e calcular a média aritmética.
// Autor : Nicole
// Data : 05/03/2024
// Seção de Declarações 
var
aluno: caractere
nt1, nt2, media: real
inicio
escreval (" - MÉDIA DA NOTA DO ALUNO - ")
escreval
escreva ("Informe o nome do aluno: ")
leia (aluno)
escreval
escreva ("Informe a 1ª nota: ")
leia (nt1)
escreva ("Informe a 2ª nota: ")
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
escreval ("       MÉDIA: ",media)

fimalgoritmo
