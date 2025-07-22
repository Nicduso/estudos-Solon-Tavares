package loja;

import java.util.Scanner;

public class LojaVirtual {

    String produto[] = new String[5];
    Double preco[] = new Double[5];
    String cupom;
    Double valor;
    String carrinho = "Carrinho:";

    Scanner scan = new Scanner(System.in);

    public void menu() {
        int op = 0;
        
        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Adicionar produto ao carrinho");
            System.out.println("2 - Cadastrar produto");
            op = scan.nextInt();
    
            if (op == 1) {
                adicionar();
                } else if (op == 2) {
                    cadastrar();
                    } else {
                        System.out.println("Opção inválida");
                    }
        } while (op != 1 && op != 2);

    }


    public void cadastrar() {
        int i;

        System.out.println ("Cadastre 5 produtos!");

        for (i = 0; i < 5; i++) {
            System.out.println("Cadastre o "+i+1+"º produto:");
            System.out.print("Nome: ");
            this.produto[i] = scan.next();
            System.out.print("Preço: ");
            this.preco[i] = scan.nextDouble;
        }
    }

    public void desconto(){

        if (this.cupom == "desconto") {
            this.valor = this.valor - (this.valor * 0.25);
            System.out.println("Cupom aplicado!\n");
            } else {
            System.out.println("Cupom inválido.");
        }
    }

    public void miniMenu(){
        int op;

        System.out.println("Deseja adicionar mais itens à sua compra?");
        System.out.print("1 - Sim ou 2 - Não");
        op = scan.nextInt();

        if (op == 1) {
            adicionar();
        } else {
            compra();
        }

    }

    public void carrinho(){
        System.out.println ("Seu carrinho atual:");
        System.out.println(this.carrinho);
        System.out.println("Valor total: R$ "+this.valor);
    }

    public void adicionar(){
        
        int escolha, i;

        System.out.println("Escolha o produto para a compra: ");

        for (i = 0; i < 5; i++) {
            System.out.println(i+1+" - "+this.produto[i]);
        }
        escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Você adicionou "+this.produto[0]+" ao carrinho de compras.");
                this.carrinho = (this.carrinho+", "+this.produto[0]+"Valor: R$ "+this.preco[0]);
                this.valor = this.valor + this.preco[0];
            break;
            case 2:
                System.out.println("Você adicionou "+this.produto[1]+" ao carrinho de compras.");
                this.carrinho = (this.carrinho+", "+this.produto[1]+"Valor: R$ "+this.preco[1]);
                this.valor = this.valor + this.preco[1];
            break;
            case 3:
                System.out.println("Você adicionou "+this.produto[2]+" ao carrinho de compras.");
                this.carrinho = (this.carrinho+", "+this.produto[2]+"Valor: R$ "+this.preco[2]);
                this.valor = this.valor + this.preco[2];
            break;
            case 4:
                System.out.println("Você adicionou "+this.produto[3]+" ao carrinho de compras.");
                this.carrinho = (this.carrinho+", "+this.produto[3]+"Valor: R$ "+this.preco[3]);
                this.valor = this.valor + this.preco[3];
            break;
            case 5:
                System.out.println("Você adicionou "+this.produto[4]+" ao carrinho de compras.");
                this.carrinho = (this.carrinho+"\n"+this.produto[4]+"Valor: R$ "+this.preco[4]);
                this.valor = this.valor + this.preco[4];
            break;

            default:
                System.out.println("Opção inválida.");
        }
        miniMenu();

    }

    public void compra(){
        carrinho();
        
        System.out.print("\nDigite um cupom de desconto (caso não tenha, apenas digite 'n'):");
        this.cupom = scan.next();
        
        if (this.cupom == "n") {
            System.out.println("O valor total é R$ "+this.valor);
        } else { 
            desconto();
        }

        carrinho();
        
        System.out.println("Confirmar a compra?");
        System.out.println("1 - Sim ou 2 - Não");
        int op = scan.nextInt();

        switch (op) {
            case 1:
                System.out.println("Compra realizada com sucesso!");
            break;
            case 2:
                System.out.println("Compra cancelada.");
            break;
            default:
            System.out.println("Opção inválida.");
        }
    }

}