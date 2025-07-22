package product;

import java.util.Scanner;

class Estoque {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Produto prod1 = new Produto();

        System.out.println("## Cadastro de Produto ##");

        System.out.print("Produto: ");
        prod1.setNome(scan.next());
        System.out.print("Preço Unitário: ");
        prod1.setPreco(scan.nextDouble());
        System.out.print("Quantidade: ");
        prod1.setQtd(scan.nextInt());

        System.out.println("## Consultar Produto ##");
        System.out.println("Produto: "+prod1.getNome());
        System.out.println("Quantidade: "+prod1.getQtd());
        prod1.Estoque();

    }
}