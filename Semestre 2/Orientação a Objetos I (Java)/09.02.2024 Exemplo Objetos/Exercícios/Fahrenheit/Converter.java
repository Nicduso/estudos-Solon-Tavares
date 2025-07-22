package fahrenheit;

import java.util.Scanner;

class Converter {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Graus fah = new Graus();

        System.out.println("CONVERTER FAHRENHEIT EM CELSIUS:");
        System.out.println("Digite os graus em Fahrenheit:");
        fah.f = leia.nextDouble();
        fah.imprimir();
    }
}