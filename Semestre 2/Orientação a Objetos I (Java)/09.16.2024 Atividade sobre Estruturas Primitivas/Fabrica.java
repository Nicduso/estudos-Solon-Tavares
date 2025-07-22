import java.util.Scanner;

class Fabrica {

    public static void main (String[] args){

        int tempo, hora, min, seg;

        Scanner leia = new Scanner(System.in);

        System.out.println("CONVERSÃO DE SEGUNDOS EM HORAS:");
        System.out.println("Digite o tempo do evento fabril em segundos:");
        tempo = leia.nextInt();

        hora = tempo / 3600;
        tempo = tempo % 3600;
        min = tempo / 60;
        seg = tempo % 60;

        System.out.println("O tempo em horas, minutos e segundos é: "+hora+":"+min+":"+seg);

    }

}