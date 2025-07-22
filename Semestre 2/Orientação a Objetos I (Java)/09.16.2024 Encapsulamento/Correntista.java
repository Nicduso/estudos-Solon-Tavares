package bank;

class Correntista {
    private String nome, telefone;
    private int idade;
    private Double saldo = 0.0;

    public void setNome(String nome) { //SET = INSERIR
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {   //GET = PEGAR
        return this.nome;
    }

    public void imprimir() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Saldo: "+this.saldo);
    }

    public void depositar(Double valor) {
        this.saldo = this.saldo + valor;
    }

    public String sacar(Double valor) {
        String texto;

        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            texto = "Saque efetuado com sucesso.";
        } else {
            texto = "Saldo insuficiente.";
        }
        return texto;
    }
}