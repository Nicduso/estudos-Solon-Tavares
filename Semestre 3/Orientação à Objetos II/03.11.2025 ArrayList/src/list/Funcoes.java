package list;


import java.util.ArrayList;
import java.util.Scanner;


public class Funcoes {
    Scanner scan = new Scanner(System.in);
    ArrayList<Cliente> lista = new ArrayList<>();


    public void menu() {
        int op;
        do {
            System.out.println("\n*** SISTEMA DE GERENCIAMENTO ***");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Imprimir toda a lista");
            System.out.println("3 - Localizar e imprimir um nome");
            System.out.println("4 - Alterar dados");
            System.out.println("5 - Excluir pessoa");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");
            op = scan.nextInt();
            scan.nextLine(); // Consumir nova linha


            switch (op) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    imprimirLista();
                    break;
                case 3:
                    localizar();
                    break;
                case 4:
                    alterarDados();
                    break;
                case 5:
                    excluir();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (op != 0);
    }


    public void cadastrar() {
        Cliente cli = new Cliente();
        System.out.print("Nome: ");
        cli.setNome(scan.nextLine());
        System.out.print("Endereço: ");
        cli.setEnd(scan.nextLine());
        System.out.print("Telefone: ");
        cli.setFone(scan.nextInt());
        scan.nextLine();
        lista.add(cli);
        System.out.println("Pessoa cadastrada com sucesso!");
    }


    public void imprimirLista() {
        if (lista.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            for (Cliente c : lista) {
                System.out.println("\nNome: " + c.getNome() + "\nEndereço: " + c.getEnd() + "\nTelefone: " + c.getFone());
            }
        }
    }


    public void localizar() {
        System.out.print("Digite o nome a ser localizado: ");
        String nome = scan.nextLine();
        boolean encontrado = false;
        for (Cliente c : lista) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Pessoa encontrada!\nNome: " + c.getNome() + "\nEndereço: " + c.getEnd() + "\nTelefone: " + c.getFone());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Pessoa não encontrada.");
        }
    }


    public void alterarDados() {
        System.out.print("Digite o nome da pessoa que deseja alterar: ");
        String nome = scan.nextLine();
        for (Cliente c : lista) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                System.out.print("Novo endereço: ");
                c.setEnd(scan.nextLine());
                System.out.print("Novo telefone: ");
                c.setFone(scan.nextInt());
                scan.nextLine();
                System.out.println("Dados alterados com sucesso!");
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }


    public void excluir() {
        System.out.print("Digite o nome da pessoa que deseja excluir: ");
        String nome = scan.nextLine();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equalsIgnoreCase(nome)) {
                lista.remove(i);
                System.out.println("Pessoa excluída com sucesso!");
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }
}
