package product;

class Produto {

    private String nome;
    private Double preco;
    private int qtd;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public void setQtd(int qtd){
        this.qtd = qtd;
    }

    public String getNome(){
        return this.nome;
    }

    public int getQtd(){
        return this.qtd;
    }
    
    public void Estoque(){
        Double vestoque;
        vestoque = this.preco * this.qtd;

        System.out.println("Total em estoque: R$"+vestoque);

    }

    public void Cadastro(){

    }

}