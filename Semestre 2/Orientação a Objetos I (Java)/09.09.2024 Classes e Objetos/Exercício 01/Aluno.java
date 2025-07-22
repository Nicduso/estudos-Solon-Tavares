package escola;
class Aluno{
    String nome;
    int matricula;
    Double n1, n2, n3, n4;
    Double media;

    public String calcMedia(){
        String situacao;
        this.media = (n1+n2+n3+n4)/4;
        if(this.media >= 6){
            situacao = "Aprovado";
        }else{
            situacao = "Reprovado";
        }
        return situacao;
    }
}