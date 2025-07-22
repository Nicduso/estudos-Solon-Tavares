package escola;
import java.util.Scanner;
class CalcMedia{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome:");
        aluno.setNome(leia.next());
        System.out.println("Digite a matricula:");
        aluno.setMatricula(leia.nextInt());
        System.out.println("Digite 4 notas:");
        aluno.setN1(leia.nextDouble());
        aluno.setN2(leia.nextDouble());
        aluno.setN3(leia.nextDouble());
        aluno.setN4(leia.nextDouble());

        System.out.println("<<<<<<<<<<<< Imprimindo dados >>>>>>>>>>>>>");
        System.out.println("Nome: "+aluno.getNome()+", Matricula: "+aluno.getMatricula());
        aluno.media();
    }
}