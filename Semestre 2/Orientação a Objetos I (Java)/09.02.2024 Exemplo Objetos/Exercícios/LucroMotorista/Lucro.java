package renda;
import java.util.Scanner;

class Lucro {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Conta ct = new Conta();

    System.out.println("LUCRO MOTORISTA DIÁRIO:");

    System.out.println("Marcação do odômetro (KM) no INÍCIO do dia:");
        ct.kmi = scan.nextDouble();

    System.out.println("Marcação do odômetro (KM) no FIM do dia:");
        ct.kmf = scan.nextDouble();

    System.out.println("Litros de combustível gasto:");
        ct.litro = scan.nextDouble();

    System.out.println("Total recebido dos passageiros no dia (Bruto):");
        ct.bruto = scan.nextDouble();

    ct.imprimir();

    }
}