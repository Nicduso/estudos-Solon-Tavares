package academy;

public class Funcionario {
    private String nome;
    private int codigo;
    private double rendaBasica = 1000.0;

    public Funcionario(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double calcularRenda() {
        return rendaBasica;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.printf("Renda Total: R$ %.2f%n", calcularRenda());
    }
}
