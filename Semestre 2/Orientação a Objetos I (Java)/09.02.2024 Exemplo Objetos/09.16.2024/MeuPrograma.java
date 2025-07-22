package escola;
import java.util.Scanner;

class MeuPrograma {

    public static void main (String[] args) {

        Scanner leia = new Scanner(System.in);
        Aluno alu = new Aluno();

        System.out.println ("Digite o Nome: ");
        alu.nome = leia.next();

        System.out.println ("Digite a Matrícula: ");
        alu.matricula = leia.nextInt();

        System.out.println ("Digite as quatro notas do aluno:");
        alu.n1 = leia.nextDouble();
        alu.n2 = leia.nextDouble();
        alu.n3 = leia.nextDouble();
        alu.n4 = leia.nextDouble();

        System.out.println ("Situação do Aluno: "+alu.nome+" = "+alu.calcMedia());

    }

}