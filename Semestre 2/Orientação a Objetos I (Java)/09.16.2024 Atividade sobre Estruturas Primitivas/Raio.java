import java.util.Scanner;

class Raio {

    public static void main (String[] args){

        Double raio, altura, volume;

        Scanner leia = new Scanner(System.in);

        System.out.println("CALCULAR O VOLUME DE UM CONE:");
        System.out.println("Digite respectivamente o raio e a altura do cone:");
        raio = leia.nextDouble();
        altura = leia.nextDouble();

        volume = (Math.PI * raio * altura) / 3;

        System.out.println("O volume do cone é: "+volume);

    }
}