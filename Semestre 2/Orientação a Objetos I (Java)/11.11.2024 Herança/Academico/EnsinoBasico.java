package academy;

public class EnsinoBasico extends Funcionario {
    private String escola;

    public EnsinoBasico(String nome, int codigo, String escola) {
        super(nome, codigo);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 1.1; 
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Escola (Ensino Básico): " + escola);
    }
}
