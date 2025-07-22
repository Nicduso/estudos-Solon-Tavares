package academy;

public class Programa {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("João", 1);
        EnsinoBasico func2 = new EnsinoBasico("Maria", 2, "Escola Municipal");
        EnsinoMedio func3 = new EnsinoMedio("Carlos", 3, "Escola Estadual");
        Graduacao func4 = new Graduacao("Ana", 4, "Colégio Elite", "Universidade Federal");

        System.out.println("<<< Funcionários >>>");
        func1.exibirInformacoes();
        System.out.println();
        func2.exibirInformacoes();
        System.out.println();
        func3.exibirInformacoes();
        System.out.println();
        func4.exibirInformacoes();
    }
}
