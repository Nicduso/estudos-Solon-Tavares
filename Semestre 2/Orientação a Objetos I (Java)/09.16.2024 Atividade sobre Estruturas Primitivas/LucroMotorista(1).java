//*Um motorista de taxi deseja calcular o rendimento de seu carro na praça. Sabe-se que o preço do combustível é de R$6,09, escreva um programa para ler: a marcação do odômetro (KM) no início do dia, a marcação do odômetro (KM) no final do dia, o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros. Calcular e escrever: a média do consumo em Km/l e o lucro líquido do dia.*//

import java.util.Scanner;

class LucroMotorista {

    public static void main (String[] args){

        Double comb = 6.09;
        Double kmi, kmf, litro, bruto, liquido, mediakm;

        Scanner leia = new Scanner(System.in);

        System.out.println("LUCRO MOTORISTA DIÁRIO:");
        System.out.println("Marcação do odômetro (KM) no INÍCIO do dia:");
        kmi = leia.nextDouble();
        System.out.println("Marcação do odômetro (KM) no FIM do dia:");
        kmf = leia.nextDouble();
        System.out.println("Litros de combustível gasto:");
        litro = leia.nextDouble();
        System.out.println("Total recebido dos passageiros no dia (Bruto):");
        bruto = leia.nextDouble();

        mediakm = litro * comb / (kmf - kmi);
        liquido = bruto - (litro * comb);

        System.out.println("<<<<<<<<<<<<<<<< Resultados >>>>>>>>>>>>>>>>");
        System.out.println("Média de consumo por quilômetro: R$"+mediakm);
        System.out.println("Lucro líquido do dia: "+liquido);

    }

}