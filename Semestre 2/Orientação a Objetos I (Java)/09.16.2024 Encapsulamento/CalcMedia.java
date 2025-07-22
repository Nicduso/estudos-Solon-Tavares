package school;

import java.util.Scanner;

class CalcMedia {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);
        AlunoE aluno = new AlunoE();

        System.out.println("Digite o nome do Aluno:");
        aluno.setNome(leia.next());
        System.out.println("Digite a matrícula:");
        aluno.setMatricula(leia.nextInt());
        System.out.println("Digite as quatro notas do aluno:");
        aluno.setN1(leia.nextDouble());
        aluno.setN2(leia.nextDouble());
        aluno.setN3(leia.nextDouble());
        aluno.setN4(leia.nextDouble());

        System.out.println("############# IMPRIMINDO DADOS #############");
        System.out.println("Nome: "+aluno.getNome()+", Matrícula: "+aluno.getMatricula());
        aluno.media();

    }
}