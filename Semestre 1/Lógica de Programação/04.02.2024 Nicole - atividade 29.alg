algoritmo "Problema_29"
// Função : Programas de cotação
// Autor : Nicole
// Data : 02/04/2024
// Seção de Declarações 
var
prog, agua, luz: inteiro
dol, dolcot, m, kwh: real
inicio

escreval ("                   - PROGRAMAS -                   ")
escreval
escreval ("   1 - Conversão de Dólar (US$) para Real (R$).")
escreval ("   2 - Calcular a conta de água.")
escreval ("   3 - Calcular a conta de luz.")
escreval
escreva ("   Qual programa deseja executar? ")
leia (prog)
limpatela
escolha (prog)
caso 1
escreval ("           - CONVERSÃO DO DÓLAR PARA REAL -           ")
escreval
escreval (" Informe a cotação atual do Dólar (US$) em Real (R$). ")
escreva (" (quantos reais custa 1 dólar): R$ ")
leia (dolcot)
escreval
escreva ("Quantos dólares (US$) gostaria de converter para Real? US$ ")
leia (dol)
escreval
escreval ("  ___________________________________________________ ")
escreval
escreval ("US$ ",dol:4:2," equivalem à R$ ",dol/dolcot:4:2," reais.")
caso 2
escreval ("                  - CALCULAR A CONTA DA ÁGUA -             ")
escreval
escreval ("        Qual o tipo de cliente?")
escreval
escreval ("         1 - Residencial")
escreval ("         2 - Comercial")
escreval ("         3 - Industrial")
escreval
escreva ("         Escolha entre as opções 1, 2 e 3: ")
leia (agua)
escreval
se (agua<=0) ou (agua>=4) entao
escreval ("         Opção selecionada é inválida. Tente novamente.")
senao
escreva ("         Informe o consumo em m³ deste mês: ")
leia (m)
escreval
escreval ("  ______________________________________________________________ ")
escreval
escolha (agua)
caso 1
escreval (" Cliente:                  Residencial")
escreval (" Valor da taxa:            R$ 24.70")
escreval (" Valor por m³:             R$ 5.20")
escreval (" Consumo total no mês:     ", m:4:2," m³")
escreval (" _______________________________________________________________")
escreval (" Valor total a ser pago:   ",24.7+(5.20*m))
caso 2
escreval (" Cliente:                  Comercial")
escreval (" Valor da taxa:            R$ 800.00 para os primeiros 80m³")
escreval (" Valor por m³:             R$ 6.25 por m³ que exceder os 80m³")
escreval (" Consumo total no mês:     ", m:4:2," m³")
escreval (" _______________________________________________________________")
se (m>80) entao
escreval (" Valor total a ser pago:   R$ ",(800+(6.25*(m-80))):4:2)
senao
escreval (" Valor total a ser pago:  R$ 800.00")
fimse
caso 3
escreval (" Cliente:                  Industrial")
escreval (" Valor da taxa:            R$ 900.00 para os primeiros 100m³")
escreval (" Valor por m³:             R$ 7.75 por m³ que exceder os 100m³")
escreval (" Consumo total no mês:     ", m:4:2," m³")
escreval (" _______________________________________________________________")
se (m>100) entao
escreval (" Valor total a ser pago:   R$ ",(900+(7.75*(m-100))):4:2)
senao
escreval (" Valor total a ser pago:  R$ 900.00")
fimse
outrocaso
escreval ("Nenhuma opção válida selecionada. Tente novamente.")
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
escreva ("         Escolha entre as opções 1, 2 e 3: ")
leia (luz)
escreval
se (luz<=0) ou (luz>=4) entao
escreval ("         Opção selecionada é inválida. Tente novamente.")
senao
escreva ("         Informe o consumo em KW/h deste mês: ")
leia (kwh)
escreval
escreval ("  ______________________________________________________________ ")
escreval
escolha (luz)
caso 1
escreval (" Cliente:                  Residencial")
escreval (" Valor do KW/h:            R$ 0.60")
escreval (" Consumo total no mês:     ", kwh:4:2," KW/h")
escreval (" _______________________________________________________________")
escreval (" Valor total a ser pago:   R$ ",(kwh*0.6):4:2)
caso 2
escreval (" Cliente:                  Comercial")
escreval (" Valor do KW/h:            R$ 0.48")
escreval (" Consumo total no mês:     ", kwh:4:2," KW/h")
escreval (" _______________________________________________________________")
escreval (" Valor total a ser pago:   R$ ",(kwh*0.48):4:2)
caso 3
escreval (" Cliente:                  Industrial")
escreval (" Valor do KW/h:            R$ 1.29")
escreval (" Consumo total no mês:     ", kwh:4:2," KW/h")
escreval (" _______________________________________________________________")
escreval (" Valor total a ser pago:   R$ ",(kwh*1.29):4:2)
outrocaso
escreval ("Nenhuma opção válida selecionada. Tente novamente.")
fimescolha
outrocaso
escreval ("Nenhuma opção válida selecionada. Tente novamente.")
fimse
fimescolha
fimalgoritmo
