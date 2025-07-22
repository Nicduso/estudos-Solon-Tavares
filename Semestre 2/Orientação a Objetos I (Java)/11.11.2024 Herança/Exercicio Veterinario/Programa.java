package seres;

public class Programa {
    public static void main(String[] args) {

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

        Veterinario veterinario = new Veterinario();

        System.out.println("<<<<< Examinando os animais >>>>>");
        System.out.println("\nCachorro:");
        veterinario.examinar(dog);

        System.out.println("\nCavalo:");
        veterinario.examinar(pocoto);

        System.out.println("\nPreguiça:");
        veterinario.examinar(zzz);
    }
}