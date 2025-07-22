package catalogo;

import java.util.Scanner;

public class DVD extends Midia {
    
    private int faixa;

    public DVD(int c, Double p, String n, int f, String t) {
        super(c, p, n, t);
        this.faixa = f;
    }

    public int getFaixa() {
        return faixa;
    }

    public void setFaixa(int f) {
        this.faixa = f;
    }

    public String Tipo(String tipo) {
        tipo = "faixas";        
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo("DVD");
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "\nFaixa: " + faixa;
    }

    @Override
    public void inserirDados() {

        Scanner scan = new Scanner(System.in);

        super.inserirDados();

        System.out.print("Insira o número de faixas do produto: ");
        setFaixa(scan.nextInt());

    }

}



