package bank;

import java.util.Scanner;

class Banco {
    public static void main (String[] args) {
        Correntista obj1 = new Correntista();
        Correntista obj2 = new Correntista();

        Scanner leia = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Digite o nome: ");
        obj1.setNome (leia.next());
        System.out.println("Digite a idade: ");
        obj1.setIdade (leia.nextInt());
        System.out.println("Digite o telefone: ");
        obj1.setTelefone(leia.next());
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

        System.out.println(" ");
        System.out.println("Imprindo o nome com 'GET':");
        System.out.println("Nome: "+obj1.getNome());

    }
}