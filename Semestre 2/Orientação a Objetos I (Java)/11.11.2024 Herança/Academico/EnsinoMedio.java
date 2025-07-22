package academy;

public class EnsinoMedio extends EnsinoBasico {

    public EnsinoMedio(String nome, int codigo, String escola) {
        super(nome, codigo, escola);
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 1.5; 
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }
}
