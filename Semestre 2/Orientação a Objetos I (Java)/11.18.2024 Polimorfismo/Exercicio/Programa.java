package seres;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args){

        Cachorro dog = new Cachorro();
        Cavalo pocoto = new Cavalo();
        Pregrica zzz = new Preguica();

        dog.setNome("Po");
        dog.setIdade(6);
        dog.setSom("Au! Au!");

        pocoto.setNome("Tapado");
        pocoto.setIdade(5);
        pocoto.setSom("Iiirrrrí!")

        zzz.setNome("Nico");
        zzz.setIdade(12);
        zzz.setSom("ZzZzZz");

        System.out.println("<<<<< Imprimindo >>>>>");
        

    }
}