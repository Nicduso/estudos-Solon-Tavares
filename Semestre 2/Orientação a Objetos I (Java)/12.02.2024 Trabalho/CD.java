package catalogo;

import java.util.Scanner;

public class CD extends Midia {

    private int nMusicas;

    public CD(int c, Double p, String n, int m, String t) {
        super(c, p, n, t);
        this.nMusicas = m;
    }

    public int getMusicas() {
        return nMusicas;
    }

    public void setMusicas(int musicas) {
        this.nMusicas = musicas;
    }

    public String Tipo(String tipo) {
        tipo = "músicas";        
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo("CD");
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "\nMúsica: " + nMusicas;
    }

    @Override
    public void inserirDados() {

        Scanner scan = new Scanner(System.in);

        super.inserirDados();

        System.out.print("Insira o número de músicas do produto: ");
        setMusicas(scan.nextInt());

    }

}