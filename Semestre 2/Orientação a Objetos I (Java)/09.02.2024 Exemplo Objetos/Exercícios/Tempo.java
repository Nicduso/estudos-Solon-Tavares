package fabril;
import java.util.Scanner;

class Tempo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Fabrica t = new Fabrica();

        System.out.println("CONVERSÃO DE SEGUNDOS EM HORAS:");
        System.out.println("Digite o tempo do evento fabril em segundos:");
        t.tempo = leia.nextInt();

        t.imprimir();
    }
}