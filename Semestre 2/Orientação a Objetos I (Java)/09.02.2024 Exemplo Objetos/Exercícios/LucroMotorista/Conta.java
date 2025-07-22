package renda;

class Conta {
    Double comb = 6.09;
    Double kmi, kmf, litro, bruto, liquido, mediakm;

    public void coleta() {
        this.mediakm = this.litro * this.comb / (this.kmf - this.kmi);
        this.liquido = this.bruto - (this.litro * this.comb);
    }

    public void imprimir() {
        coleta();
        System.out.println("<<<<<<<<<<<<<<<< Resultados >>>>>>>>>>>>>>>>");
        System.out.println("Média de consumo por quilômetro: R$"+this.mediakm);
        System.out.println("Lucro líquido do dia: "+this.liquido);
    }
        
}