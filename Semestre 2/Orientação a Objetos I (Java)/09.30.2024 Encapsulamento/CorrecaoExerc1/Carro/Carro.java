package car;

import java.util.Scanner;

class Carro {

    private String marca, modelo;
    private int vatual = 0;

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setVelocidade(int velocidade){
        this.vatual = velocidade;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void controleVelocidade(){

        int direcao = 1;
        Scanner scan = new Scanner(System.in);

        while (direcao < 3) {

            System.out.println ("Escolha o que fazer: \n - 1 = acelerar o carro; \n - 2 = desacelerar o carro; \n - 3 = freiar e sair do programa.");
            System.out.print ("Opção: ");
            direcao = scan.nextInt();

            if (direcao == 1){

                this.vatual = this.vatual + 10;

                if (this.vatual >= 300){
                    System.out.println ("\n ## O carro atingiu o limite máximo de 300 Km/h. ## \n");
                    this.vatual = 300;

                } else {

                    System.out.println ("\n ## A velocidade atual do carro é de "+this.vatual+" Km/h. ## \n");
                }

            } else {

                if (direcao == 2){

                    this.vatual = this.vatual - 10;

                    if (this.vatual <= 1){
                        System.out.println ("\n ## O carro está parado, pois atingiu a velocidade zero (0 Km/h). ## \n");
                        this.vatual = 0;

                    } else {

                        System.out.println ("\n ## A velocidade atual do carro é de "+this.vatual+" Km/h. ## \n");
                    }
                }
            }

        }
        
        System.out.println ("\n ## Você estacionou com sucesso. Até a próxima. ## \n");

    }

}