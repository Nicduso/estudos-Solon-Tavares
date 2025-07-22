package escola;
import java.util.Scanner;
class MeuPrograma{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Aluno alu = new Aluno();
        String texto;

        System.out.println("Digite a nome:");
        alu.nome = leia.next();
        System.out.println("Digite a matricula:");
        alu.matricula = leia.nextInt();
        System.out.println("Digite as quatro notas:");
        alu.n1 = leia.nextDouble();
        alu.n2 = leia.nextDouble();
        alu.n3 = leia.nextDouble();
        alu.n4 = leia.nextDouble();

        texto = alu.calcMedia();
        System.out.println("Situação do aluno: "+alu.nome+" = "+texto);
    }
}