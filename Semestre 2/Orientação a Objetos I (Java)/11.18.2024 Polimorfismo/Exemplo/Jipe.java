package locadora;

public class Jipe extends Veiculo {

    private String tracao;

    public String getTracao() {
        return this.tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    public void buzina() {
        System.out.println("Buzina: Bi! Bi!");
    }

}