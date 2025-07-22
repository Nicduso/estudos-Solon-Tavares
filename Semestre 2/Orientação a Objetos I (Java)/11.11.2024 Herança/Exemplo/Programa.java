package locadora;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        
        Carro carro = new Carro();
        Jipe jipinho = new Jipe();
        Utilitario util = new Utilitario();

        carro.setPlaca("C4RR05");
        carro.setModelo("Pálio");
        carro.setAr("Só o natural, quando abaixa o vidro.");

        jipinho.setPlaca("J1P3RE");
        jipinho.setModelo("Renegate");
        jipinho.setTracao("4X4");

        util.setPlaca("UT1L1T");
        util.setModelo("Fiorino");
        util.setCarga(200.0);

        System.out.println("<<<<< Imprimindo as informações: >>>>>");
        System.out.println("\nPlaca: " + carro.getPlaca() + "\nModelo: " + carro.getModelo() + "\nAr: " + carro.getAr());
        carro.buzina();
        System.out.println("\nPlaca: " + jipinho.getPlaca() + "\nModelo: " + jipinho.getModelo() + "\nTração: " + jipinho.getTracao());
        jipinho.buzina();
        System.out.println("\nPlaca: " + util.getPlaca() + "\nModelo: " + util.getModelo() + "\nCarga: " + util.getCarga());
        util.buzina();
        
    }

}