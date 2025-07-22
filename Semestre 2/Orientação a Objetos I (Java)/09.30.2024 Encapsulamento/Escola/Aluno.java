package school;

class Aluno {
    private String nome;
    private int matricula; 
    Double n1, n2, n3, n4;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMat(int mat) {
        this.matricula = mat;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public void setN3(Double n3) {
        this.n3 = n3;
    }

    public void setN4(Double n4) {
        this.n4 = n4;
    }
    
    public String getNome() {
        return this.nome;
    }

    public int getMat() {
        return this.matricula;
    }

    public void media() {
        String resultado;
        Double med = (this.n1 + this.n2 + this.n3 + this.n4) / 4;

        if (med >= 6) {
            resultado = "Aprovado.";
        } else {
            resultado = "Reprovado.";
        }

        System.out.println("Média: "+med);
        System.out.println(resultado);

    }
}