package circle;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Circulo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("0.00");
		
		Double raio, area, perimetro;
		
		System.out.println("CÁLCULO DE ÁREA E PERÍMETRO\n");
		System.out.print("Inserir o valor do raio do Círculo (cm): ");
		raio = scan.nextDouble();
		
		area = Math.PI * raio * raio;
		
		perimetro = 2 * Math.PI * raio;
		
		
		System.out.println("A área deste círculo é de: "+form.format(area)+"cm e o perímetro é de "+form.format(perimetro)+"cm.");
		
	}
	
}
