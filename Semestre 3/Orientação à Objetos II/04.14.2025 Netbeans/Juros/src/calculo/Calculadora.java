package calculo;

public class Calculadora {
    private String nome;
    private Double juros;
    private Double capital;
    private Double i;
    private Double tempo;
    private Double montante;
    
    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public Double getI() {
        return i;
    }

    public void setI(Double i) {
        this.i = i;
    }

    public Double getTempo() {
        return tempo;
    }

    public void setTempo(Double tempo) {
        this.tempo = tempo;
    }

    public Double getMontante() {
        return montante;
    }

    public void setMontante(Double montante) {
        this.montante = montante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void calcular() {
        this.juros = this.capital * ((this.i * this.tempo * 12) / 100);
        this.montante = this.capital + this.juros;
    }

}

