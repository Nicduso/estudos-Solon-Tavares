algoritmo "exemplo_matriz"

var
    num: vetor[1..4,1..3] de inteiro
    negativo: vetor[1..12] de inteiro
    mult: vetor [1..12] de inteiro
    linha, coluna, menor, cont_n, cont_m: inteiro
inicio
      cont_n <- 0
      escreval
      escreval
      escreval("   Digite os 12 números inteiros para a matriz: ")
      escreval
      //carga da matriz
      para linha de 1 ate 4 faca
           escreval("           Linha: ", linha)
           para coluna de 1 ate 3 faca
                escreva("  Coluna: ")
                leia(num[linha,coluna])
           fimpara
      fimpara
      escreval
      escreval
      escreval("   Elementos da matriz: ")
      escreval
      //impressão da matriz
      para linha de 1 ate 4 faca
           escreval
           para coluna de 1 ate 3 faca
                escreva("   |",num[linha,coluna]:5)
           fimpara
           escreval(" |")
      fimpara
      escreval
      escreval("   5º Elemento da matriz: ", num[2,2])
      escreval("   10º Elemento da matriz: ", num[4,1])
      //pesquisar o menor elemento da matriz
      menor <- num[1,1]
      para linha de 1 ate 4 faca
          para coluna de 1 ate 3 faca
              se (num[linha, coluna] < menor) entao
                   menor <- num[linha,coluna]
              fimse
          fimpara
      fimpara
      escreval("   O menor elemento da matriz: ", menor)
      //criar um vetor com os elementos negativos da matriz carregada
      para linha de 1 ate 4 faca
          para coluna de 1 ate 3 faca
               se (num[linha,coluna]<0) entao
                    cont_n <- cont_n + 1
                    negativo[cont_n] <- num[linha, coluna]
               fimse
          fimpara
      fimpara
      escreval
      //impressão do vetor
      se (cont_n >0) entao
         escreval("    Vetor Negativo: ")
         escreva
         para linha de 1 ate cont_n faca
               escreval("      ",linha:3,"º: ", negativo[linha]:5)
         fimpara
      senao
          escreval("   Não foram inseridos elementos negativos.")
      fimse
      escreval
          cont_m <- 0
            para linha de 1 ate 4 faca
          para coluna de 1 ate 3 faca
               se (num[linha,coluna]<0) entao
                    cont_m <- cont_m + 1
                    mult[cont_m] <- num[linha, coluna]
               fimse
          fimpara
      fimpara
      
      se (cont_n >0) entao
         escreval("    Multiplicação dos Negativos: ")
         escreva
         para linha de 1 ate cont_n faca
               escreval("      ",linha:3,"º: ", negativo[linha]:5," X ",menor:5," = ", mult[linha]:5)
         fimpara
      fimse
fimalgoritmo
