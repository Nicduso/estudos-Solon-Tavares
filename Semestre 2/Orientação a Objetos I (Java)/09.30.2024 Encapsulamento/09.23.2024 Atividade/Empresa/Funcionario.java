package office;

class Funcionario {
    private String nome, cargo;
    private Double salarioBase;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCargo() {
        return this.cargo;
    }
    

    public void salarioLiquido() {
        Double inss, vt, salario;

        if(this.salarioBase < 2600) {
                inss = 0.08;
            } else {
                inss = 0.11;
            }

        inss = inss * this.salarioBase;

        if(this.salarioBase < 1600) {
            vt = 0.0;
        } else {
            vt = 0.06;
        }

        vt = vt * this.salarioBase;

        salario = (this.salarioBase + 800) - inss - vt;

        System.out.println("Salário Líquido: R$"+salario);

    }

}