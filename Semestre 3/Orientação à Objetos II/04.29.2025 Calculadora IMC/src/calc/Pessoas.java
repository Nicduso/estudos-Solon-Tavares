package calc;

public class Pessoas {
    
    private String nome;
    private String sexo;
    private Double altura;
    private Double peso;
    private Double imc;
    private String resultado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getImc() {
        return imc;
    }

    public String getResultado() {
        return resultado;
    }

    public void imc() {
        this.imc = this.peso / (this.altura * this.altura);

        if (this.sexo.equals("Masculino")) {
            if (this.imc < 22) {
                this.resultado = "Abaixo do peso";
            } else if (this.imc < 27) {
                this.resultado = "Peso normal";
            } else if (this.imc < 30) {
                this.resultado = "Sobrepeso";
            } else if (this.imc < 35) {
                this.resultado = "Obesidade grau I";
            } else if (this.imc < 40) {
                this.resultado = "Obesidade grau II (severa)";
            } else {
                this.resultado = "Obesidade grau III (mórbida)";
            }
        } else {
            if (this.imc < 22) {
                this.resultado = "Abaixo do peso";
            } else if (this.imc < 27) {
                this.resultado = "Peso normal";
            } else if (this.imc < 32) {
                this.resultado = "Sobrepeso";
            } else if (this.imc < 37) {
                this.resultado = "Obesidade grau I";
            } else if (this.imc < 42) {
                this.resultado = "Obesidade grau II (severa)";
            } else {
                this.resultado = "Obesidade grau III (mórbida)";
            }
        }
    }
}