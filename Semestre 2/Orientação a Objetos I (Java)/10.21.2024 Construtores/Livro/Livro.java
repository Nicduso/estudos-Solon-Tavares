package book;

import java.util.Scanner;

class Livro {

    Scanner scan = new Scanner(System.in);

    private String titulo, autor;
    private int page;
    private boolean disp = true;
    public int op;

    public Livro(String titulo, String autor, int page){
        this.titulo = titulo;
        this.autor = autor;
        this.page = page;
    }

    public void menu(){
        System.out.println("\nEscolha entre as seguintes opções:\n 1 - Emprestar o livro " + this.titulo + ".\n 2 - Devolver um livro.\n 3 - Verificar a disponibilidade do livro" + this.titulo + ".\n 4 - Encerrar programa.");
        System.out.print("Digite o número da opção: ");
        this.op = scan.nextInt();
    }

    public void emprestar(){

        if (disp == true){
            System.out.println("\nVocê pegou o livro "+this.titulo+" emprestado!");
            disp = false;
        } else {
            System.out.println("\nO livro "+this.titulo+" não está disponível, aguarde a devolução do mesmo.");
        }

    }

    public void devolver(){

        if (disp == false) {
            System.out.println("\nVocê devolveu o livro "+this.titulo+" com sucesso.");
            disp = true;
        } else {
            System.out.println("\nEste livro não foi emprestado para ser devolvido.");
        }

    }

    public void disponibilidade(){
        if(disp == false){
            System.out.println("\nO livro "+this.titulo+" não está disponível, aguarde a devolução do mesmo.");
        } else {
            System.out.println("\nO livro "+this.titulo+" está disponível, fique à vontade.");
        }
    }

    public void biblioteca(){

        while (this.op < 4) {

            menu();

            switch (this.op){
                
                case 1:
                    emprestar();
                break;

                case 2:
                    devolver();
                break;

                case 3:
                    disponibilidade();
                break;

                case 4:
                    System.out.println("\nObrigado(a)! Volte sempre.");
                break;

                default:
                    System.out.println("\nOpção inválida.");
                    this.op = 1;

            }

        }
    }


}