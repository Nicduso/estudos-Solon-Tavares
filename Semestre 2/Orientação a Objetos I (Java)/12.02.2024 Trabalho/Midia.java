package catalogo;

import java.util.Scanner;

public class Midia {

    private int codigo;
    private Double preco;
    private String nome;
    private String tipo;

    public Midia(int c, Double p, String n, String t) {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
        this.tipo = t;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public Double getPreco() {
        return this.preco;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getDetalhes() {
        return "Detalhes do produto:\nNome: " + getNome() + "\nTipo: " + getTipo() + "\nCódigo: " + getCodigo() + "\nPreço: " + getPreco();
    }

    public void printDados() {
        System.out.println(getDetalhes());
    }

    public void inserirDados() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o código do produto: ");
        setCodigo(scan.nextInt());
        scan.nextLine();

        System.out.print("Insira o nome do produto: ");
        setNome(scan.nextLine());

        System.out.print("Insira o preço do produto: ");
        setPreco(scan.nextDouble());

    }
}