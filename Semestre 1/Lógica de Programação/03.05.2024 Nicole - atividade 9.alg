algoritmo "problema_9"
// Função : Um motorista de taxi deseja calcular o rendimento de seu carro na praça.
// Autor : Nicole
// Data : 05/03/2024
// Seção de Declarações 
var

combus, kmi, kmf, litros, pago, gasto, medkm, medcons, lucro: real


inicio

combus <- 5.79
escreval ("- CÁLCULO DO CONSUMO DE COMBUSTÍVEL EM RELAÇÃO AO LUCRO DO TÁXI - ")
escreval
escreva ("Informe a quilometragem inicial do Táxi: ")
leia (kmi)
escreva ("Informe a quilometragem final do Táxi: ")
leia (kmf)
escreva ("Quantos litros foram consumidos para este percurso: ")
leia (litros)
escreva ("Qual o total recebido pelos passageiros (R$): ")
leia (pago)

gasto <- litros*combus
medkm <- kmf-kmi
medcons <- medkm/gasto
lucro <- pago-gasto

escreval
escreval ("##################")
escreval
escreval ("A média do consumo em KM/L é de: R$",medcons)
escreval ("O lucro líquido do dia foi de: R$ ",lucro)
escreval
escreval ("O total consumido nesta viagem foi: R$ ",gasto)

fimalgoritmo
