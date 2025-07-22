package empresa;
import java.util.Scanner;
public class Programa{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Funcionario func = new Funcionario();

        System.out.println("Digite o nome: ");
        func.setNome(leia.next());
        System.out.println("Digite o salário:");
        func.setSalario(leia.nextDouble());
        System.out.println("Digite o cargo:");
        func.setCargo(leia.next());

        System.out.println("Nome: "+func.getNome()+" Salário bruto: "+func.getSalario());

        func.descontos();
        func.beneficio();

        System.out.println("Nome: "+func.getNome()+" Salário líquido: "+func.getSalario());
    }
}