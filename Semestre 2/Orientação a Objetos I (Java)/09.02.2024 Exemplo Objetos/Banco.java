package bank;

import java.util.Scanner;

class Banco {
    public static void main (String[] args) {
        Correntista obj1 = new Correntista();
        Correntista obj2 = new Correntista();

        obj1.nome = "Jorge Washington";
        obj1.idade = 50;
        obj1.telefone = "(51) 12345678";

        obj2.nome = "Brad Pitt";
        obj2.idade = 40;
        obj2.telefone = "(51) 87654321";

        obj1.imprimir();
        obj2.imprimir();


        Scanner leia = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Digite o nome: ");
        obj1.nome = leia.next();
        System.out.println("Digite a idade: ");
        obj1.idade = leia.nextInt();
        System.out.println("Digite o telefone: ");
        obj1.telefone = leia.next();
        System.out.println(" ");
        System.out.println("Dados do correntista:");
        obj1.imprimir();

        System.out.println(" ");
        System.out.println("Entre com um valor para depósito: ");
        obj1.depositar(leia.nextDouble());

        System.out.println(" ");
        System.out.println("Dados do correntista:");
        obj1.imprimir();

        System.out.println(" ");
        System.out.println("Entre com o valor para saque:");
        String retorno = obj1.sacar(leia.nextDouble());
        System.out.println(retorno);

    }
}