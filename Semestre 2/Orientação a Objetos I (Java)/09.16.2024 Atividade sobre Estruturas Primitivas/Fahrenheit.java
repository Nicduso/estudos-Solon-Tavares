import java.util.Scanner;

class Fahrenheit {

    public static void main (String[] args){

        Double f;
        Double c;

        Scanner leia = new Scanner(System.in);

        System.out.println("CONVERTER FAHRENHEIT EM CELSIUS:");
        System.out.println("Digite os graus em Fahrenheit:");
        f = leia.nextDouble();

        c = (f - 32) * 5 / 9;

        System.out.println(f + "ºF são" + c + "ºC.");

    }
}
