package seres;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args){

        Cachorro dog = new Cachorro();
        Cavalo pocoto = new Cavalo();
        Preguica zzz = new Preguica();

        dog.setNome("Po");
        dog.setIdade(6);
        dog.setSom("Au! Au!");

        pocoto.setNome("Tapado");
        pocoto.setIdade(5);
        pocoto.setSom("Iiirrrrí!");

        zzz.setNome("Nico");
        zzz.setIdade(12);
        zzz.setSom("ZzZzZz");

        System.out.println("<<<<< Imprimindo >>>>>");

        System.out.println("\nCachorro:\nNome:" + dog.getNome() + "\nIdade:" + dog.getIdade() + "\nSom:" + dog.getSom());
        dog.habilidade();
        System.out.println("\nCavalo:\nNome:" + pocoto.getNome() + "\nIdade:" + pocoto.getIdade() + "\nSom:" + pocoto.getSom());
        pocoto.habilidade();
        System.out.println("\nPreguiça:\nNome:" + zzz.getNome() + "\nIdade:" + zzz.getIdade() + "\nSom:" + zzz.getSom());
        zzz.habilidade();

    }
}