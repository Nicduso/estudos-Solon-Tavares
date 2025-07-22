package office;

class Funcionario {
    private String nome, cargo;
    private Double salarioBase, comissao, repouso;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public void setRepouso(Double repouso) {
        this.repouso = repouso;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCargo() {
        return this.cargo;
    }
    

    public void salarioLiquido() {
        Double inss, salario;

        if(this.salarioBase <= 1412) {
            inss = 0.075;
        } if(this.salarioBase <= 2666.68) {
            inss = 0.09;
        } if(this.salarioBase <= 4000.03) {
            inss = 0.12;
        } else {
            inss = 0.14;
        }

        inss = inss * this.salarioBase;

        salario = (this.salarioBase + this.comissao + this.repouso) - inss;

        System.out.println("Salário Líquido: R$"+salario);

    }

}