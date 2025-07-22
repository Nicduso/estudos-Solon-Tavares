import java.util.Scanner;
class Sala {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Double larg, comp, resp;

        System.out.println("Digite a largura e o comprimento de uma sala para descobrir o m²:");
        System.out.println("Digite a largura:");
        larg = leia.nextDouble();

        System.out.println("Digite o comprimento:");
        comp = leia.nextDouble();

        resp = larg * comp;

        System.out.println("Os m² da sala é: "+resp);
    } 
}