package academy;

public class Graduacao extends EnsinoMedio {
    private String universidade;

    public Graduacao(String nome, int codigo, String escola, String universidade) {
        super(nome, codigo, escola);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 2.0;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Universidade: " + universidade);
    }
}
