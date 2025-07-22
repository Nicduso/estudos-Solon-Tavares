package hospital;
import java.util.Scanner;

class Consulta {

    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        Paciente pac1 = new Paciente();

        System.out.println ("Informe os dados do paciente: ");
        System.out.print ("Nome: ");
        pac1.setNome(scan.next());
        System.out.print("Idade: ");
        pac1.setIdade(scan.nextInt());

        pac1.consulta();

    }

}