algoritmo "problema_9"
// Fun��o : Um motorista de taxi deseja calcular o rendimento de seu carro na pra�a.
// Autor : Nicole
// Data : 05/03/2024
// Se��o de Declara��es 
var

combus, kmi, kmf, litros, pago, gasto, medkm, medcons, lucro: real


inicio

combus <- 5.79
escreval ("- C�LCULO DO CONSUMO DE COMBUST�VEL EM RELA��O AO LUCRO DO T�XI - ")
escreval
escreva ("Informe a quilometragem inicial do T�xi: ")
leia (kmi)
escreva ("Informe a quilometragem final do T�xi: ")
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
escreval ("A m�dia do consumo em KM/L � de: R$",medcons)
escreval ("O lucro l�quido do dia foi de: R$ ",lucro)
escreval
escreval ("O total consumido nesta viagem foi: R$ ",gasto)

fimalgoritmo
