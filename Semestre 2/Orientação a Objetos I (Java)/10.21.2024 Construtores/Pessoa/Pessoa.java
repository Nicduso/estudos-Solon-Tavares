package person;

public class Pessoa{

    private String nome, profissao;
    private int idade;

    public Pessoa(String nome, String profissao, int idade){
        this.nome = nome;
        this.profissao = profissao;
        this.idade = idade;
    }

    public void info(){
        System.out.println("Nome: "+this.nome+"\nProfissão: "+this.profissao+"\nIdade: "+this.idade+"\n");
    }

    public void idadeDias(){

        int tempo, bissexto;
        bissexto = this.idade / 4;
        tempo = this.idade * 365 + bissexto;

        System.out.println("Você tem "+tempo+" dias de vida, e passou por "+bissexto+" anos bissextos.");
    }


}