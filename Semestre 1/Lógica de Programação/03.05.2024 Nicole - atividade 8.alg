algoritmo "problema_8"
// Fun��o : Sal�rio e comiss�o de um determinado Vendedor
// Autor : Nicole
// Data : 05/03/2024
// Se��o de Declara��es 
var
codvend,vendedor: caractere
venda, comissao, salario, saltotal, percom: real

inicio

salario <- 1850
percom <- 15/100

escreval (" - SAL�RIO DO VENDEDOR(A) - ")
escreval
escreval ("Informe os dados do(a) vendedor(a):")
escreva ("C�digo do(a) Vendedor(a): ")
leia (codvend)
escreva ("Vendas mensal do(a) vendedor(a): R$ ")
leia (venda)

comissao <- venda * percom
saltotal <- salario + comissao

se codvend = "123" entao
   vendedor <- ("Jo�o da Silva")
   senao
   se codvend = "456" entao
      vendedor <- ("Manuela Feij�")
      senao
      se codvend = "789" entao
         vendedor <- ("Pedro Carlos")
         senao
         vendedor <- ("Nome n�o identificado")
      fimse
   fimse
fimse

escreval
escreval ("###############")
escreval
escreval ("Vendedor(a): ",vendedor," (",codvend,")")
escreval ("Sal�rio base: R$ ",salario:2:2)
escreval ("Vendas mensal: R$ ",venda:2:2)
escreval ("Total de comiss�o: R$ ",comissao:2:2)
escreval ("Sal�rio total: R$ ",saltotal:2:2)

fimalgoritmo