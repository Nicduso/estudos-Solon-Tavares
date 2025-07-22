package seres;

public class Animal {
    private String nome;
    private Int idade;
    private String som;

    public String getNome(){
        return this.nome;
    }

    public Int getIdade(){
        return this.idade;
    }

    public String getSom(){
        return this.som;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Int idade) {
        this.idade = idade;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public void som() {
        System.out.println("Som: "+this.som);
    }
    
    public void habilidade() {
        System.out.println("Habilidade: Este animal corre.");
    }



}