import java.util.Scanner;
class Raio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Double raio, resp, pi;

        System.out.println("Digite o valor do Raio de uma circunferência para descobrir o perímetro: ");
        raio = leia.nextDouble();

        pi = Math.PI;
        resp = raio * 2 * pi;

        System.out.println("O perímetro é: "+resp);
    } 
}