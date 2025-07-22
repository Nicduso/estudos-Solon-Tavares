algoritmo "problema_8"
// Função : Salário e comissão de um determinado Vendedor
// Autor : Nicole
// Data : 05/03/2024
// Seção de Declarações 
var
codvend,vendedor: caractere
venda, comissao, salario, saltotal, percom: real

inicio

salario <- 1850
percom <- 15/100

escreval (" - SALÁRIO DO VENDEDOR(A) - ")
escreval
escreval ("Informe os dados do(a) vendedor(a):")
escreva ("Código do(a) Vendedor(a): ")
leia (codvend)
escreva ("Vendas mensal do(a) vendedor(a): R$ ")
leia (venda)

comissao <- venda * percom
saltotal <- salario + comissao

se codvend = "123" entao
   vendedor <- ("João da Silva")
   senao
   se codvend = "456" entao
      vendedor <- ("Manuela Feijó")
      senao
      se codvend = "789" entao
         vendedor <- ("Pedro Carlos")
         senao
         vendedor <- ("Nome não identificado")
      fimse
   fimse
fimse

escreval
escreval ("###############")
escreval
escreval ("Vendedor(a): ",vendedor," (",codvend,")")
escreval ("Salário base: R$ ",salario:2:2)
escreval ("Vendas mensal: R$ ",venda:2:2)
escreval ("Total de comissão: R$ ",comissao:2:2)
escreval ("Salário total: R$ ",saltotal:2:2)

fimalgoritmo