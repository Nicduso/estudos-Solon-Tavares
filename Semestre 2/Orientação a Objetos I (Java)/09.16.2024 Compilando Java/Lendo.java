import java.util.Scanner;
class Lendo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Double num1, num2, resp;

        System.out.println("Digite o primeiro valor:");
        num1 = leia.nextDouble();

        System.out.println("Digite o segundo valor:");
        num2 = leia.nextDouble();

        resp = num1 + num2;

        System.out.println("A soma é: "+resp);
    } 
}