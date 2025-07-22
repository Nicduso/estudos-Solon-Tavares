package office;

import java.util.Scanner;

class Salario {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Funcionario fun1 = new Funcionario();

        System.out.println("#### SALÁRIO LÍQUIDO ####");
        System.out.print("Nome do funcionário: ");
        fun1.setNome(scan.next());

        System.out.print("Cargo: ");
        fun1.setCargo(scan.next());

        System.out.print("Salário Base: ");
        fun1.setSalario(scan.nextDouble());

        System.out.println("#### RESULTADO ####");
        System.out.println("Funcionário: "+fun1.getNome());
        System.out.println("Cargo: "+fun1.getCargo());

        fun1.salarioLiquido();

    }

}