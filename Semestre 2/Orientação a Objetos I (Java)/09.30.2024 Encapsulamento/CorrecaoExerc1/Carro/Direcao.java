package car;

import java.util.Scanner;

class Direcao {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Carro car1 = new Carro();

        System.out.println("\n #### INFORMAÇÕES DO CARRO ####");
        System.out.print("Marca do Carro: ");
        car1.setMarca(scan.next());

        System.out.print("Modelo ou Ano: ");
        car1.setModelo(scan.next());

        System.out.println("\n #### CONTROLE SEU CARRO ####");

        System.out.println("Carro: "+car1.getMarca());
        System.out.println("Modelo: "+car1.getModelo());

        car1.controleVelocidade();

    }

}