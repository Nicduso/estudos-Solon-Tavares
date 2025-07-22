package radious;

import java.util.Scanner;

class Calculo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Raio r1 = new Raio();
            
        System.out.println("CALCULAR O VOLUME DE UM CONE:");
        System.out.println("Digite respectivamente o raio e a altura do cone(cm):");
        r1.raio = scan.nextDouble();
        r1.altura = scan.nextDouble();

        r1.imprimir();
    }
}