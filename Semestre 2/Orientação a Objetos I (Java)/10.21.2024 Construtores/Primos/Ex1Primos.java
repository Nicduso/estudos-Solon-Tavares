import java.util.Scanner;

public class Ex1Primos {

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) { 
            if (numero % i == 0) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (ehPrimo(numero)) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        scanner.close();
    }
}
