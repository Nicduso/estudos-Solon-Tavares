algoritmo "Problema_29"
// Fun��o : Programas de cota��o
// Autor : Nicole
// Data : 02/04/2024
// Se��o de Declara��es 
var
prog, agua, luz: inteiro
dol, dolcot, m, kwh: real
inicio

escreval ("                   - PROGRAMAS -                   ")
escreval
escreval ("   1 - Convers�o de D�lar (US$) para Real (R$).")
escreval ("   2 - Calcular a conta de �gua.")
escreval ("   3 - Calcular a conta de luz.")
escreval
escreva ("   Qual programa deseja executar? ")
leia (prog)
limpatela
escolha (prog)
caso 1
escreval ("           - CONVERS�O DO D�LAR PARA REAL -           ")
escreval
escreval (" Informe a cota��o atual do D�lar (US$) em Real (R$). ")
escreva (" (quantos reais custa 1 d�lar): R$ ")
leia (dolcot)
escreval
escreva ("Quantos d�lares (US$) gostaria de converter para Real? US$ ")
leia (dol)
escreval
escreval ("  ___________________________________________________ ")
escreval
escreval ("US$ ",dol:4:2," equivalem � R$ ",dol/dolcot:4:2," reais.")
caso 2
escreval ("                  - CALCULAR A CONTA DA �GUA -             ")
escreval
escreval ("        Qual o tipo de cliente?")
escreval
escreval ("         1 - Residencial")
escreval ("         2 - Comercial")
escreval ("         3 - Industrial")
escreval
escreva ("         Escolha entre as op��es 1, 2 e 3: ")
leia (agua)
escreval
se (agua<=0) ou (agua>=4) entao
escreval ("         Op��o selecionada � inv�lida. Tente novamente.")
senao
escreva ("         Informe o consumo em m� deste m�s: ")
leia (m)
escreval
escreval ("  ______________________________________________________________ ")
escreval
escolha (agua)
caso 1
escreval (" Cliente:                  Residencial")
escreval (" Valor da taxa:            R$ 24.70")
escreval (" Valor por m�:             R$ 5.20")
escreval (" Consumo total no m�s:     ", m:4:2," m�")
escreval (" _______________________________________________________________")
escreval (" Valor total a ser pago:   ",24.7+(5.20*m))
caso 2
escreval (" Cliente:                  Comercial")
escreval (" Valor da taxa:            R$ 800.00 para os primeiros 80m�")
escreval (" Valor por m�:             R$ 6.25 por m� que exceder os 80m�")
escreval (" Consumo total no m�s:     ", m:4:2," m�")
escreval (" _______________________________________________________________")
se (m>80) entao
escreval (" Valor total a ser pago:   R$ ",(800+(6.25*(m-80))):4:2)
senao
escreval (" Valor total a ser pago:  R$ 800.00")
fimse
caso 3
escreval (" Cliente:                  Industrial")
escreval (" Valor da taxa:            R$ 900.00 para os primeiros 100m�")
escreval (" Valor por m�:             R$ 7.75 por m� que exceder os 100m�")
escreval (" Consumo total no m�s:     ", m:4:2," m�")
escreval (" _______________________________________________________________")
se (m>100) entao
escreval (" Valor total a ser pago:   R$ ",(900+(7.75*(m-100))):4:2)
senao
escreval (" Valor total a ser pago:  R$ 900.00")
fimse
outrocaso
escreval ("Nenhuma op��o v�lida selecionada. Tente novamente.")
fimescolha
fimse
caso 3
escreval ("                  - CALCULAR A CONTA DE LUZ -             ")
escreval
escreval ("        Qual o tipo de cliente?")
escreval
escreval ("         1 - Residencial")
escreval ("         2 - Comercial")
escreval ("         3 - Industrial")
escreval
escreva ("         Escolha entre as op��es 1, 2 e 3: ")
leia (luz)
escreval
se (luz<=0) ou (luz>=4) entao
escreval ("         Op��o selecionada � inv�lida. Tente novamente.")
senao
escreva ("         Informe o consumo em KW/h deste m�s: ")
leia (kwh)
escreval
escreval ("  ______________________________________________________________ ")
escreval
escolha (luz)
caso 1
escreval (" Cliente:                  Residencial")
escreval (" Valor do KW/h:            R$ 0.60")
escreval (" Consumo total no m�s:     ", kwh:4:2," KW/h")
escreval (" _______________________________________________________________")
escreval (" Valor total a ser pago:   R$ ",(kwh*0.6):4:2)
caso 2
escreval (" Cliente:                  Comercial")
escreval (" Valor do KW/h:            R$ 0.48")
escreval (" Consumo total no m�s:     ", kwh:4:2," KW/h")
escreval (" _______________________________________________________________")
escreval (" Valor total a ser pago:   R$ ",(kwh*0.48):4:2)
caso 3
escreval (" Cliente:                  Industrial")
escreval (" Valor do KW/h:            R$ 1.29")
escreval (" Consumo total no m�s:     ", kwh:4:2," KW/h")
escreval (" _______________________________________________________________")
escreval (" Valor total a ser pago:   R$ ",(kwh*1.29):4:2)
outrocaso
escreval ("Nenhuma op��o v�lida selecionada. Tente novamente.")
fimescolha
outrocaso
escreval ("Nenhuma op��o v�lida selecionada. Tente novamente.")
fimse
fimescolha
fimalgoritmo
