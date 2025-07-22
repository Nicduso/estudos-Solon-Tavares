package catalogo;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Midia[] lista = new Midia[10];
        int opcao;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite 1 para CD e 2 para DVD:");
            opcao = in.nextInt();
            in.nextLine(); 

            if (opcao == 1) {
                lista[i] = new CD(0, 0.0, "", 0, "CD"); 
            } else if (opcao == 2) {
                lista[i] = new DVD(0, 0.0, "", 0, "DVD");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
                i--;
                continue;
            }

            lista[i].inserirDados(); 
        }

        System.out.println("\nDados das mídias cadastradas:");
        for (int i = 0; i < 2; i++) {
            lista[i].printDados(); 
            System.out.println("------------------------------");
        }
    }
}



